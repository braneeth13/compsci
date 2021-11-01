import javax.swing.*;
import BreezySwing.*;

public class Main extends GBFrame{
	int ctr = 0;
	int[] nums = new int [26];
	int[] longestIndex = new int [12];
	NonDecreasing calculator = new NonDecreasing();	

	JLabel numLabel 		= addLabel ("Number 1/25:",        1,1,1,1);
	IntegerField numField	= addIntegerField (0,              1,2,1,1);
	
	
	JButton Enter          = addButton ("Enter Number",        1,2,1,1);
	JButton View       	   = addButton ("View Sequence",       2,1,1,1);
	JButton Output         = addButton ("Output",        	   2,2,1,1);
	JButton Reset		   = addButton ("Reset",			   2,3,1,1);
	
    public void buttonClicked(JButton buttonObj){ //button click "sensor"
    		if (buttonObj == Enter) {
    			if(ctr == 25) { //limit number amount
    				numLabel.setText("Number " + "25" + "/25" + ":");
    				messageBox("Number limit reached");
    			}else { //error checking
    				if(numField.getText().isBlank()) {
	    				messageBox("Please enter a number");
	    			}else {
	    				//take in number
		    			nums[ctr] = numField.getNumber();
		    			ctr++;
		    				
		    			//reset fields
		    			numField.setText("");
		    			numLabel.setText("Number " + (ctr+1) + "/25" + ":");
		    			
		    			numField.grabFocus();
	    			}
    			}
    }
    		
    		if (buttonObj == Output) {
    			//outputs
    			int maxLen = calculator.getSeqlength(nums, ctr);
    			messageBox("The longest non-decreasing sequence is " + calculator.getSeqlength(nums, ctr) + " numbers long", 500 , 250);
    			
    			longestIndex = calculator.getSeqIndex(nums, ctr, maxLen);
    			
    			//adjusting labels
    			numLabel.setText("Number " + (ctr+1) + "/25" + ":");
    			numField.setText("");
    			
    		}
    		
    		if (buttonObj == Reset) {
    			//reset array
    			for(int i = 0; i < nums.length; i++) {
    				nums[i] = 0;
    			}
    			
    			ctr = 0;
    			//reset fields
    			numField.setText("");
    			numLabel.setText("Number 1/25:");
    		}
    		
    		
    		if (buttonObj == View) {
    			String viewSequence = "";
    			for (int i = 0; i < ctr; i++) {
    				viewSequence += nums[i];
    				viewSequence += " ";
    			}
    			messageBox(viewSequence , 500 , 100);
    		}
	    }

	
	public static void main(String[] args) {
		
		
		JFrame frm = new Main();
		frm.setTitle ("Non-Decreasing Numbers");
	    frm.setSize (500, 400);
	    frm.setVisible (true);
	    
	    
	    
	}       
	  	
}
