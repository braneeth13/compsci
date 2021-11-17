public class Parser {
	private String phrase;
	private int num1;
	private int num2;
	
	public Parser (String sentence) {
		phrase = sentence;
	}
	
	public void formatString() {
		int firstIndex = 0;
		phrase = phrase.trim();
		for(int i = 0;i<phrase.length();i++) {
			if (Character.isDigit(phrase.charAt(i)) && Character.isWhitespace(phrase.charAt(i+1))){
				firstIndex = i;2
			}
			
		}
	}
	
	public double split() {
		String number1 = "";
		String number2 = "";
		char operation = ' ';
		int index = 0;
		for(int i=0; i<phrase.length();i++){
			if(phrase.charAt(i) == '+' || phrase.charAt(i) == '-' || phrase.charAt(i) == '*' || phrase.charAt(i) == '/') {
				number1 = phrase.substring(1,i);
				number2 = phrase.substring(i+1);
				operation = phrase.charAt(i);
				index = i;
			}
		}
		
		num1 = Integer.parseInt(number1);
		num2 = Integer.parseInt(number2);
		
		double value = 0;
		
		if(phrase.charAt(index) == '+') {
			value = num1+num2;
		} else if(phrase.charAt(index) == '-') {
			value = num1-num2;
		} else if(phrase.charAt(index) == '*') {
			value = num1*num2;
		} else if(phrase.charAt(index) == '/') {
			double div1 = num1;
			double div2 = num2;
			value = div1/div2;
		}
		
		return value;
	}
	public boolean spaceCheck() {
		
		
		return true;
		
		
	}
	
}
