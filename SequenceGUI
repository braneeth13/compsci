import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.*;
import BreezySwing.*;


public class SequenceGUI extends GBFrame{
	
	 	
	    //IntegerField sizeField = addIntegerField (0,1,2,1,1);
	   
	   
	    JLabel field = addLabel("Enter Values Here", 1, 1, 1, 1);
	    IntegerField intField = addIntegerField(0, 1, 3, 3, 3);
	    JButton inputValues = addButton ("Input Value", 2 ,1, 3, 3 );
	    JTextField output = addTextField("", 4, 4, 2, 2);
	    int [] array = new int [25];
	    public void buttonClicked(JButton buttonObj){ //button click "sensor"
	    	int count = 0;
	    	if (count <=25) {
	    		if (buttonObj == inputValues) {
	    			array[count] = intField.getNumber();
	    			output.setText(Arrays.toString(array));
	    		}
	    		count++;
	    	}
	    }

	    public static void main(String[] args){
	    	
	        JFrame frm = new SequenceGUI();
	        frm.setTitle ("Sequence");
	        frm.setSize (700, 200);
	        frm.setVisible (true);
	   }

}
