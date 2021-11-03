import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;
import BreezySwing.*;


public class SequenceGUI extends GBFrame{
	
	 	
	    //IntegerField sizeField = addIntegerField (0,1,2,1,1);
	   
	   
	    JLabel field = addLabel("Enter Values Here", 1, 1, 1, 1);
	    IntegerField intField = addIntegerField(0, 1, 2, 1, 3);
	    
	    //buttons to input value, view the longest sequence, reset, and exit program
	    JButton inputValues = addButton ("Input Value", 1 ,2, 1, 1 );
	    JButton view = addButton("View Longest Sequence ", 7, 1, 1, 1);
	    JButton reset = addButton("Reset", 7, 3, 1, 1);
	    JButton exit = addButton("Exit", 7, 7, 1, 1);
	    
	    JTextArea output = addTextArea("", 1, 4, 5, 1);
	    int [] array = new int [25];
	    int count = 0;
	    
	    Sequence sequence = new Sequence();
	    
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	    	
	    	if (buttonObj == inputValues) {
	    		
	    		
	    		if(errorCheck()==true) {
	    			if (count <25) {
	    				array[count] = intField.getNumber();
	    				output.append(intField.getNumber() + " ");
	    				count++;
	    				//System.out.println(count);
	    			}
	    			if (count == 25) {
	    				messageBox("You have reached the maximum number of inputs");
	    			}
	    		}else if (errorCheck() == false) {
	    			messageBox("Invalid Input, please try again");
	    		}
	    		
	    		intField.setNumber(0); // reset box
	    	}
	    	
	    	if (buttonObj == view) {
	    		int num = array[0];
	    		boolean allEqual = false;
	    		for (int i = 0; i<array.length;i++ ) {
	    			if (num == array[i]) {
	    				allEqual = true;
	    			} else {
	    				allEqual = false;
	    			}
	    		
	    		}
	    		System.out.println(allEqual);
	    		
	    		messageBox("Length of longest sequence: " + sequence.getSequenceLength(array, count) + "The Longest Sequence(s) : " + sequence.getLongestSequence(array) );
	    		
	    		//after longest sequence is output, reset all variables in case we need to run through array again for longest sequence
	    		sequence.setLongest(0);
	    		sequence.setCurrent(1);
	    		sequence.setRepeat(1);
	    		sequence.setRepeatIndex(new int [12]);
	    		
	    		intField.setNumber(0);
	    	}
	    	
	    	if (buttonObj == reset) {
	    		for (int i = 0; i<25; i++) {
	    			array[i] = 0;
	    			count = 0;
	    			
	    		}
	    		sequence.setLongest(0);
	    		sequence.setCurrent(1);
	    		sequence.setRepeat(1);
	    		sequence.setRepeatIndex(new int [12]);
	    		output.setText("");
	    	}
	    	
	    	if(buttonObj ==exit) {
	    		System.exit(0);
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
	        frm.setSize (900, 200);
	        frm.setVisible (true);
	   }

}
