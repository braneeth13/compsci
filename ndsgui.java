
public class NonDecreasing {

	public NonDecreasing()//default constructor
	{
		
	}
	
	public int getSeqlength(int[] a, int arrLen) {
		int len = 1;
		int longestLen = 0;
		for (int i = 1; i <= arrLen; i++) {
			if(a[i] >= a[i-1]) {
				len++;
			}else {
				if(len > longestLen) {
					longestLen = len;
				}
				len = 1;
			}
		}
		return longestLen;
	}
	
	
	public int[] getSeqIndex(int[] a, int arrLen, int maxLen) {
		int len = 1;
		int tempIndex = 0;
		int[] seqIndex = new int[12];
		for (int i = 0; i <= 13; i++) {
			for (int j = (tempIndex + maxLen); j <= arrLen; j++) {
				if (len != maxLen) {
					if(a[j] >= a[j-1]) {
						if(j == 1) {
							tempIndex = j;
						}
						len++;
					}
				}else if(len == maxLen) {
					seqIndex[i] = tempIndex;
				}
			}
		}
			
		return seqIndex;
				
	}
	
}
