import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener {
public Calculator() {
	
}
	public void actionPerformed(ActionEvent ae)
	{
		JButton pb=(JButton)ae.getSource();
		if(pb==b15)
		{
		 r=n1=n2=0;
		 res.setText("");
		}
		else
			if(pb==b14)
			{
	 		 n2=Integer.parseInt(res.getText());
	  		 eval();
	  		 res.setText(""+r);
			}
	 
			else
			{
	 		  boolean opf=false;
	 		  if(pb==b10)
				{ op='+';
				  opf=true;
				}
	 		  if(pb==b11)
				{ op='-';opf=true;}
			  if(pb==b12)
				{ op='*';opf=true;}
			  if(pb==b13)
				{ op='/';opf=true;}
		
			  if(opf==false)
			  {
	  		   for(i=0;i<10;i++)
			   {
			  	if(pb==b[i])
	     		  	{
	           	   	String t=res.getText();
	           		t+=i;
	            		res.setText(t);
			  	}
			   }
			  }
			  else
			  {
	    			n1=Integer.parseInt(res.getText());
	     			res.setText("");
			  }
			}
	}
	}
	



