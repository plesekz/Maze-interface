/**
 * This interface should be implemented by all traverseable mazes.
 * This interface assumes a two dimensional maze with four directions. (Up, down, left, right.)
 * TraverseableMaze class should hold the player's location and the maze map.
 * @author Zdenek Plesek
 * @version 0.9
 */
public interface MazeInteraction {
	//method for identifying possible movements
	/**
	 * This method returns boolean representing whether it is possible to move right from the current position.
	 * @return boolean
	 */
	public boolean canGoRight();
	/**
	 * This method returns boolean representing whether it is possible to move up from the current position.
	 * @return boolean
	 */
	public boolean canGoUp();
	/**
	 * This method returns boolean representing whether it is possible to move left from the current position.
	 * @return boolean
	 */
	public boolean canGoLeft();
	/**
	 * This method returns boolean representing whether it is possible to move down from the current position.
	 * @return boolean
	 */
	public void canGoDown();
	//methods for maze traversal
	/**
	 * This method should move the player character in the right hand direction.
	 * @return boolean representing whether the move has executed or was stopped by a wall.
	 */
	public boolean goRight();
	/**
	 * This method should move the player character in the up direction.
	 * @return boolean representing whether the move has executed or was stopped by a wall.
	 */
	public boolean goUp();
	/**
	 * This method should move the player character in the left direction.
	 * @return boolean representing whether the move has executed or was stopped by a wall.
	 */
	public boolean goLeft();
	/**
	 * This method should move the player character in the down direction.
	 * @return boolean representing whether the move has executed or was stopped by a wall.
	 */
	public boolean goDown();
	//service methods
	/**
	 * This method should set the player location to specified position.
	 * @param x: int, position on the x axis.
	 * @param y: int, position on the y axis.
	 * @throws Exception if the player character should be put inside a wall.
	 */
	public void setCoordinates(int x, int y) throws Exception;
	/**
	 * This method returns a two article int array representing the current position of the player character.
	 * @return one dimensional two article int array {x,y} representing the current location of the player.
	 */
	public int[] currentPosition();
	/**
	 * This method returns the player character back to starting position.
	 */
	public void returnToStart();
	/**
	 * This method returns true if the player has reached the exit coordinates of the maze.
	 * @return 
	 */
	public boolean hasReachedTheExit();
}
