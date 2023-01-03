import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.TextListener;
import java.io.File;
import java.awt.Cursor;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.DefaultEditorKit;
public class gui implements ActionListener {
	private String expre;
	private JFrame frame;
	private JPanel panel;
	private GridBagConstraints c;
	private JButton b0;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton bpl;
	private JButton bmin;
	private JButton bsl;
	private JButton bmu;
	private JButton ben;
	private JButton bCl;
	private JButton bdot;
	private JButton bopar;
	private JButton bcpar;
	private JButton bex;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private String expr;
	private JTextArea res;
	private JScrollPane sp;	
	
	private JTextField tf1;
	public JButton b0() {
		b0 = new JButton("0");
		b0.addActionListener(this);
		return b0;	}
		public JButton b1() {
		b1=new JButton("1");
		b1.addActionListener(this);
		return b1;	}
		public JButton b2() {
		b2 = new JButton("2");
		b2.addActionListener(this);
		return b2;	}
		public JButton b3() {
		b3 = new JButton("3");
		b3.addActionListener(this);
		return b3;	}
		public JButton b4() {
		b4 = new JButton("4");
		b4.addActionListener(this);
		return b4;	}
		public JButton b5() {
		b5 = new JButton("5");
		b5.addActionListener(this);
		return b5;	}
		public JButton b6() {
		b6 = new JButton("6");
		b6.addActionListener(this);
		return b6;	}
		public JButton b7() {
		b7 = new JButton("7");
		b7.addActionListener(this);
		return b7;	}	
		public JButton b8() {
			b8 = new JButton("8");
			b8.addActionListener(this);
			return b8;	}
		public JButton b9() {
		b9 = new JButton("9");
		b9.addActionListener(this);
		return b9;	}
		public JButton bpl() {
		bpl = new JButton("+");
		bpl.addActionListener(this);
		return bpl;	}
		public JButton bmin() {
		bmin = new JButton("-");
		bmin.addActionListener(this);
		return bmin;	}
		public JButton bsl() {
		bsl = new JButton("/");
		bsl.addActionListener(this);
		return bsl;	}
		public JButton bmu() {
		bmu = new JButton("*");
		bmu.addActionListener(this);
		return bmu;	}
		public JButton ben() {
		ben = new JButton("Enter");
		ben.addActionListener(this);
		return ben;	}
		public JButton bCl() {
		bCl = new JButton("CE");
		bCl.addActionListener(this);
		return bCl;}
		public JButton bdot() {
			bdot=new JButton(".");
			bdot.addActionListener(this);
			return bdot;	}
		public JButton bopar() {
			bopar = new JButton("(");
			
			return bopar;	}
		public JButton bcpar() {
			bcpar = new JButton(")");
			
			return bcpar;	}
		public JButton bex() {
			bex = new JButton("^");
			
			return bex;	}
		public JLabel l1() {
			l1 = new JLabel("Enter your expression:");
			
			return l1;			
		}
		public JLabel label2() {
			l2 = new JLabel("Result:");
			
			return l2;			
		}
		public JLabel label3() {
			l3 = new JLabel("Errors: ");
		
			return l3;			
		}
		public JTextArea res() {
			res = new JTextArea();
		
			return res;
		}
	public gui() {
		frame = new JFrame ();
		
		 frame.setSize(420, 550);
	        
		res=new JTextArea();
		c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel= new JPanel();
		 panel.setBounds(50,110, 300,300);
		 panel.setLayout(new GridLayout(4,4,10,10));
		tf1=new JTextField();
		tf1.addActionListener(this);
		tf1.setSize(200,200);
		panel.add(tf1);
		panel.add(b0());
		panel.add(b1());
		panel.add(b2());
		panel.add(b2());
		panel.add(b3());
		panel.add(b4());
		panel.add(b5());
		panel.add(b6());
		panel.add(b7());
		panel.add(b8());
		panel.add(b9());
		panel.add(bpl());
		panel.add(bmin());
		panel.add(bmu());
		panel.add(bsl());
		panel.add(bCl());
		panel.add(ben());
		panel.add(bdot());
		
		frame.setLayout(null);
		tf1.setEditable(true);
		frame.add(res);
		frame.add(panel);
		frame.setVisible(true);
		
	}
	

		
		/* final static boolean shouldWeightX = true;
	    final static boolean RIGHT_TO_LEFT = false;
	    final static boolean shouldFill = true;
	    public static void addComponentsToPane(Container pane) {
	        if (RIGHT_TO_LEFT) {
	            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	        }
	 
	        JButton button;
	    pane.setLayout(new GridBagLayout());
	    GridBagConstraints c = new GridBagConstraints();
	    if (shouldFill) {
	    //natural height, maximum width
	    c.fill = GridBagConstraints.HORIZONTAL;
	    }
	 
	    button = new JButton("Button 1");
	    if (shouldWeightX) {
	    c.weightx = 0.5;
	    }
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.gridx = 0;
	    c.gridy = 0;
	    pane.add(button, c);
	 
	    button = new JButton("Button 2");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 1;
	    c.gridy = 0;
	    pane.add(button, c);
	 
	    button = new JButton("Button 3");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.weightx = 0.5;
	    c.gridx = 2;
	    c.gridy = 0;
	    pane.add(button, c);
	 
	    button = new JButton("Long-Named Button 4");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 40;      //make this component tall
	    c.weightx = 0.0;
	    c.gridwidth = 3;
	    c.gridx = 0;
	    c.gridy = 1;
	    pane.add(button, c);
	 
	    button = new JButton("5");
	    c.fill = GridBagConstraints.HORIZONTAL;
	    c.ipady = 0;       //reset to default
	    c.weighty = 1.0;   //request any extra vertical space
	    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
	    c.insets = new Insets(10,0,0,0);  //top padding
	    c.gridx = 1;       //aligned with button 2
	    c.gridwidth = 2;   //2 columns wide
	    c.gridy = 2;       //third row
	    pane.add(button, c);
	    }
	 
	    /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
	     *
	    private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("GridBagLayoutDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Set up the content pane.
	        addComponentsToPane(frame.getContentPane());
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }
	 
	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	}*/

	
	
			
			public void actionPerformed(ActionEvent ae) {
				Object b = ae.getSource();	
				if (b == b0) {	
					expr=expr+"0";
				}
					 if (b == b1) {	
					
						expr=expr+"1";
					
				}				
				if (b == b2) {
					
					expr=expr+"2";
					
				}
				if (b == b3) {				
					expr=expr+"3";
				       
				     
				}
				
				if (b == b4) {	
					expr=expr+"4";
				}
				if (b == b5) {	
					expr=expr+"5";						
				}
				if(b == b6) {					
					expr=expr+"6";
				}
				
				if(b == b7) {					
					expr=expr+"7";
				}
				else if (b == b8) {	
					expr=expr+"8";
					
					
				}	
				 if (b == b9) {	
					expr=expr+"9";
					
					
				}	
				 if (b == bpl) {	
					expr=expr+"\\+";
				}	
				 if (b == bmin) {	
				expr=expr+"-";
				}	
				 if (b == bsl) {	
					expr=expr+"/";
					
				}	
				 if (b==bmu) {
					expr=expr+"*";
				}
				 if (b==bopar) {
					expr=expr+"(";
				}
				 if (b==bcpar) {
					expr=expr+")";
				}
				 if (b==bex) {
					expr=expr+"^";
				}
				 if (b == ben) {	
					functions a=new functions(expr);
					if(((a.getExp()).split("[(,)]")).length>1){
						tf1.setText(Double.toString(a.sum()));;
					}
					if(((a.getExp()).split("^")).length>1){
						tf1.setText(Double.toString(a.sum()));;
					}
					if(((a.getExp()).split("\\+")).length>1){
						tf1.setText(Double.toString(a.sum()));;
					}
if(((a.getExp()).split("-")).length>1){
	tf1.setText(Double.toString(a.diff()));;
					}
if(((a.getExp()).split("\\*")).length>1){
	tf1.setText(Double.toString(a.pro()));;
}
if(((a.getExp()).split("/")).length>1){
	tf1.setText(Double.toString(a.quo()));
}
					
				}	
				 if (b == bCl) {	
					expr="";
			}			
				 if(b==tf1) {	
				tf1.getText();
					functions a=new functions(expr);
					
					if(((a.getExp()).split("[(,)]")).length>1){
						tf1.setText(Double.toString(a.sum()));
					}
					if(((a.getExp()).split("^")).length>1){
						res.setText(Double.toString(a.sum()));
					}
					if(((a.getExp()).split("+")).length>1){
						tf1.setText(Double.toString(a.sum()));
					}
if(((a.getExp()).split("-")).length>1){
	tf1.setText(Double.toString(a.diff()));
					}
if(((a.getExp()).split("*")).length>1){
	tf1.setText(Double.toString(a.pro()));
}
if(((a.getExp()).split("/")).length>1){
	tf1.setText(Double.toString(a.quo()));
				}
				}
			}
			/* public JMenuBar createMenuBar () {
			        JMenuItem menuItem = null;
			        JMenuBar menuBar = new JMenuBar();
			        JMenu mainMenu = new JMenu("Edit");
			        mainMenu.setMnemonic(KeyEvent.VK_E);

			        menuItem = new JMenuItem(new DefaultEditorKit.CutAction());
			        menuItem.setText("Cut");
			        menuItem.setMnemonic(KeyEvent.VK_T);
			        mainMenu.add(menuItem);

			        menuItem = new JMenuItem(new DefaultEditorKit.CopyAction());
			        menuItem.setText("Copy");
			        menuItem.setMnemonic(KeyEvent.VK_C);
			        mainMenu.add(menuItem);

			        menuItem = new JMenuItem(new DefaultEditorKit.PasteAction());
			        menuItem.setText("Paste");
			        menuItem.setMnemonic(KeyEvent.VK_P);
			        mainMenu.add(menuItem);

			        menuBar.add(mainMenu);
			        return menuBar;
			    }*/
			 public static void main(String[] args) 

			    {


			        gui calcu = new gui();

			    }

}
			