public class Character {
	private String phrase;
	
	public Character (String sentence) {
		phrase = sentence;
	}
	
	//method to count characters
	public int countCharacters() {
		String withoutSpaces = phrase.replace(" ", "");
		return withoutSpaces.length();
	}
	//method to count words
	public int words() {
		String output = " ";
		int words = 0;
		//loop through sentence
		for(int i =0; i<phrase.length(); i++) {
			//if a space character is found, increment count
			
		}
		
		return words;
	}

	public static Boolean isLetter(char c) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
