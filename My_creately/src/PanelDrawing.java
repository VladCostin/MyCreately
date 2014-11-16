import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


import javax.swing.JPanel;


import Objects.InterfaceDraw;
import Objects.Line;
import Objects.Rectangle;

import java.awt.event.MouseMotionListener;

/**
 * contains the drawings made by the user
 * @author Vlad Herescu
 *
 */
public class PanelDrawing extends JPanel implements MouseListener, MouseMotionListener{
	
	/**
	 * the started to be drawn
	 */
	Line currentLineToBeDrawn;
	
	/**
	 * the rectangle started to be drawn/ moved
	 */
	Rectangle currentRectangleToBeMoved;
	

	/**
	 * the difference between where the user has clicked and 
	 * the position where the rectangle starts
	 */
	Dimension deltaPosition;
	
	
	/**
	 * the objects drawn in the container
	 */
	ArrayList<InterfaceDraw> draws;
	
	/**
	 * needed for I do not know what
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	PanelDrawing()
	{
		
		draws = new ArrayList<InterfaceDraw>(); 
		
		addMouseListener(this);
		addMouseMotionListener(this);

	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		for(InterfaceDraw comp : draws)
			comp.paint(g);


	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
	
		System.out.println("Sunt in mouse clicked" + e.getX() + " " + e.getY());
		
		switch(Creately.currentAction)
		{
			//case RECTANGLE:
			//	 draws.add(new Rectangle(e.getX(),e.getY())); 
			//	 break;
				
			//case CURSOR:
				
				//for(InterfaceDraw comp : draws)
				//	if(comp.isSelected(e.getX(), e.getY()))
				//		comp.setColor(Color.orange);
				//	else
				//		comp.setColor(Color.blue);
				
					
			//	break;
			case LINE:
				
				startCreateLine(e.getX(), e.getY());
				break;
				
			case FINISH_CREATING_LINE:
				
				finishCreateLine(e.getX(), e.getY()); 
				break;
				
			default:
				break;
		}
		

		repaint();
		
	}



	/**
	 * @param x : position of the mouse
	 * @param y : position of the mouse
	 */
	public void startCreateLine(int x, int y) {
		
		System.out.println("sunt in createLIne");
		
		currentLineToBeDrawn = new Line();
		for(InterfaceDraw comp : draws)
	    {	
			 if(comp.isSelected(x, y))
			 {
		   		comp.setColor(Color.green);
		   		currentLineToBeDrawn.setM_rect1(comp);
		   		Creately.currentAction = ACTION.FINISH_CREATING_LINE;
		   		
		   		break;
			 }
	    }
		
		
	}
	
	/**
	 * selecting the second rectangle
	 * @param x : the coordonate of the mouse
	 * @param y : the coordonate of the mouse
	 */
	public void finishCreateLine(int x, int y) {
		
		Creately.currentAction = ACTION.LINE;
		
		
		for(InterfaceDraw comp : draws)
	    {
			 
			 if(comp.isSelected(x, y))
			 {
		   		currentLineToBeDrawn.setM_rect2(comp);
				currentLineToBeDrawn.getM_rect1().setColor(Color.blue);
				draws.add(currentLineToBeDrawn);
		   		break;
			 }
	    }
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		System.out.println("Sunt in mouse pressed : " + e.getX() + " " + e.getY());
		
		switch(Creately.currentAction)
		{
			case CURSOR:
				
				Creately.currentAction = ACTION.MOVE_RECTANGLE;
				for(InterfaceDraw comp : draws)
				{
					if(comp.isSelected(e.getX(), e.getY()))
				    {
						System.out.println("Este selectat");
				    	comp.setColor(Color.green);
				    	currentRectangleToBeMoved = (Rectangle) comp;
				    	deltaPosition = new Dimension();
				    	deltaPosition.width = currentRectangleToBeMoved.getM_xStart() - e.getX();
				    	deltaPosition.height = currentRectangleToBeMoved.getM_yStart() - e.getY();
				    	break;
				    }
					//else
					//	comp.setColor(Color.blue);
				}
				break;
				
			case RECTANGLE:
				
				currentRectangleToBeMoved = new Rectangle(e.getX(), e.getY(),0,0);
				currentRectangleToBeMoved.setColor(Color.green);
				draws.add(currentRectangleToBeMoved); 
				break;
				
				
				
			default :
				break;
		}
			
		repaint();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Sunt in mouseReleased : " + e.getX() + " " + e.getY());
		
		
		switch(Creately.currentAction)
		{
			case MOVE_RECTANGLE:
				
				Creately.currentAction = ACTION.CURSOR;
				currentRectangleToBeMoved.setColor(Color.blue);
				
				
				break;
				
			case RECTANGLE:
				
				if(e.getX() <= currentRectangleToBeMoved.getM_xStart() ||
				   e.getY() <= currentRectangleToBeMoved.getM_yStart())

					draws.remove(currentRectangleToBeMoved);
				else
					currentRectangleToBeMoved.setColor(Color.BLUE);
				break;
				
				
			default:
				break;
		}
		
		repaint();

		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		
		switch(Creately.currentAction)
		{
			case  MOVE_RECTANGLE :
				
				currentRectangleToBeMoved.setM_xStart(e.getX() + deltaPosition.width);
				currentRectangleToBeMoved.setM_yStart(e.getY() + deltaPosition.height);
			break;
			
			case RECTANGLE:
				
				int start_x = currentRectangleToBeMoved.getM_xStart();
				int start_y = currentRectangleToBeMoved.getM_yStart();
				currentRectangleToBeMoved.setM_width( e.getX() -  start_x); 
				currentRectangleToBeMoved.setM_height( e.getY() - start_y    );
				
				
				/*
				System.out.println("intru aici  " + e.getX() + " " + e.getY());
				

				
				
				if(e.getY() > start_y)
				{
					int x =  currentRectangleToBeMoved.getM_height();
					System.out.println(" >  " +  x + " " + start_y + " " + e.getY());
					
					if(start_y + x > e.getY() )
					{
						System.out.println("AICI");
						int delta = e.getY() - start_y;
						currentRectangleToBeMoved.setM_yStart( Math.min(e.getY(), start_y));
						currentRectangleToBeMoved.setM_height( x -delta  ); 
					}
					else
					{
						System.out.println("BA AICI");
						currentRectangleToBeMoved.setM_height( e.getY() - start_y    );
					}
				}
				if(e.getY() < start_y)
				{
					
					int height = currentRectangleToBeMoved.getM_height();
					System.out.println(" < :" +  height + " " + e.getY() + " " + start_y);
					
					if( e.getY() - start_y  > height  )
					{
						System.out.println("INTRU AIIIIIIIIIICI");
						currentRectangleToBeMoved.setM_height( height - (height - e.getY()  ));
					}
					else
					{
						int x = start_y - e.getY();
						System.out.println("Intru aici  , desenez in spate " + x);
						
						currentRectangleToBeMoved.setM_yStart(e.getY());
						currentRectangleToBeMoved.setM_height( x + currentRectangleToBeMoved.getM_height() ); 
					}
				}
				
				if(e.getX() > start_x)
					currentRectangleToBeMoved.setM_width( e.getX() - start_x  );
				else
				{
					currentRectangleToBeMoved.setM_width( start_x - e.getX() ); 
					currentRectangleToBeMoved.setM_xStart(e.getX());
				}

				*/
			
			default:
				break;
			
		}
		
		repaint();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	

}
