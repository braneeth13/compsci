public class Fraction {
	private int num1value;
	private int num2value;
	private int denom1value;
	private int denom2value;
	private int numeratorValue;
	private int denominatorValue;
	private int gcf;
	//private int finalNum;
	//private int finalDenom;
	;
	public Fraction(int num1, int num2, int denom1, int denom2) {
		num1value = num1;
		num2value = num2;
		denom1value = denom1;
		denom2value = denom2;
		
	}

	public int numMultiply() {
		numeratorValue = num1value * num2value;
		if (numeratorValue == 0) {
			return 0;
		} 
			denominatorValue = denom1value*denom2value;
			
			gcf = 0;

			if (numeratorValue > denominatorValue) {
				gcf = denominatorValue;
		    } else if(denominatorValue > numeratorValue) {
		    	gcf = numeratorValue;
			}else {
				gcf = numeratorValue;
			}
		
			Boolean found = false ;
			
			while (found == false) {
				if (numeratorValue % gcf == 0 && denominatorValue % gcf == 0){
					found = true;
				} else {
					gcf--;
				}
			}
			
			return numeratorValue/gcf;
		
		
	}
		
		//return numeratorValue;
	
	
	
	public int denomMultiply() {
		gcf = 0;
		if (numeratorValue == 0 )  {
			return 1;
		} 
		if (numeratorValue > denominatorValue) {
			gcf = denominatorValue;
	    } else if(denominatorValue > numeratorValue) {
	    	gcf = numeratorValue;
		} else {
			gcf=denominatorValue;
		}
	
		Boolean found = false ;
		
		while (found == false) {
			if (numeratorValue % gcf == 0 && denominatorValue % gcf == 0){
				found = true;
			} else {
				gcf--;
			}
		}
		
		
		return denominatorValue/gcf;
	}
	
	
	
	
	
}
