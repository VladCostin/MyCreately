package UMLObject;

/**
 * the data which defines a rectangle
 * @author Vlad Herescu
 *
 */
public class RectangleData extends UMLDataAbstract
{
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
	 */
	public RectangleData(int _xStart, int _yStart,int _width,int _height)
	{
		
		m_xStart = _xStart;
		m_yStart = _yStart;
		m_height = _height;
		m_width =  _width;
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
	

	public int getM_width() {
		return m_width;
	}

	public void setM_width(int m_width) {
		this.m_width = m_width;
	}

	public int getM_height() {
		return m_height;
	}

	public void setM_height(int m_height) {
		this.m_height = m_height;
	}

}
