import java.util.Scanner;

public class Player{
    /*Reference instance variable
    - myLocation contains a reference to a Location
    object passed into the constructor */
    private Location mylocation;
    /*Simple instance variable
    - name contains a String with the Player name */
    private String name;

    /* Constructor
    - Two parameters contain the player name and location
    - Set name and myLocation to the passed in values */
    public Player(String name, Location mylocation){
        this.name = name;
        this.mylocation = mylocation;
    }
    /*setName(int)
    setter for name attribute */
    public void setName(String n) {
        this.name = n;

    }

    /*getName()
    Getter for name attribute */
    public String getName() {
        return name;
    }

    /*setMyLocation(Location)
    setter for myLocation attribute */
    public void setMyLocation(Location mylocation){
        this.mylocation = mylocation;
    }

    /*getMyLocation()
    Getter for myLocation attribute */
    public Location getMyLocation() {
        return mylocation;
    }

    public int getLocationNumber() {
        return mylocation.getlocationNumber();
    }

    /*
    toString()
    - Returns a String containing the player name and
    current
    - Example: Pat is at Location #0: Admissions
    */

    public boolean takeTurn(Shaker theShaker){

        Scanner input = new Scanner(System.in);
        System.out.printf("%s's turn at %s. \n", name, mylocation.getName());
        System.out.print("    Press Enter to shake the dice...");
        input.nextLine();

        theShaker.shake();
        System.out.println("   " + theShaker);
        if(theShaker.isEven() == true){
            System.out.println("    Sum is even!");
            return true;
        }else{
            return false;
        }
    }// end takeTurn

    public String toString() {
        return name + " is at " + mylocation;
    }

}