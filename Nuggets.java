
/**
 * Write a description of class Nuggets here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nuggets
{
    public int size;// instance variables - replace the example below with your own
    public String sauce;
    public int sauceCount;
    
    public boolean wellDone = false;
    public boolean askMe = false;


    /**
     * Constructor for objects of class Nuggets
     */
    public Nuggets(int s, String condiment)
    {
       size = s;
       sauce = condiment;
       if (size == 4) {
           sauceCount = 1;
        }
       if (size == 6)
            sauceCount = 1;
       if (size == 10)
            sauceCount = 2;
       if (size == 20)
            sauceCount= 3;
          
        
      
    }
    public void askMe() {
        askMe = true;
    }
    public void wellDone() {
        wellDone = true;
    }
}   
