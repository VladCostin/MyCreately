package Graphics;

import UMLObject.UMLDataInterface;

/**
 * the class which will draw the object depending on the data model received
 * @author Vlad Herescu
 *
 */
public abstract class GraphicObjectAbstract implements GraphicObjectInterface
{
	/**
	 * the data model associated to the graphic object
	 */
	UMLDataInterface m_data;
	
	public void setInterface(UMLDataInterface _umlData)
	{
		m_data = _umlData;
	}
	

}
