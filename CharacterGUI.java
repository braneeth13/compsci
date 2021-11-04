import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;
import BreezySwing.*;


public class CharacterGUI extends GBFrame{
	
	 	
	    //IntegerField sizeField = addIntegerField (0,1,2,1,1);
	   
	   
	    JLabel label = addLabel("Enter the string here", 1, 1, 1, 1);
	    JTextField field = addTextField ("",1 , 2, 4, 4);
	    
	    //buttons to input value, view the longest sequence, reset, and exit program
	    JButton input = addButton ("Input", 1 ,2, 1, 1 );
	    
	    String phrase = "";
	 
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	    	if (buttonObj == input) {
	    		phrase = field.getText();
	    	}
	    }
	    
	    public boolean errorCheck() {
	    	
	    	if (2==2){
	    		return true;
	    	}
	    	else {
	    		return false;
	    	}
	    
	    }
	    public static void main(String[] args){
	    	
	        JFrame frm = new CharacterGUI();
	        frm.setTitle ("cHARACTER");
	        frm.setSize (900, 200);
	        frm.setVisible (true);
	   }
}
