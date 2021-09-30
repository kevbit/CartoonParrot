/**
 * A Java program to test class Parrot.
 *
 * 
 * @author Kevin Lo
 * @version 2020-09-08
 */
public class ParrotTester
{
    public static void main(String[] args)
    {
        String parrotName = "Ruby";     
        String newName = "Sunny";       
        String whatToDo = "sing";       
        String reply;
        
        
        Parrot aParrot = new Parrot(parrotName);
        
        reply = aParrot.getName();
        System.out.println("This parrot is called " + reply + ".");
        System.out.println("Expected: This parrot is called " + parrotName + ".");
        
        reply = aParrot.whatDoYouWant();
        System.out.println("What do you want, " + parrotName + "?");
        System.out.println(reply);
        System.out.println("Expected: " + parrotName + " wants a cracker!");
        
        reply = aParrot.doIt(whatToDo);
        System.out.println("Can you " + whatToDo + ", " + parrotName + "?");
        System.out.println(reply);
        System.out.println("Expected: Pretty " + parrotName +
                " does not " + whatToDo + "!");
                
        
        aParrot.setName(newName);

        
        reply = aParrot.getName();
        System.out.println("This parrot has a new name, " + reply + ".");
        System.out.println("Expected: This parrot has a new name, " + newName + ".");
        
        reply = aParrot.whatDoYouWant();
        System.out.println("What do you want, " + newName + "?");
        System.out.println(reply);
        System.out.println("Expected: " + newName + " wants a cracker!");
        
        reply = aParrot.doIt(whatToDo);
        System.out.println("Can you " + whatToDo + ", " + newName + "?");
        System.out.println(reply);
        System.out.println("Expected: Pretty " + newName +
                " does not " + whatToDo + "!");
    }
}