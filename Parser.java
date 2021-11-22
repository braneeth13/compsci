public class Parser {
	private String phrase;
	private int num1;
	private int num2;
	
	public Parser (String sentence) {
		phrase = sentence;
	}
	
	public void formatString() {
		 boolean b = true;
	        //loop through and replace of 2+ whitespaces with just 1 - taken from last program
		 	while(b) {
	        	b = false;
	        	for(int i=0;i<phrase.length()-1;i++) {
	        		if(Character.isWhitespace(phrase.charAt(i)) && Character.isWhitespace(phrase.charAt(i+1))) {
	        			b=true;
	        			phrase = phrase.substring(0,i) + " " + phrase.substring(i+2);
	        			break;
	        		}
	        	}
	        }
	}
	
	public double split() throws NumberFormatException, ArithmeticException {
		String number1 = "";
		String number2 = "";
		char operation = ' ';
		int index = 0;
		//we need to split the words, but cannot by operation if the expression starts with neg num
		for(int i=0; i<phrase.length()-1;i++){
			//if there's digit, whitespace, and non-digit (i.e. operator)
			if(i<phrase.length()-2 && Character.isDigit(phrase.charAt(i)) && Character.isWhitespace(phrase.charAt(i+1)) && !Character.isDigit(phrase.charAt(i+2))) {
				number1 = phrase.substring(1,i+2);
				number2 = phrase.substring(i+3); 
				operation = phrase.charAt(i+2);
				index = i+2;
				break;
			
			//if digit followed by nodigit
			} else if(Character.isDigit(phrase.charAt(i)) && !Character.isDigit(phrase.charAt(i+1))) {
				number1 = phrase.substring(1,i+1);
				number2 = phrase.substring(i+2); 
				operation = phrase.charAt(i+1);
				index = i+1;
				break;
			} 
		}
		//parse string into integer
		num1 = Integer.parseInt(number1.trim());
		num2 = Integer.parseInt(number2.trim());
		
		//double for division
		double value = 0;
		
		if(phrase.charAt(index) == '+') {
			value = num1+num2;
		} else if(phrase.charAt(index) == '-') {
			value = num1-num2;
		} else if(phrase.charAt(index) == '*') {
			value = num1*num2;
		} else if(phrase.charAt(index) == '/') {
			//doubles for division
			double div1 = num1;
			double div2 = num2;
			if(div2 == 0) {
				throw new ArithmeticException();
			}
			value = div1/div2;
		}
		
		return value;
	}
	
	
}
