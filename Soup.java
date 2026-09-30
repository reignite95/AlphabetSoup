//Name: Rehan Khan
//Date: 09/29/26
//Description: This program will spell out specific words based on user input. 


public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    //Precondition: You must type in a string
    //Postcondition: The word you input gets added to the string letters
    public void add(String word){
        letters += word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    //Precondition: there must be characters in the variable "letters"
    //Postcondition: returns a random letter in string "letters"
    public char randomLetter(){
        int randomIndex = (int)(Math.random() * (letters.length() - 1));
        return letters.charAt(randomIndex);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    //Precondition: You must have inputted a company name and added a word to letters
    //Postcondition: Places the company name directly in the center of the string letters. Returns letters
    public String companyCentered(){
        String index1 = letters.substring(letters.length() / 2);
        String index2 = letters.substring(0, letters.length() / 2);
        String lettersCentered = index2 + company + index1;
        return lettersCentered;
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    //Precondtion: You must have characters in the string letters, and a vowel for it to remove.
    //Postcondition: Removes the first vowel. If there is no vowel nothing happens.
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[aeiouAEIOU]", "");
    }

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    //Precondition: There must be characters in the string letters
    //Postcondition: Removes the amount of letters specified from the user in a random spot
    public void removeSome(int num){
        int index = (int)(Math.random() * letters.length() - num);
        letters = letters.substring(0, index) + letters.substring(index + num);
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    //Precondition: Must be characters in the string letters
    //Postcondition: Removes the word in the string letters specified by the user. If the word isn't there nothing happens.
    public void removeWord(String word){
        letters = letters.replaceFirst(word, "");
    }
}
