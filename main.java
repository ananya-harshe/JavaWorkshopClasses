
/**
 * Main method to demonstrate instantiating and using objects of our created classes. 
 *
 * @author Ananya Harshe
 * @version 11/18/2025
 */
public class main
{
    public static void main(String[] args)
    {
        //create 2 new devices, one with a specified value, and one with a default value
        Device d = new Device(20);
        Device e = new Device();
        
        //show how print work and charge() changes the battery
        System.out.println("Device D: ");
        d.print();
        d.charge();
        d.print();
        
        System.out.println("\nDevice E: ");
        e.print();
        e.charge();
        e.print();
        
        //create a Phone object and show how it can use Device and Phone methods (charge is overridden)
        System.out.println("\nPhone P: ");
        Phone p = new Phone(50, "hello!");
        p.print();
        p.sendText();
        p.charge();
        p.print();
        
        //print out the static variable count to show how it is a part of the class
        System.out.println("\nStatic count variable: " + Device.getCount() + " instances of class Device made.");
    }
}
