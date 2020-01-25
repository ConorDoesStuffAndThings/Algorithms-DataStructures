public class QuestionThree {
    /*
    * Write and test a method
    * public static int countWords(String str) that returns a count of all the words in the string str.
    *  Words are separated by spaces. E.g  countWords(“A Star Is Born”) should return 4.
    * Use whatever methods of String class you wish (but do not use not regular expressions).
     */

    public static int countWords(String str){
        int countSpaces = 0;

        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                countSpaces++;
            }
        }
        return countSpaces+1;
    }
}
