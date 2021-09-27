import java.lang.reflect.Array;

import javax.swing.*;
import BreezySwing.*;


public class MagicSquareGUI extends GBFrame{
	
	 	
	    IntegerField sizeField = addIntegerField (0,1,2,1,1);
	   
	   
	    JButton inputSize = addButton ("Input Size",4,1,2,1);
	   
	    GBPanel matrix = addPanel(3,2,1,1);
	    JLabel textLabel      = addLabel ("Size", 1,1,1,1);
	    JMenuItem item3 = addMenuItem ("Dimensions", "3 x 3");
	    JMenuItem item4 = addMenuItem ("Dimensions", "4 x 4");
	    JMenuItem item5 = addMenuItem ("Dimensions", "5 x 5");
	    JMenuItem item6 = addMenuItem ("Dimensions", "6 x 6");
	    JMenuItem item7 = addMenuItem ("Dimensions", "7 x 7");
	    JMenuItem item8 = addMenuItem ("Dimensions", "8 x 8");
	    GBPanel gridPanel = addPanel(new GBPanel(), 1, 1, 1, 1);
	    
	    int size = 0;
	    IntegerField[][] grid = new IntegerField[8][8];
	    int [][] intGrid = new int [8][8];
	     
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	        gridPanel.removeAll();
	        for (int x = 0; x < size; x++) {
	            for (int y = 0; y < size; y++) {
	                grid[x-1][y-1] = gridPanel.addIntegerField(0, x + 1, y + 1, 1, 1);
	            }
	        }
	        
	        
	        
	        //refresh panel
	        gridPanel.setVisible(false);
	        gridPanel.setVisible(true);
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
