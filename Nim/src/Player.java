/**
 * Interface represents a player. Sescribes the way a player moves and 
 * returns a player's name
 * @author Dan
 */
public interface Player
{
    /**
     * handles the way a player moves
     * @param pileAmount the amount of marbles in the pile
     * @return returns the amount of marbles the player takes
     */
    int move(int pileAmount); // abstract method
    
    /**
     * @return returns the player's name
     */
    String getName(); // abstract method
}