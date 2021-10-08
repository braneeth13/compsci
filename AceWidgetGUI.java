import java.lang.reflect.Array;
import java.util.Arrays;
import java.text.DecimalFormat;
import javax.swing.*;
import BreezySwing.*;


public class AceWidgetGUI extends GBFrame{ 
	
	
	 	JButton inputInformation = addButton ("Input Information", 4 ,1, 2, 1 );
	 	JLabel name = addLabel("Enter employee ", 1,1,1,2);
	 	JTextField employeeName  = addTextField ("Enter name here", 3,1,1,1);
	    JLabel q1 = addLabel("Enter Q1 Sales", 1, 3, 1, 2);
	    DoubleField q1Value = addDoubleField(0, 3, 3, 1, 1);
	    JLabel q2 = addLabel("Enter Q2 Sales", 1, 5, 1, 2);
	    DoubleField q2Value = addDoubleField(0, 3, 5, 1, 1);
	    JLabel q3 = addLabel("Enter Q3 Sales", 1, 7, 1, 2);
	    DoubleField q3Value = addDoubleField(0, 3, 7, 1, 1);
	    JLabel q4 = addLabel("Enter Q4 Sales", 1, 9, 1, 2);
	    DoubleField q4Value = addDoubleField(0, 3, 9, 1, 1);
	    JTextArea output = addTextArea("", 4, 4, 10, 10);
	    DecimalFormat formatDec = new DecimalFormat("0.00");
	   
	    
	    int count = 0;
	    
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	    	if (buttonObj == inputInformation ) {
	    		count ++;
	    		String name = employeeName.getText();
	    		if (errorCheck() == true && count <= 10) {
	    			
	    			double q1 = q1Value.getNumber();
	    			double q2 = q2Value.getNumber();
	    			double q3 = q3Value.getNumber();
	    			double q4 = q4Value.getNumber();
	    			double total = q1+q2+q3+q4;
	    			output.append("Employee name: " + name + ",  Q1 Sales: $" +  formatDec.format(q1) + "  Q2 Sales: $" + formatDec.format(q2) + "  Q3 Sales: $" + formatDec.format(q3) + "  Q4 sales: $" + formatDec.format(q4) + "  Total Sales: $ " + formatDec.format(total));
	    			output.append("\n");
	    			AceWidget widget = new AceWidget(name, q1, q2, q3, q4);
	    		} else if (errorCheck() == false){
	    			messageBox("There is an invalid input");
	    		} else if (count>10) {
	    			messageBox("You have reached the maximum of 10 employees");
	    		}
	    		
	    	;
	    	
	    	}
	    }
	    
	   
	    public boolean errorCheck() {
	    	if (q1Value.isValidNumber() && q2Value.isValidNumber() && q3Value.isValidNumber() && q4Value.isValidNumber() && q1Value.getNumber()>=0 && q2Value.getNumber()>=0 && q3Value.getNumber()>=0 && q4Value.getNumber()>=0) 
	    		return true;
	    	else
	    		return false;
	    	}

	    public static void main(String[] args){
	    	
	        JFrame frm = new AceWidgetGUI();
	        frm.setTitle ("Ace Widget");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
