package Objects;

import java.awt.Color;
import java.awt.Graphics;

/**
 * rectangle drawn by the user
 * @author Vlad Herescu
 *
 */
public class Rectangle extends Drawing{
	
	/**
	 * the width of the rectangle
	 */
	int m_width;
	/**
	 * the height of the rectangle
	 */
	int m_height;
	
	/**
	 * the default constructor
	 */
	public Rectangle() {
		setColor(Color.blue);
	}
	
	/**
	 * @param _xStart : the x position of the rectangle
	 * @param _yStart : the y position of the rectangle
	 * @param _width : the width of the rectangle
	 * @param _height : the height of the rectangle
	 */
	public Rectangle(int _xStart, int _yStart,int _width,int _height)
	{
		
		m_xStart = _xStart;
		m_yStart = _yStart;
		m_height = _height;
		m_width =  _width;
	}
	
	/**
	 * creating the rectangle with default dimensions
	 * @param _xStart : the x position of the rectangle
	 * @param _yStart : the y position of the rectangle
	 */
	public Rectangle(int _xStart, int _yStart)
	{
		this(_xStart, _yStart, ConstantsObject.widthRectangle, ConstantsObject.heightRectangle);
		setColor(Color.blue);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(m_xStart, m_yStart, m_width, m_height);
		

		g.setColor(getColor());
		g.drawRect(m_xStart, m_yStart, m_width, m_height);
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
