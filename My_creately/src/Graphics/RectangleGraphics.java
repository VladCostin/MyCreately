package Graphics;

import java.awt.Color;
import java.awt.Graphics;

import UMLObject.LineData;
import UMLObject.RectangleData;

/**
 * @author Vlad Herescu
 *
 */
public class RectangleGraphics extends GraphicObjectAbstract{

	@Override
	public void paint(Graphics g) {
		
		RectangleData m_data = (RectangleData) this.m_data;
		
		g.setColor(Color.white);
		g.fillRect(m_data.getM_xStart(), m_data.getM_yStart(),
				   m_data.getM_width(), m_data.getM_height());
		

		g.setColor(Color.blue);
		g.fillRect(m_data.getM_xStart(), m_data.getM_yStart(),
				   m_data.getM_width(), m_data.getM_height());
		
	}

}
