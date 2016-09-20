
/**
 * Write a description of class Fries here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fries
{
    // instance variables - replace the example below with your own
    public char size;
    public boolean salted = true;
    public boolean wellDone = false;
    public boolean askMe = false;


    /**
     * Constructor for objects of class Fries
     */
    public Fries(char s)
    {
       size = s;
    }
    public void noSalt() {
        salted = false;
    }
    public void addSalt() {
        salted = true;
    }
    public void wellDone() {
        wellDone = true;
    }
    public void askMe() {
        askMe = true;
    }
}
