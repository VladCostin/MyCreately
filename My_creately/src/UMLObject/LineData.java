package UMLObject;

/**
 * the data which defines a line
 * @author Vlad Herescu
 *
 */
public class LineData extends UMLDataAbstract
{
	int m_xEnd;
	int m_yEnd;
	
	RectangleData m_rect1;
	
	RectangleData m_rect2;

	/**
	 * @param _xStart : where the line starts, the ox value
	 * @param _yStart : where the line starts, the oy value
	 * @param _xEnd : where the line ends, the ox value
	 * @param _yEnd : where the line ends, the oy value
	 */
	public LineData(int _xStart, int _yStart,int _xEnd,int _yEnd)
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
	public LineData(RectangleData _rect1, RectangleData _rect2)
	{
		m_rect1 = _rect1;
		m_rect2 = _rect2;
		
	}
	
	public RectangleData getM_rect1() {
		return m_rect1;
	}


	public RectangleData getM_rect2() {
		return m_rect2;
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
