import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import BreezySwing.*;

public class Tester extends GBFrame{
			
	    JLabel degreesFahrenheitLabel      = addLabel ("Degrees Fahrenheit", 1,1,1,1);
	    DoubleField degreesFahrenheitField = addDoubleField (32.0,           1,2,1,1);
	    JLabel degreesCelsiusLabel         = addLabel ("Degrees Celsius",    2,1,1,1);
	    DoubleField degreesCelsiusField    = addDoubleField (0.0,            2,2,1,1);
	    JButton fToCButton                 = addButton ("F to C",            3,1,1,1);
	    JButton cToFButton                 = addButton ("C to F",            3,2,1,1);
	    JButton reset = addButton ("Reset", 4,1,5,1 );
	    
    // Use if/else statement to determine which button is clicked
	    	    
	    public void buttonClicked(JButton buttonObj){
	        double fahrenheit, celsius;
	        if (buttonObj == fToCButton){
	            if (! degreesFahrenheitField.isValidNumber()) {
	            	messageBox("Error: Bad number format in Fahrenheit field!");
	            }
	        	fahrenheit = degreesFahrenheitField.getNumber();
	            celsius = (fahrenheit  - 32) * 5.0 / 9.0;
	            degreesCelsiusField.setNumber (celsius);
	        }
	        else if (buttonObj == reset ) {
	        	degreesCelsiusField.setNumber(0);
	        	degreesFahrenheitField.setNumber(0);

	        }
	        else {
	        	if (! degreesCelsiusField.isValidNumber()) {
	            	messageBox("Error: Bad number format in Celsius field!");
	            }
	            celsius = degreesCelsiusField.getNumber();
	            fahrenheit = celsius * 9.0 / 5.0 + 32;
	            degreesFahrenheitField.setNumber (fahrenheit);
	        }
	        
	        
	        
	    }
	    
	   

	    public static void main(String[] args){
	    	
	        JFrame frm = new Tester();
	        frm.setTitle ("Temperature Conversion");
	        frm.setSize (500, 150);
	        frm.setVisible (true);
	   }

}
