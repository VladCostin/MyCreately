package UMLObject;

/**
 * the data which defines the commentBoxData
 * @author Vlad Herescu
 *
 */
public class CommentBoxData extends UMLDataAbstract
{
	/**
	 * the string contained in the comment
	 */
	String m_comment;
	
	/**
	 * the width of the rectangle
	 */
	int m_width;
	/**
	 * the height of the rectangle
	 */
	int m_height;
	
	/**
	 * @param _xStart : the x position of the rectangle
	 * @param _yStart : the y position of the rectangle
	 * @param _width : the width of the rectangle
	 * @param _height : the height of the rectangle
	 * @param _comment : the comment added bu the user to the commentBox
	 */
	public CommentBoxData(int _xStart, int _yStart,int _width,int _height, String _comment)
	{
		
		m_xStart = _xStart;
		m_yStart = _yStart;
		m_height = _height;
		m_width =  _width;
		m_comment = _comment;
	}
	
	/**checks whether the user has selected the rectangle
	 * @param x : the x value of the position of the cursor
	 * @param y : the y value of the position of the cursor
	 * @return : true of the cursor is inside  the rectangle
	 */
	public boolean isSelected(int x, int y)
	{
		if(m_xStart + m_width > x && x > m_xStart &&	
		   m_yStart + m_height > y && y > m_yStart)
			return true;
		return false;
	}
}
