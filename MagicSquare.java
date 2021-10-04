import java.util.Arrays;

public class MagicSquare {
	public boolean validSquare = false;
	public int [][] values;
	
	public MagicSquare (int [][] values) {
		values = values;
		System.out.println(Arrays.deepToString(values));
	}
	
	public boolean isMagicSquare() {
		int N = values.length;
		System.out.print("size is" + N);
		
		// sumd1 and sumd2 are the sum of the two diagonals
        int sumd1 = 0,sumd2=0;
        for (int i = 0; i < N; i++)
        {
            // (i, i) is the diagonal from top-left -> bottom-right
               // (i, N - i - 1) is the diagonal from top-right -> bottom-left
            sumd1 += values[i][i];
               sumd2 += values[i][N-1-i];
        }
    // if the two diagonal sums are unequal then it is not a magic square
        if(sumd1!=sumd2)
            return false;
 
        // calculating sums of Rows and columns and checking if they are equal to each other,
        // as well as equal to diagonal sum or not
        for (int i = 0; i < N; i++) {
 
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < N; j++)
            {
                rowSum += values[i][j];
                colSum += values[j][i];
            }
            if (rowSum != colSum || colSum != sumd1)
                return false;
        }
 
 
        return true;
    }
		
}
	

