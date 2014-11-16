package Objects;

import java.awt.Color;
import java.awt.Graphics;

/**
 * contains the method needed to be implemented by the objects drawn
 * @author Vlad Herescu
 *
 */
public interface InterfaceDraw {

	
	/**
	 * @param g : the graphic of the JFrame
	 */
	public void paint(Graphics g);
	
	/**
	 * @param mouse_start_x : where the mouse starts to select
	 * @param mouse_start_y : where the mouse starts to select
	 * @param mouse_end_x
	 * @param mouse_end_y
	 * @return : true if the object has been selected ( if it is included in the rectangle defined by the coordonates
	 */
	public boolean isSelected(int mouse_start_x, int mouse_start_y,int mouse_end_x,int mouse_end_y);
	
	/**
	 * @param mouse_x : 
	 * @param mouse_y
	 * @return : true if the object has been selected
	 */
	public boolean isSelected(int mouse_x, int mouse_y);
	
	
	/**
	 * @param color : the color setted for the object
	 */
	public void setColor(Color color);
	
}
