package Objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;

/**
 * @author Vlad Herescu
 *
 */
public class Line extends Drawing{
	
	private int m_xEnd;
	private int m_yEnd;

	
	private Rectangle m_rect1;
	
	private Rectangle m_rect2;
	
	private  Ellipse2D.Double circle_start;
	
	private  Ellipse2D.Double circle_end;
	
	public Line()
	{
		
	}
	
	/**
	 * @param _xStart : where the line starts, the ox value
	 * @param _yStart : where the line starts, the oy value
	 * @param _xEnd : where the line ends, the ox value
	 * @param _yEnd : where the line ends, the oy value
	 */
	public Line(int _xStart, int _yStart,int _xEnd,int _yEnd)
	{
		
		m_xStart = _xStart;
		m_yStart = _yStart;
		m_xEnd = _xEnd;
		m_yEnd =  _yEnd;
	}
	
	/**
	 * @param _rect1 : the first rectangle
	 * @param _rect2 : the secondRectangle
	 */
	public Line(Rectangle _rect1, Rectangle _rect2)
	{
		m_rect1 = _rect1;
		m_rect2 = _rect2;
		
	}
	
	public void paint(Graphics g)
	{
		
		m_xStart = m_rect1.getM_xStart();
		m_yStart = m_rect1.getM_yStart();
		m_xEnd   = m_rect2.getM_xStart();
		m_yEnd   = m_rect2.getM_yStart();
		
		g.setColor(Color.blue);
		g.drawLine(m_xStart, m_yStart, m_xEnd, m_yEnd);
		circle_end = new Ellipse2D.Double(m_xEnd, m_yEnd, 10, 10);
		
	//	g.fillOval((int) circle_start.x, (int) circle_start.y, (int) circle_start.width, (int)  circle_start.height);
		g.fillOval((int) circle_end.x, (int) circle_end.y, (int) circle_start.width, (int)  circle_start.height);
	}

	public Rectangle getM_rect1() {
		return m_rect1;
	}

	public void setM_rect1(InterfaceDraw m_rect1) {
		this.m_rect1 =(Rectangle) m_rect1;
		
		circle_start = new Ellipse2D.Double(m_xStart, m_yStart, 10, 10);
	}

	public Rectangle getM_rect2() {
		return m_rect2;
	}

	public void setM_rect2(InterfaceDraw m_rect2) {
		this.m_rect2 = (Rectangle) m_rect2;
		
		circle_end = new Ellipse2D.Double(m_xEnd, m_yEnd, 10, 10);
		
	}

	public int getM_xEnd() {
		return m_xEnd;
	}

	public void setM_xEnd(int m_xEnd) {
		this.m_xEnd = m_xEnd;
	}

	public int getM_yEnd() {
		return m_yEnd;
	}

	public void setM_yEnd(int m_yEnd) {
		this.m_yEnd = m_yEnd;
	}
	

}
