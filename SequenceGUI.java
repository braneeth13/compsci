import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;
import BreezySwing.*;


public class SequenceGUI extends GBFrame{
	
	 	
	    //IntegerField sizeField = addIntegerField (0,1,2,1,1);
	   
	   
	    JLabel field = addLabel("Enter Values Here", 1, 1, 1, 1);
	    IntegerField intField = addIntegerField(0, 1, 3, 3, 3);
	    JButton inputValues = addButton ("Input Value", 2 ,1, 3, 3 );
	    JTextArea output = addTextArea("", 4, 4, 2, 2);
	    int [] array = new int [25];
	    int count = 0;
	    
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	    	
	    	if (buttonObj == inputValues) {
	    		if(errorCheck()==true) {
	    			if (count <25) {
	    				array[count] = intField.getNumber();
	    				output.append(intField.getNumber() + " ");
	    				count++;
	    				System.out.println(count);
	    			}
	    			if (count == 25) {
	    				messageBox("You have reached the maximum number of inputs");
	    			}
	    		}else if (errorCheck() == false) {
	    			messageBox("Invalid Input, please try again");
	    		}
	    	}
	    }
	    
	    public boolean errorCheck() {
	    	
	    	if (intField.isValidNumber()){
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    
	    }
	    public static void main(String[] args){
	    	
	        JFrame frm = new SequenceGUI();
	        frm.setTitle ("Sequence");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
