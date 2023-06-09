/* This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;
import java.util.List;

class DrivableTrader extends Trader{
    private List<Trader> inventory;
    private List<Trader> wishlist;
    private int money;

    public DrivableTrader(List<Trader> inventory, List<Trader> wishlist,
                          int money){
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int money){
        super(money);
    }

    public int getSellingPrice(Object item){
        if (item instanceof Tradable){
            return ((Tradable) item).getPrice() + ((Drivable) item).getMaxSpeed();
        }else{
            return Tradable.MISSING_PRICE;
        }
    }
}