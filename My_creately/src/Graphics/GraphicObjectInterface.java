package Graphics;

import java.awt.Graphics;

import UMLObject.UMLDataInterface;

/**
 * @author Vlad Herescu
 *
 */
public interface GraphicObjectInterface
{
	/**
	 * sets the UML data to the graphic object
	 * @param _umlData : the model data associated to the graphics
	 */
	public void setInterface(UMLDataInterface _umlData);
	
	
	/**
	 * @param g : the instance which will paint the 
	 */
	public void paint(Graphics g);
}
