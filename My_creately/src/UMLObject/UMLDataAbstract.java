package UMLObject;

public abstract class UMLDataAbstract implements UMLDataInterface{

	/**
	 * where the object starts, coordonate ox
	 */
	int m_xStart;
	/**
	 * where the object starts, coordonate oy
	 */
	int m_yStart;
	
	
	public boolean isSelected(int mouse_x, int mouse_y)
	{
		return false;
	}
	
	public int getM_xStart() {
		return m_xStart;
	}

	public void setM_xStart(int m_xStart) {
		this.m_xStart = m_xStart;
	}

	public int getM_yStart() {
		return m_yStart;
	}

	public void setM_yStart(int m_yStart) {
		this.m_yStart = m_yStart;
	}
}
