
/**
 * A program that can create virtual parrots that say various things when asked.
 *
 * @author Kevin Lo
 * @version 2020-09-08
 */
public class Parrot
{
    //Declaring instance variable "parrotName"
    private String parrotName;

    /**
     * Constructor for objects of class Parrot
     * 
     * @param givenName String containing name to be granted to the new parrot.
     * 
     */
    public Parrot(String givenName)
    {
        parrotName = givenName;
        
    }

    /**
     * Gets the name of this Parrot
     *
     * @return A String containing the name of this Parrot
     */
    public String getName()
    {
        return parrotName;
    }
    
    /**
     * Sets a new name for this Parrot object.
     *
     * @param newName a String of the new name for the parrot.
     * 
     */
    public void setName(String newName) 
    {
        parrotName = newName;
    }
    
    /**
     * Generates a String response based on the parrot's desires.
     *
     * @return A String containing the name of the parrot and a wish for crackers.
     * 
     */
    public String whatDoYouWant() 
    {
        String parrotDesire = parrotName + " wants a cracker!";
        return parrotDesire;
    }
    
    /**
     * Generates a String response based on desired action and name of parrot.
     *
     * @param whatToDo A String containing an action for the parrot
     * 
     * @return A String containing the parrot's response. 
     * 
     */
    public String doIt(String whatToDo)
    {
        String parrotAction = "Pretty " + parrotName + " does not " + whatToDo + "!";
        return parrotAction;
        
    }
        
}
