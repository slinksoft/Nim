public class Nim
{
    /*boolean to handle loop until game is over
    private boolean ifGameOver = false;*/
    // instance for player one (the player who will go first)
    private Player playerOne;
    // instance for player two (the player who will go second)
    private Player playerTwo;
    private Pile gamePile; // creates new pile instance for Nim
    
    /**
     * Constructs a new game of Nim. Sets the beginning pile amount
     * @param pileAmount initial amount of marbles in the pile passed by caller
     */
    public Nim(int pileAmount)
    {
        gamePile = new Pile(pileAmount);
    }
    
    /**
     * handles the Nim game. When there are no marbles left in the pile (a
     * player takes the last one), the winner will be determined and the
     * winner's name will be returned to the driver class
     * @return Returns winning player's name
     */
    public String play()
    {
        // Continues conducting the game until the last marble is taken
        while (gamePile.getMarbles() > 0)
        {
           playerOne.move(gamePile.getMarbles()); // polymorphism
        }
    }
    
    /**
     * sets type of player for player one passed from driver class
     * @param playOne type of player
     */
    public void setPlayerOne(Player playOne)
    {
        playerOne = playOne;
    }
    
    /**
     * sets type of player for player two passed from driver class
     * @param playTwo type of player
     */
    public void setPlayerTwo(Player playTwo)
    {
        playerTwo = playTwo;
    }
}