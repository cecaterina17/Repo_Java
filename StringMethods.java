package Class6;

public class StringMethods {

        public static String abbreviation(String input){
            String[] wordArray= input.split(" ");
            String result = "";
            int i=0;
            do {
                result += wordArray[i].substring(0,1).toUpperCase();
                i++;
            } while (i< wordArray.length);
            return result;
        }


        /**
         *  Q2
         *  Create a method that will change the given sentence in Titlecase
         *  Method should return
         *  Purpose - user provides string, method turns each word to Titlecase
         *  Requires only 1 input
         *  - I need to split sentence into separate words
         *  - Using loop, manipulate first char of every word
         *  - Add all words to empty string variable
         *  - At the end, I should remove extra space at the end/beginning
         */
        public String toTitleCase(String input){
            String[] wordArray = input.split(" ");
            String result = "";
            int i=0;
            while (i<wordArray.length){
                result += wordArray[i].substring(0,1).toUpperCase()+wordArray[i].substring(1).toLowerCase()+" ";
                i++;
            }
            result = result.trim();
            return result;
        }


        /**
         * Q4
         * Create a method to find if the given string is palindrome (DO NOT ignore case)
         * Method should return (boolean)
         * Purpose - method checks if string is identical when reading backwards.
         * - I need to reverse characters and compare that to original string
         * - I can create empty String var and place reversed String there using array and split method
         * - Method .equals() should give boolean value
         * - Finally I will return boolean value
         */
        public boolean isPalindrome(String input){
            String[] charArray = input.split("");
            String revWord = "";
            int i= charArray.length-1;
            do {
                revWord += charArray[i];
                i--;
            } while (i >= 0);
            boolean isWordPalindrome = input.equals(revWord);
            return isWordPalindrome;
        }


}
