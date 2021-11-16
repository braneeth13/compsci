import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;
import BreezySwing.*;


public class ParserGUI extends GBFrame{
	
	 	
	    //IntegerField sizeField = addIntegerField (0,1,2,1,1);
	   
	   
	    JLabel label = addLabel("Enter your expression here", 1, 1, 1, 1);
	    JTextField field = addTextField ("",1 , 2, 4, 4);
	    JTextArea output = addTextArea("", 1, 4, 10, 10);
	    
	    //buttons to input , view characteristics, reset, and exit program
	    JButton input = addButton ("Input", 2,3, 1, 1 );
	    JButton reset = addButton("Reset", 4, 3, 1, 1);
	    
	    String phrase = "";
	    String error = "";
	 
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	    	if (buttonObj == input) {
	    		phrase = field.getText();
	    		if (errorCheck(phrase)) {
	    		
	    			Parser parser = new Parser(phrase);
	    			output.append(" " + parser.split());
	    			
	    			
	    			
	    			
	    			
	    			
	    			
	    			
	    			
	    			
	    			
	    			
	    			
	    		} else {
	    			messageBox(error);
	    		}
	    		
	    		
	    	
	    		
	    		
	    	}
	    	if (buttonObj == reset) {
	    		output.setText("");
	    		field.setText("");
	    	}
	    	
	    }
	    
	    public boolean errorCheck(String check) {
	    	if(phrase.charAt(0) != '=') {
	    		error = "All expressions need to start with '='";
	    		return false;
	    	}
	    	int counter = 0;
	    	for(int i = 0;i<phrase.length(); i++) {
	    		if(phrase.charAt(i) == '+' || phrase.charAt(i) == '-' || phrase.charAt(i) == '*' || phrase.charAt(i) == '/'){
	    			counter++;
	    		}
	    	}
	    	if(counter==0) {
	    		error = "No operation was inputted";
	    		return false;
	    	} else if(counter >1) {
	    		error = "You have more than one operation";
	    		return false;
	    	}
	    	
	    	return true;
	    	
	    }
	    
	    
	    public static void main(String[] args){
	    	
	        JFrame frm = new ParserGUI();
	        frm.setTitle ("4-Function Calculator");
	        frm.setSize (900, 200);
	        frm.setVisible (true);
	   }
	    
}
