package Objects;

import java.awt.Color;
import java.awt.Graphics;

/**
 * object drawn by the user
 * @author Vlad Herescu
 *
 */
public class Drawing implements InterfaceDraw {

	/**
	 * where the object starts, coordonate ox
	 */
	int m_xStart;
	/**
	 * where the object starts, coordonate oy
	 */
	int m_yStart;
	
    /**
     * the color of the object
     */
    Color color;
	

	@Override
	public void paint(Graphics g) {
		
	}

	@Override
	public boolean isSelected(int mouse_start_x, int mouse_start_y,
			int mouse_end_x, int mouse_end_y) {
		return false;
	}
	
	@Override
	public boolean isSelected(int mouse_x, int mouse_y) {
		// TODO Auto-generated method stub
		return false;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
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
