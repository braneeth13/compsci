public class Sequence {
	public int [][]values;
	
	public Sequence (int[] array) {
		array = array;
	}
	
	
	
	public String getLongest () {
		String output = "";
		
		int [][] array = new int [10][10];
		for (int i=0; i<values.length; i++) {
			if (values[i] ==values [i+1]) {
				output = output + " ";
			}
			
		}
		return "";
	}
}
