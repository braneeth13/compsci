import java.util.Arrays;

public class MagicSquare {
	public boolean validSquare = false;
	private int [][] values;
	
	public MagicSquare (int [][] array) {
		values = array;
		System.out.println(Arrays.deepToString(values));
	}
	
	public boolean isMagicSquare() {
		int length = values.length;
		
		// Sum of the diagonals
        int diag1 = 0,diag2=0;
        for (int i = 0; i < length; i++){
            // i, i is top left to bottom right
            // i, length - 1 - i top right to bottom left
        	diag1 += values[i][i];
        	diag2 += values[i][length-1-i];
        }
        // Check if sum of diagonals is equal
        if(diag1!=diag2) {
        	return false;
        }
            
 
        // Calculate sum of rows, columns + check whether they are equal to diagonals
        for (int i = 0; i < length; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < length; j++) {
                rowSum += values[i][j];
                colSum += values[j][i];
            }
            if (rowSum != colSum || colSum != diag1) {
                return false;
            }
        }
 
 
        return true;
    }
	
	public int squareNumber() {
		int sum = 0;
		for (int i = 0; i < values.length; i++){
            // i, i is top left to bottom right
            // i, length - 1 - i top right to bottom left
        	sum += values[i][i];
        }
		return sum;
	}
		
}
	
