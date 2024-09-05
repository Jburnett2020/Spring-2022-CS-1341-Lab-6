

public class Campus{
    /*Reference instance variable
    - locations is an array to contain 7 instances of Location*/ 
    Location[] buildings;
    /*
    Constructor
    - Create the locations array
    - Create 7 Location objects and put in each of the seven 
    slots in the array. (Use name/numbers in sample output)
    */
    public Campus() {
      buildings = new Location[7];
      buildings[0] = new Location("Admissions",0);
      buildings[1] = new Location("Cox School of Business",1);
      buildings[2] = new Location("Dedman College",2);
      buildings[3] = new Location("Simmons Schools of Education",3);
      buildings[4] = new Location("Meadows School of the Arts",4);
      buildings[5] = new Location("Lyle School of Engineering",5);
      buildings[6] = new Location("Moody",6);
    }

    /*Using x as an index number in the locations array, return 
    the Location object at that index # */
    public Location getStartLocation() {
        return buildings[0];
    }

    //Returns the Location object at index # 0
    public Location getLocation(int x){
        return buildings[x];

    }
    /*Returns a String containing the String representation of 
    all seven locations in the array (hint: use a loop to 
    build the String containing all Location objects in the 
    array)*/
    public String toString() {
    
        String w = "Campus: \n";
        for(int i = 0; i <= 6; i++){
            w = w + buildings[i].toString();
        }
        return w;
        
    }
}