import java.util.Scanner;

public class GraduationGame{
    /*Reference instance variables
    - players contains an array of Player objects
    - theCampus contains a reference to a Campus object
    - Add a third reference instance variable named theShaker
    referencing one Shaker object
    */
    Player[] players;
    Campus theCampus;
    Scanner userinput = new Scanner(System.in);
    Shaker theShaker;
    
    public GraduationGame(){
        theCampus = new Campus();
        createPlayer();
        theShaker = new Shaker();
    }

    public static void main(String[] args){
        GraduationGame theGame = new GraduationGame();
        theGame.playGame();
    }

    /*createPlayers()
    - Create Player array of size 2 and assign to players
    variable
    - Use java.util.Scanner to prompt for the two Player name
    Strings
    - Send getStartLocation to theCampus, which will return the
    Location object that is the starting point of the game
    - Create two Player objects using the name entered by the
    user and the Location object returned by theCampus. Pass
    both to the Player constructor
    - Put each of the newly created Player objects in the
    players array */
    public void createPlayer(){
        players = new Player[2];
        System.out.print("Enter player 1's name: ");
        String playerOneName = userinput.next();
        
        System.out.print("Enter player 2's name: ");
        String playerTwoName = userinput.next();
        Location start = theCampus.getStartLocation();
        players[0] = new Player(playerOneName, start);
        players[1] = new Player(playerTwoName, start);
    }

    public void playGame(){
        boolean gameOver = false;
        while(gameOver == false){
            for(int i = 0 ; i < players.length; i++){
                Player aPlayer = players[i];
                boolean advance = aPlayer.takeTurn(theShaker);
                if(advance == false){
                    System.out.printf("    %s is stuck\n",aPlayer.getName());
                } else {
                    //get player's current location number
                    int locNum = aPlayer.getLocationNumber();
                    //increment locNum to advance
                    locNum++;
                    if (locNum == 6){
                        gameOver = true;
                        System.out.printf("Game over! %s is the winner!\n",aPlayer.getName());
                        break; //break out of playing for loop
                    } else {
                        Location newLoc = theCampus.getLocation(locNum);
                        aPlayer.setMyLocation(newLoc);
                        System.out.printf("   %s is now at %s\n", aPlayer.getName(),newLoc.getName());
                    }
                }// end else advance == false
            }// end for loop
        }//end while loop

    }//end playGame

    /*
    toString()
    - Returns a String containing the String representation of
    both Player objects in the players array with their
    location
    */
    public String toString() {
        return "Graduation Game: \n" + players[0].toString() + players[1].toString();
    }
}