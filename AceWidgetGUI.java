import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;
import BreezySwing.*;


public class AceWidgetGUI extends GBFrame{
	
	 	JButton inputInformation = addButton ("Input Information", 4 ,1, 2, 1 );
	 	JLabel name = addLabel("Enter employee name", 1,1,1,2);
	 	JTextField employeeName  = addTextField ("", 3,1,1,1);
	    JLabel q1 = addLabel("Enter Q1 Sales", 1, 3, 1, 2);
	    DoubleField q1Value = addDoubleField(0, 3, 3, 1, 1);
	    JLabel q2 = addLabel("Enter Q2 Sales", 1, 5, 1, 2);
	    DoubleField q2Value = addDoubleField(0, 3, 5, 1, 1);
	    JLabel q3 = addLabel("Enter Q3 Sales", 1, 7, 1, 2);
	    DoubleField q3Value = addDoubleField(0, 3, 7, 1, 1);
	    JLabel q4 = addLabel("Enter Q4 Sales", 1, 9, 1, 2);
	    DoubleField q4Value = addDoubleField(0, 3, 9, 1, 1);
	     
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	    	String name = employeeName.getText();
	    	if (q1Value.isValidNumber() && q2Value.isValidNumber() && q3Value.isValidNumber() && q4Value.isValidNumber() && q1Value.getNumber()>=0 && q2Value.getNumber()>=0 && q3Value.getNumber()>=0 && q4Value.getNumber()>=0) {
	    		double q1 = q1Value.getNumber();
	    		double q2 = q2Value.getNumber();
	    		double q3 = q3Value.getNumber();
	    		double q4 = q4Value.getNumber();
	    		AceWidget widget = new AceWidget(name, q1, q2, q3, q4);
	    	} else {
	    		messageBox("There is an invalid input");
	    	}
	    	
	    	
	    }
	    
	   
	    

	    public static void main(String[] args){
	    	
	        JFrame frm = new AceWidgetGUI();
	        frm.setTitle ("Ace Widget");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
