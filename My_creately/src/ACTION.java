
/**
 * possible actions used by the user
 * @author Vlad Herescu
 *
 */
public enum ACTION {

	/**
	 * for drawing a rectangle
	 */
	RECTANGLE,
	
	/**
	 * for drawing a line
	 */
	LINE,
	
	/**
	 * for using the mouse, dragging  objects
	 */
	CURSOR,
	
	
	/**
	 * when the user has finished moving the rectangle
	 */
	MOVE_RECTANGLE,
	
	
	/**
	 * when the user has finished creating the line
	 */
	FINISH_CREATING_LINE;
}
