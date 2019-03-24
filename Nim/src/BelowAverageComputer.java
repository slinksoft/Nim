/**
 * Represents a below average computer player. Implements the player interface
 * @author Dan
 */
import java.util.Random;
public class BelowAverageComputer implements Player
{
    private String name = "Not So Smart CPU"; // holds the computer's name
    
    /**
     * Allows the computer to take a random amount of marbles between 1 and
     * half of the pile amount
     * @param pileAmount the pile amount passed by the caller
     * @return returns amount of marbles the computer takes
     */
    public int move(int pileAmount)
    {
        Random rand = new Random(); // create random instance
        /*returns amount of marbles to take from a random value between 
         1 to half of the pile amount*/
        return (rand.nextInt(pileAmount/2) + 1);
    }
    
    /**
     * Returns computer's name to caller
     * @return return computer's name
     */
    public String getName()
    {
        return name;
    }
}