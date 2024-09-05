import java.util.Scanner;

public class Game{
    /*Reference instance variables
    - players contains an array of Player objects
    - theCampus contains a reference to a Campus object*/
    Player[] players;
    Campus theCampus;
    Scanner userinput = new Scanner(System.in);
    /*
    Constructor
    - Create a Campus object and assign to theCampus variable
    - Call the createPlayers method
    */
    public Game(){
        theCampus = new Campus();
        createPlayer();
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