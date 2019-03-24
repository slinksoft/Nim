/**
 * Represents the pile of marbles in a game of 2 player Nim. The class handles
 * removing an amount of marbles the player takes from the pile on their turn.
 * @author Dan
 */
public class Pile
{
    private int marbles; // handles amount of marbles in the pile
    
    /**
     * Constructs the pile. Sets the initial amount of marbles
     * @param initialPile initial amount of marbles in the pile passed by caller
     */
    public Pile(int initialPile)
    {
        marbles = initialPile;
    }
    /**
     * removes amount of marbles that the player takes
     * @param numMarbles number of marbles the player wants to take
     * @return return remaining amount of marbles
     */
    public int removeMarbles(int numMarbles)
    {
        marbles -= numMarbles; // remove amount of marbles player takes
        return marbles;
    }
    
    /**
     * Returns number of marbles in the pile.
     * @return returns number of marbles
     */
    public int getMarbles()
    {
        return marbles;
    }
}