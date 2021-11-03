
public class Sequence {
	int longest = 0;
    int temporary = 1; //temporary length
    int repeat = 1; //tracks number of longest sequences
    int [] repeatIndex = new int [12]; //maximum 12 different sequences - keeps track of position of longest sequence
    

	
 

    //setters for when reset button is pressed: reset all variables to the values above
	public void setLongest(int longest) {
		this.longest = longest;
	}
	
	public void setCurrent(int current) {
		this.temporary = current;
	}

	public void setRepeat(int repeat) {
		this.repeat = repeat;
	}

	public void setRepeatIndex(int[] repeatIndex) {
		this.repeatIndex = repeatIndex;
	}






	//find the longest sequence length
	public int getSequenceLength(int [] array, int count) {
        for (int i = 1; i <= count; i++) {
            if (array [i] >= array [i-1]) { //reg case --> if the index is greater than the one before, increase length by 1
                temporary++;
            }
            else {
                if (temporary > longest) { // if new longest sequence is found, change longest
                    longest = temporary;
                    repeatIndex [repeat] = i - temporary; 
                }
                else if (temporary == longest) {  //if same longest length
                    repeatIndex [repeat] = i - temporary; 
                    repeat++;
                }
                temporary = 1;
            }
            
        }
        return longest;
    }
    
    
    
    
    
    
    
    public String getLongestSequence(int [] array) {
        String longestSequence = "";
        if (repeat > 1) { //if there are multiple longest sequences
            for (int i = 0; i < repeat; i++) {
                for (int j = 0; j < longest; j++) {
                    longestSequence += (array[repeatIndex[i] + j] + " "); //use the starting index of longest sequences
                }
                longestSequence += "   ";
            }
        }
        else { //if there is only one longest sequence
            for (int i = 0; i < longest; i++) {
                longestSequence += (array[repeatIndex[repeat] + i] + " ");
            }
        }
        return longestSequence;
    }


}
