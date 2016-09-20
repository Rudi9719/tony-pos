import java.util.*;
/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger
{
     public boolean bun = true;
     public String[] bunTypes = {"RegBun", "Sesame", "MacBun", "ArtisanRoll"};
     public int bunType;
     
     public boolean meat = true;
     public String meatSize;
     public int meatCount;
     public int cheeseCount = 1;
     public boolean salted = true;
     public boolean seasonedBeef = false;
     public boolean wellDone = false;
     public boolean askMe = false;
    
     public boolean hasCheese = true;
     public boolean hasLettuce = false;
     public boolean hasOnion = true;
     public boolean hasPickle = true; 
     public boolean hasTomato = false;
     public boolean hasBacon = false;
     
     
     
     public String[] cheeseTypes = {"American", "White Cheddar", "Cheddar Jack", "Swiss"};
     public int cheeseType = 0;
     public String[] lettuceTypes = {"Shredded Lettuce", "Leaf Lettuce" }; 
     public int lettuceType;
     public String[] onionTypes = {"Dehydrated", "Slivered", "Grilled"};
     public int onionType;
     public String[] sauces = {"Ketchup", "Mayo", "Ranch", "Mustard", "Vinegrette", "Garlic",
                                "Mac Sauce", "Rice Vinegar", "Tartar" };
     public int[] saucesChosen = new int[15];
        
     public ArrayList<String> flags;
     
     public String receiptPrint;
     
    /**
     * Constructor for objects of class Burger
     */
    public Burger()
    {
        return;
    }
    
    
    public void makeBigMac() {
        bunType = 2;
        meatSize = "10:1";
        meatCount = 2;
        saucesChosen[0] = 6;
        hasLettuce = true;
        lettuceType = 0;
        onionType = 0;
      
    }
    public void makeCheeseburger() {
        bunType = 0;
        meatSize = "10:1";
        meatCount = 1;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 0;
       
    }
    public void makeQuarterPounder() {
        bunType = 1;
        meatSize = "4:1";
        meatCount = 1;
        cheeseCount = 2;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 1;
    
    }
    public void makeDoubleQuarterPounder() {
        bunType = 1;
        meatSize = "4:1";
        meatCount = 2;
        cheeseCount = 2;
       saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 1;
    
    }
    public void makeClubhouseQuarter(){
        bunType = 3;
        meatSize = "4:1";
        meatCount = 1;
        saucesChosen[0] = 6;
        cheeseType = 1;
        hasLettuce = true;
        lettuceType = 1;
        hasTomato = true;
        hasBacon = true;
        onionType = 2;
        seasonedBeef = true;
        
    }
    public void makeQuarterHamburger(){
        bunType = 1;
        meatSize = "4:1";
        meatCount = 1;
        hasCheese = false;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 1;
        
       
    }
    public void makeHamburger(){
        bunType = 0;
        meatSize = "10:1";
        meatCount = 1;
        hasCheese = false;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 0;
    }
    public void makeMcDouble(){
        bunType = 0;
        meatSize = "10:1";
        meatCount = 2;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 0;
    }
    public void makeDoubleCheeseburger(){
        bunType = 0;
        meatSize = "10:1";
        meatCount = 2;
        cheeseCount = 2;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 0;
    }
    public void makeTripleCheeseburger(){
        bunType = 0;
        meatSize = "10:1";
        meatCount = 3;
        cheeseCount = 2;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 0;
    }
    public void makeBaconMcDouble(){
        bunType = 0;
        meatSize = "10:1";
        meatCount = 2;
        hasBacon = true;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 0;
    }
    public void makeDoubleHamburger(){
        bunType = 0;
        meatSize = "10:1";
        meatCount = 2;
        hasCheese = false;
        saucesChosen[0] = 0;
        saucesChosen[1] = 3;
        onionType = 0;
    }
    public void addExtraFlag(String flag) {
        flags.add(flag);
    }
    public String recipt() {
        String ret = receiptPrint;
        
        
        return ret;
    }
    
    /**
     {"American", "White Cheddar", "Cheddar Jack", "Swiss"};
     {"Shredded Lettuce", "Leaf Lettuce" }; 
     {"Dehydrated", "Slivered", "Grilled"};
     {"Ketchup", "Mayo", "Ranch", "Mustard", "Vinegrette", "Garlic",
              "Mac Sauce", "Rice Vinegar", "Tartar" };
     */
}
