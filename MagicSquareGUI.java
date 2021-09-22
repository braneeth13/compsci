import java.lang.reflect.Array;

import javax.swing.*;
import BreezySwing.*;


public class MagicSquareGUI extends GBFrame{
	
	 	
	    IntegerField sizeField = addIntegerField (0,1,2,1,1);
	   
	   
	    JButton inputValues = addButton ("Input Values",4,1,2,1);
	   
	    GBPanel matrix = addPanel(3,2,1,1);
	    JLabel textLabel      = addLabel ("Size", 1,1,1,1);
	    JMenuItem item3 = addMenuItem ("Dimensions", "3 x 3");
	    JMenuItem item4 = addMenuItem ("Dimensions", "4 x 4");
	    JMenuItem item5 = addMenuItem ("Dimensions", "5 x 5");
	    JMenuItem item6 = addMenuItem ("Dimensions", "6 x 6");
	    JMenuItem item7 = addMenuItem ("Dimensions", "7 x 7");
	    JMenuItem item8 = addMenuItem ("Dimensions", "8 x 8");
	    
	    int size = 0;
	    
	     
	    public void buttonClicked(JButton buttonObj) {
	    	if (buttonObj == inputValues) {
	    		if (size == 0) {
	    			messageBox("Error: Please Select a size from the drop down titled 'Dimensions' ");
	    		} else {
	    			for (int i=0; i<size; i++) {
	    				for (int j=0; i<size; j++) {
	    					
	    				}
	    		
	    			
	    			}
	    		}
	    	}
	    }
	    
	    
	    
	    public void menuItemSelected(JMenuItem menuItem){
	    	
	        if (menuItem == item3) {
	            size = 3;
	        }
	        else if (menuItem == item4) {
	            size = 4;
	        }
	        else if (menuItem == item5) {
	            size = 5;
	    	}
	        else if (menuItem == item6) {
	            size = 6;
	        }
	        else if (menuItem == item7) {
	            size = 7;
	        }
	        else if (menuItem == item8) {
	        	size = 8;
	        	
	        }
	        
	        
	        
	        
	        
	        
	    }
	   

	    public static void main(String[] args){
	    	
	        JFrame frm = new MagicSquareGUI();
	        frm.setTitle ("Fraction");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
