
/**
 * This class demonstrates getter and setter functions, and local charge 
 * and print functions. It also is a parent class to the child class
 * Phone. 
 *
 * @author Ananya Harshe
 * @version 11/18/2025
 */
public class Device
{
    // instance variables
    int battery;
    static int count;
    /**
     * Constructor for objects of class Device
     */
    public Device()
    {
        // initialise instance variables
        battery = 0;
        count = count + 1;
    }
    
    public Device(int b) //default constructor
    {
        battery = b;
        count = count + 1;
    }
    
    //setter methods
    public int getBattery()
    {
        return battery;
    }
    
    public static int getCount()
    {
         return count;       
    }
    
    //local methods
    public void charge()
    {
        battery = battery + 20;
    }
    
    public void print()
    {
        System.out.println("Current Battery: " + battery + "%");
    }
}