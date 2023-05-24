/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.*;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* If the ID string does not appear as a key
     * in drivable_map, then add the pair to drivable_map.
     * Return true if the Drivable was added to drivable_map.
     */
    public Boolean addDrivable(String id, Drivable drivable){
        if (drivable_map.containsKey(id)){
            return false;
        }else{
            drivable_map.put(id, drivable);
            return true;
        }
    }



    /* Returns true iff there is at least one item in drivable_map
     * that has a maxSpeed >= the speed given.
     */
    public Boolean hasFasterThan(int speed){
        Collection<Drivable> values = drivable_map.values();
        for (Drivable value: values){
            if (value.getMaxSpeed() >= speed){
                return true;
            }
        }
        return false;
    }



    /* returns a List containing all of the Tradable items in
     * drivable_map.
     */
    public List getTradable(){
        List<Drivable> tradableList = new ArrayList<>();
        Collection<Drivable> values = drivable_map.values();
        for (Drivable value: values){
            if (value instanceof Tradable){
                tradableList.add(value);
            }
        }
        return  tradableList;
    }


    
}