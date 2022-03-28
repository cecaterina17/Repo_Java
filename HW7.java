package Class6;

public class HW7 {
    public static void main(String[] args) {

        // Homework 7
        // Due 03/27/22

        /**
         *  Q1
         *  Using method for abbreviation
         */
        System.out.println("\n1)");
        String carCompany = StringMethods.abbreviation("Not my type of methode to learN");
        System.out.println(carCompany);


        /**
         *  Q2
         * Using a method to change the sentence to Titlecase
         */
        System.out.println("\n2)");
        StringMethods stringObject = new StringMethods();
        String sentenceTitlecase = stringObject.toTitleCase("Do not punish anyone for YOUR mistakes");
        System.out.println(sentenceTitlecase);


        /**
         * Q3:
         * Create method to find the maximum value from int-array
         */
        System.out.println("\n3)");
        int[] numArray = {1,576,3,0,5,-100};
        ArrayMethods arrayObject = new ArrayMethods();
        int maxArrayValue =arrayObject.maxArrayValue(numArray);
        System.out.println("Maximum value of array --> "+maxArrayValue);


        /**
         * Q4
         * Create a method to find if the given string is palindrome (DO NOT ignore case)
         * Method should return (boolean)
         */
        System.out.println("\n4)");
        String wordToCheck = "level";
        boolean isWordPalindrome = stringObject.isPalindrome(wordToCheck);
        System.out.println("Is word '"+wordToCheck+"' Palindrome? --> "+isWordPalindrome);


        /**
         * Q5
         * Create a method to find the longest String in the given String-array
         * Method should return (String)
         */
        System.out.println("\n5)");
        String[] NameTitles = {"Ghenadie Rusu","Ecaterina", "Ana Maria Ru"};
        String longestNameTitle = ArrayMethods.longestString(NameTitles);
        System.out.println("Longest Name title --> "+longestNameTitle);
    }
}

