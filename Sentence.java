import java.util.Arrays;

public class Sentence {
	private String phrase;
	private int wordCount;
	private String [] array;
	private String [] alphabetical;
	
	public Sentence (String sentence) {
		phrase = sentence;
	}
	
	//method to count characters
	public int countCharacters() {
		String trimmed = phrase.trim(); // trim leading and trailing spaces
		int number = 0;
		
		for(int i=0;i<trimmed.length();i++) {
			if(Character.isWhitespace(trimmed.charAt(i)) == false) {
				number++;
			}
		}
		return number;
	}
	
	public String[] split() {
        int count = 0;
        String s = phrase.trim();
        boolean b = true;
        while(b) {
        	b = false;
        	for(int i=0;i<s.length()-1;i++) {
        		if(Character.isWhitespace(s.charAt(i)) && Character.isWhitespace(s.charAt(i+1))) {
        			b=true;
        			s = s.substring(0,i) + " " + s.substring(i+2);
        			break;
        		}
        	}
        }
        if (Character.isLetter(s.charAt(s.length()-1)) == false && Character.isDigit(s.charAt(s.length()-1)) == false  && Character.isLetter(s.charAt(s.length()-2)) == false && Character.isDigit(s.charAt(s.length()-2)) == false) {
        	s=s.substring(0,s.length()-1);
        } else if(Character.isLetter(s.charAt(s.length()-1)) == false && Character.isDigit(s.charAt(s.length()-1)) == false) {
        	s=s.substring(0,s.length()-1);
        }
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                count++;
            }
        }
        int k = 0;
        String temporary = "";
        array = new String[count + 1];
        alphabetical = new String[count+1];
       
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                array[k++] = temporary;
                temporary = "";
            } else
            	temporary = temporary + c[i];
        }
       
        array[k] = temporary;
        wordCount = array.length;
        return array;
    }
	
	
	public String getFrequency() {
		String output= "";
		
		for(int i=0; i<array.length; i++) {
			Boolean checkDuplicate = false;
			for (int j=0; j<i; j++) {
				if(array[i].equalsIgnoreCase(array[j])) {
					checkDuplicate = true;
					break;
				}
			}
			if(checkDuplicate == false) {
				int count = 0;
				for(int j = i;j<array.length; j++) {
					if(array[i].equalsIgnoreCase(array[j])) {
						count++;
					}
				}
				alphabetical[i] = array[i].substring(0,1).toUpperCase() + array[i].substring(1);
				output += array[i].substring(0,1).toUpperCase() + array[i].substring(1) + " - " + count + "\n";
			}
		}
		return output;
	}
	
	//method to count words
	public int words() {
		
	
		return wordCount;
	}
	
	
	//Extra credit - sort by alphabetical order
	public String alphabeticalOrder() {
	    String output = "";
		for (int i = 0; i <= alphabetical.length - 1; i++) { //loop through array called Alphabetical - which is set to equal to array created earlier of all unique words
	        for (int j = 1; j < alphabetical.length - i; j++) { //Using Bubble sort
	            if (CompareString(alphabetical[j - 1], alphabetical[j]) == 1) { //Pass the two strings into method to compare them 
	                String temp = alphabetical[j - 1]; //set to temporary string
	                alphabetical[j - 1] = alphabetical[j];
	                alphabetical[j] = temp;
	            }
	        }
	    }

	    for (int i = 0; i <= alphabetical.length - 1; i++) {
	     output += alphabetical[i] + "\n"; //add the word to output, then go and find next in alphabetical order
	    }
	    return output;
	}
	
	private static int CompareString(String one, String two) {
	    int len;

	    if (one.length() >= two.length())  //find length of smaller string
	        len = two.length();
	    else
	        len = one.length();

	    for (int i = 0; i <= len; i++) { //loop through string
	        if (one.charAt(i) > two.charAt(i))  //Suppose the first string letters is greater then return 1; 
	            return 1;
	        else if (one.charAt(i) < two.charAt(i)) //if second string letter is greater then return -1;
	            return -1;
	    }
	    return 0;  //if both the equal then return 0
	}

	
	
	
	
}
