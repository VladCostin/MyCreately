package Graphics;

import java.awt.Color;
import java.awt.Graphics;
import UMLObject.LineData;

/**
 * @author Vlad herescu
 *
 */
public class LineGraphics extends GraphicObjectAbstract 
{
	

	@Override
	public void paint(Graphics g) {
		
		LineData m_data = (LineData) this.m_data;
		
		g.setColor(Color.blue);
		
		
		g.drawLine(m_data.getM_xStart(), m_data.getM_yStart(),
				   m_data.getM_xEnd(), m_data.getM_yEnd());
		
	}
	

}
