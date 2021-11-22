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
	    		//try main code 
	    		try{
	    			 phrase = field.getText();
		    		 phrase=phrase.trim();
	 	    		if(errorCheck(phrase)) {
	 	    		
	 	    			Parser parser = new Parser(phrase);
	 	    			parser.formatString();
	 	    			output.append(" " + parser.split());
	 	    		}  else {
		    			messageBox(error);
		    		}
	 	    		
	    		 } 
	    		 
	    		// one of two possible errors is num format 
	    		catch (NumberFormatException e) {
	    			 messageBox("Invalid inputs", 600, 100);
	    			 
	    		//other possible error is dividing by 0
	    		}catch(ArithmeticException e) {
	    			 messageBox("You cannot divide by 0");
	    		} catch(Exception e) {
	    			messageBox("Error - Nothing was inputted");
	    		}
	    			
	    		
	    	}
	    	if (buttonObj == reset) {
	    		output.setText("");
	    		field.setText("");
	    	}
	    	
	    }
	    //check if it starts with equals, everything else can be handled by try catch
	    public boolean errorCheck(String check) {
	    	boolean noEntry = false;
	    	
	    	
	    	
	    	if(phrase.charAt(0) != '=') {
	    		error = "All expressions need to start with '='";
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
