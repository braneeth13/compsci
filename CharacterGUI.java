import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;
import BreezySwing.*;


public class CharacterGUI extends GBFrame{
	
	 	
	    //IntegerField sizeField = addIntegerField (0,1,2,1,1);
	   
	   
	    JLabel label = addLabel("Enter the string here", 1, 1, 1, 1);
	    JTextField field = addTextField ("",1 , 2, 4, 4);
	    JTextArea output = addTextArea("", 1, 4, 10, 10);
	    
	    //buttons to input , view characteristics, reset, and exit program
	    JButton input = addButton ("Input", 2,3, 1, 1 );
	    JButton reset = addButton("Reset", 4, 3, 1, 1);
	    
	    String phrase = "";
	 
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	    	if (buttonObj == input) {
	    		phrase = field.getText();
	    		
	    		Character character = new Character(phrase);
	    		output.append("The number of characters is " + character.countCharacters());
	    		output.append("\n");
	    		output.append("The number of words is " + character.words());
	    		output.append("\n");
	    		
	    		
	    	
	    		
	    		
	    	}
	    	if (buttonObj == reset) {
	    		output.setText("");
	    		field.setText("");
	    	}
	    	
	    }
	    
	    public boolean errorCheck() {
	    	
	    	return true;
	    }
	    
	    
	    public static void main(String[] args){
	    	
	        JFrame frm = new CharacterGUI();
	        frm.setTitle ("cHARACTER");
	        frm.setSize (900, 200);
	        frm.setVisible (true);
	   }
	    
}
