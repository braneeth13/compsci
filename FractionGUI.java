import javax.swing.*;
import BreezySwing.*;


public class FractionGUI extends GBFrame{
	
		JTextArea outputArea  = addTextArea ("", 4,4,2,5);
		//fraction 1 input
	    JLabel numerator1label      = addLabel ("Fraction 1 Numerator", 1,1,1,1);
	    IntegerField num1field = addIntegerField (0,1,2,1,1);
	    JLabel denominator1label         = addLabel ("Fraction 1 Denominator", 2,1,1,1);
	    IntegerField denom1field    = addIntegerField (0, 2,2,1,1);
	    
	    //fraction 2 input
	    JLabel numerator2label      = addLabel ("Fraction 2 Numerator", 1,3,1,1);
	    IntegerField num2field = addIntegerField (0,1,4,1,1);
	    JLabel denominator2label         = addLabel ("Fraction 2 Denominator",2,3,1,1);
	    IntegerField denom2field    = addIntegerField (0,2,4,1,1);
	    
	    JButton input                 = addButton ("Input",3,1,2,1);
	    
	    
	    Fraction fraction;
    // Use if/else statement to determine which button is clicked
	    	    
	    public void buttonClicked(JButton buttonObj){
	    	
	    	
	    	
	    	if (buttonObj == input){
	    		
	    		
	    	      
	    	      
	            //separate if statements to check for valid int input, messages the field name if invalid
	        	if (! num1field.isValidNumber() || num1field.getNumber() < 0 ) {
	            	messageBox("Error: Bad number format in Numerator 1 Field");
	            	
	            	
	            }
	        	
	        	
	        	if (! num2field.isValidNumber() || num2field.getNumber() < 0) {
	            	messageBox("Error: Bad number format in Numerator 2 Field	");
	            	
	            	
	            }
	            
	            
	            if (! denom1field.isValidNumber() || denom1field.getNumber() == 0 || denom1field.getNumber() < 0) {
	            	messageBox("Error: Bad number format in Denominator 1 Field");
	            	
	            	
	            }
	           
	            
	            if (! denom2field.isValidNumber() || denom2field.getNumber() == 0 || denom2field.getNumber() < 0) {
	            	messageBox("Error: Bad number format in Denominator 2 Field");
	            	
	            	
	            	
	            }
	            
	            
	            System.out.println(num1field.getNumber());
	            Fraction fraction = new Fraction(num1field.getNumber(), num2field.getNumber(), denom1field.getNumber(), denom2field.getNumber());
	            //ystem.out.println(String.valueOf(fraction.findGCF()));
	            
	            
	            
	            if(fraction.numMultiply() == fraction.denomMultiply()){
	            	outputArea.setText(String.valueOf(1));
	            } else if (fraction.numMultiply() != 0 && fraction.denomMultiply() != 1) {
	            	outputArea.setText (String.valueOf(fraction.numMultiply()) + "/" + String.valueOf(fraction.denomMultiply()));
	            } else if (fraction.numMultiply() == 0) {
	            	outputArea.setText(String.valueOf(0));
	            } else if (fraction.denomMultiply() == 1) {
	            	outputArea.setText(String.valueOf(fraction.numMultiply()));
	            } else if(fraction.numMultiply()/fraction.denomMultiply() == -1 ) {
	            	outputArea.setText(String.valueOf(-1));
	            }
	         }
	            
	        
	        
	        
	        
	        
	     	        
	    }
	    
	   

	    public static void main(String[] args){
	    	
	        JFrame frm = new FractionGUI();
	        frm.setTitle ("Fraction");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
