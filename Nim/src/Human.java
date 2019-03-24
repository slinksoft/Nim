/**
 * Represents a human player that implements the player interface
 * @author Dan
 */
import java.util.Scanner;
public class Human implements Player
{
    private String name = ""; // holds the human player's name
    private Scanner uInput = new Scanner(System.in); // handles keyboard inputs
    
    /**
     * allows the human to make a legal move and returns the amount of marbles
     * the human wants to take
     * @param pileAmount the pile amount passed by the caller
     * @return returns amount of marbles the human would like to take
     */
    public int move(int pileAmount)
    {
        int nInput = 0; // holds input for amount of marbles entered by human
        /* while the # of marbles is more than half of the marbles in the pile 
        or less than or equaal to 0...*/
        while (nInput > (pileAmount/2) || nInput <= 0)
        {
            System.out.println("How many marbles would you like to take?\nInput"
                    + ": ");
            nInput = uInput.nextInt(); // amount of marbles the human will take
            /*checks if the human has entered an illegal amount of marbles. If 
            so, reruns the loop until a legal amount of marbles are entered */
            if (nInput > (pileAmount/2) || nInput <= 0)
            {
            System.out.println("Error: You cannot take no more than half"
                    + "of the pile or no marbles at all! Please try again.");
            }
        }
        return nInput;
    }
    /**
     * returns players name
     * @return players name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Sets human player's name from the driver class
     * @param uName The name entered by a human user passed from the driver 
     * class
     */
    public void setName(String uName)
    {
        name = uName;
    }
}