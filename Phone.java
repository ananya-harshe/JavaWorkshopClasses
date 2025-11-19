
/**
 * Phone is a child class of Device. It contains the specific variable text, 
 * the specific method sendText(), and inherits charge() and battery. 
 * 
 * @author Ananya Harshe
 * @version 11/18/2025
 */
public class Phone extends Device
{
    // instance variables
    String text;

    /**
     * Constructor for objects of class Phone
     */
    public Phone(int b, String t)
    {
        // initialise instance variables
        
        battery = b;
        text = t;
    }

    /**
     * An instance function local to the Phone class
     */
    public void sendText()
    {
        System.out.println("\nUser is typing...\nUser says: " + text + "\n");
    }
    
    /**
     * This method overrides the charge() method from the Device class. 
     * It is specific to the Phone class. If this method override did 
     * not exist, then phone_object.charge() would call the method from
     * the Device class. 
     */
    public void charge() 
    {
        battery = battery + 30;
    }
}
