import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;
import javax.swing.JButton;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.border.BevelBorder;


/**
 * the frame which contains both the panel where the objects are drwoan and the toolbar
 * @author Vlad Herescu
 *
 */
public class Creately extends JFrame implements ActionListener {

	/**
	 * I don't know what's this for
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * panel which contains the Toolbar and drawing container
	 */
	JPanel contentPane;
	
	/**
	 * selecting drawing a line
	 */
	JButton btnLine;
	
	/**
	 * selecting drawing a rectangle
	 */
	JButton btnRectangle;
	
	/**
	 * where the user draws objects
	 */
	JPanel panel_Draw;
	
	/**
	 * where the user chooses action
	 */
	JPanel panel_toolbar;
	/**
	 * selecting using the mouse in order to drag, select objects
	 */
	JButton btnCursor;

	/**
	 * what the user wants to do
	 */
	static ACTION currentAction;
	
	/**
	 * Launch the application.
	 * @param args : the arguments received for launching the program
	 */
	public static void main(String[] args) {
		
		Creately frame = new Creately();
		frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public Creately() {
		
		
		initContainer();
		addComponents();
		
		currentAction = ACTION.RECTANGLE;
		
		
	}
	
	private void addComponents() {
		panel_toolbar = new JPanel();
		panel_toolbar.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, null, null, null));
		panel_toolbar.setBounds(0, 0, 161, 762);
		contentPane.add(panel_toolbar);
		panel_toolbar.setLayout(null);
		
		btnLine = new JButton(ACTION.LINE.toString());
		btnLine.setBounds(0, 5, 161, 40);
		panel_toolbar.add(btnLine);
		btnLine.addActionListener(this);
		btnLine.setForeground(Color.BLUE);
		
		btnRectangle = new JButton(ACTION.RECTANGLE.toString());
		btnRectangle.setForeground(Color.BLUE);
		btnRectangle.setBounds(0, 45, 161, 40);
		btnRectangle.addActionListener(this); 
		panel_toolbar.add(btnRectangle);
		
		btnCursor = new JButton(ACTION.CURSOR.toString());
		btnCursor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCursor.setForeground(Color.BLUE);
		btnCursor.setBounds(0, 85, 161, 40);
		btnCursor.addActionListener(this);
		panel_toolbar.add(btnCursor);
		
		panel_Draw = new PanelDrawing();
		panel_Draw.setBackground(Color.WHITE);
		panel_Draw.setBounds(171, 0, 613, 762);
		contentPane.add(panel_Draw);
		panel_Draw.setLayout(null);
		
		
	}

	/**
	 * creating the frame
	 */
	public void initContainer() {
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(ConstantsContainer.widthContainer, ConstantsContainer.heightContainer);
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		currentAction = ACTION.valueOf(e.getActionCommand());
		
	}

}

