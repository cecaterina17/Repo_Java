package Class6;
import java.util.Arrays;

public class HW5 {
    public static void main(String[] args) {

        // Due date: Sunday Mar 20
        /**
         * Q1:
         * Store a country name in a variable.
         * Print the name of country
         * Print the length of country name (NOTE: you CANNOT use length()-method from String class)
         *
         * Hint: you need to use split() method and length-variable (from Array)
         * System.out.println("Country name length = " + country.length());    // <-- CANNOT do it.
         */
        String mycountry = "Moldova";
        System.out.println("My Country = " + mycountry);
        String[] countryAfterSplit = mycountry.split("");
        int LenOfTheCountry = countryAfterSplit.length;
        System.out.println("Length of the word Moldova = " + LenOfTheCountry);


        /**
         * Q2:
         * Print the number of words in the sentence2-value
         */
        String sentence2 = "Never compare yourself to others, the only person that you need to compare yourself is you from the past.";
        String[] sentence2_AfterSplitBySpace = sentence2.split(" ");
        System.out.println("\n" + Arrays.toString(sentence2_AfterSplitBySpace));
        int length = sentence2_AfterSplitBySpace.length;
        System.out.println(length + " Number of the words in my sentence 'Never compare yourself to others, the only person that you need to compare yourself is you from the past.'");


        /**
         * Q3:
         * Create the abbreviation for 4-word sentence
         *
         * make America great again -> MAGA
         * outfit of the day -> OOTD
         * happy birthday to you -> HBTY
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */

        String sentence3 = "Be your best version of yourself every day";
        String sentence3_UC = sentence3.toUpperCase();
        String[] sentence3AfterSplit = sentence3_UC.split(" ");
        System.out.println("\n" + Arrays.toString(sentence3AfterSplit));
        char charAtIndex0 = sentence3_UC.charAt(0);
        char charAtIndex3 = sentence3_UC.charAt(3);
        char charAtIndex8 = sentence3_UC.charAt(8);
        char charAtIndex13 = sentence3_UC.charAt(13);
        char charAtIndex21 = sentence3_UC.charAt(21);
        char charAtIndex24 = sentence3_UC.charAt(24);
        char charAtIndex33 = sentence3_UC.charAt(33);
        char charAtIndex39 = sentence3_UC.charAt(39);
        System.out.println("\n" + charAtIndex0 + charAtIndex3 + charAtIndex8 + charAtIndex13 + charAtIndex21 + charAtIndex24 + charAtIndex33 + charAtIndex39);

        //second way using substring
        String sentence3_1 = "Be your best version of yourself every day ";
        String sentence3_1_UC = sentence3_1.toUpperCase();
        String[] sentence3_1AfterSplit = sentence3_1_UC.split(" ");
        System.out.println(sentence3_1AfterSplit[0].substring(0, 1) + sentence3_1AfterSplit[1].substring(0, 1) + sentence3_1AfterSplit[2].substring(0, 1) + sentence3_1AfterSplit[3].substring(0, 1) + sentence3_1AfterSplit[4].substring(0, 1) + sentence3_1AfterSplit[5].substring(0, 1) + sentence3_1AfterSplit[6].substring(0, 1) + sentence3_1AfterSplit[7].substring(0, 1));

        //2.
        String sentence33 = "Be your best version of yourself every day ";
        String sentence33_UP = sentence33.toUpperCase();
        String[] sentence33AfterSplit = sentence33_UP.split(" ");
        System.out.println("\n" + Arrays.toString(sentence33AfterSplit));

        char stnc2AtIndex0 = sentence33_UP.charAt(0);
        char stnc2AtIndex3 = sentence33_UP.charAt(3);
        char stnc2AtIndex8 = sentence33_UP.charAt(8);
        char stnc2AtIndex13 = sentence33_UP.charAt(13);
        char stnc2AtIndex21 = sentence33_UP.charAt(21);
        char stnc2AtIndex24 = sentence33_UP.charAt(24);
        char stnc2AtIndex33 = sentence33_UP.charAt(33);
        char stnc2AtIndex39 = sentence33_UP.charAt(39);
        System.out.println("\n" + stnc2AtIndex0 + stnc2AtIndex3 + stnc2AtIndex8 + stnc2AtIndex13 + stnc2AtIndex21 + stnc2AtIndex24 + stnc2AtIndex33 + stnc2AtIndex39);

        //2nd way using substring//
        String sentence2_2 = "IT is not for everyone ";
        String sentence2_2_UC = sentence2_2.toUpperCase();
        String[] sentence2_2AfterSplit = sentence2_2_UC.split(" ");
        System.out.println(sentence2_2AfterSplit[0].substring(0, 1) + sentence2_2AfterSplit[1].substring(0, 1) + sentence2_2AfterSplit[2].substring(0, 1) + sentence2_2AfterSplit[3].substring(0, 1) + sentence2_2AfterSplit[4].substring(0, 1));


        //3rd way of using //
        String sentence31 = "Fintech is the future";
        String sentence31_UP = sentence31.toUpperCase();
        String[] sentence31AfterSplit = sentence31_UP.split(" ");
        System.out.println("\n" + Arrays.toString(sentence31AfterSplit));

        char stnc3AtIndex0 = sentence31_UP.charAt(0);
        char stnc3AtIndex8 = sentence31_UP.charAt(8);
        char stnc3AtIndex11 = sentence31_UP.charAt(11);
        char stnc3AtIndex15 = sentence31_UP.charAt(15);
        System.out.println("\n" + stnc3AtIndex0 + stnc3AtIndex8 + stnc3AtIndex11 + stnc3AtIndex15);

        //third way using substring
        String sentence3_3 = "Fintech is the future";
        String sentence3_3_UC = sentence3_3.toUpperCase();
        String[] sentence3_3AfterSplit = sentence3_3_UC.split(" ");
        System.out.println(sentence3_3AfterSplit[0].substring(0, 1) + sentence3_3AfterSplit[1].substring(0, 1) + sentence3_3AfterSplit[2].substring(0, 1) + sentence3_3AfterSplit[3].substring(0, 1));


        /**
         * Q4:
         * Create an int-variable and store any value in it
         * if the value is divisible by 5, print "divisible by 5"
         * if the value is divisible by 3, print "divisible by 3"
         * if the value is divisible by 5 and 3, print "divisible by 5 and 3"
         * if the value is NOT divisible by 5 and 3, print "NOT divisible by 5 and 3"
         *
         */

        int number = 31;

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println(number + " divisible by 5 and 3");
        } else if (number % 5 == 0) {
            System.out.println(number + " divisible by 5");
        } else if (number % 3 == 0) {
            System.out.println(number + " divisible by 3");
        } else if (number % 5 != 0 && number % 3 != 0)
            System.out.println(number + " NOT divisible by 5 and 3");


//*   if (condition) {
//
//} else if (condition 2) {
//
//} else if (condition 3) {
//
//} else {
//if nothing worked out, this will be default code to execute
//}
//
//
//
// else if (number % 3 == 0) {
//                System.out.println(number + "  divisible by 3");
// else if (number % 5 == 0 && number % 3 == 0) {
//
//                    System.out.println(number + " divisible by 5 and 3");
//                    else if (number % 5 != 0 && number % 3 != 0) {
//
//                        System.out.println(number + " NOT divisible by 5 and 3");


        /**
         * Q5:
         * Create two variables to store student-score and max-score (max score a student can get)
         * based on student percentage, print the grade:
         *
         * 91-100%      -> Grade A
         * 81-90.99%    -> Grade B
         * 71-80.99%    -> Grade C
         * 61-70.99%    -> Grade D
         * below 60.99% -> Grade E
         *
         * double studentScore = -5 (studentScore <= maxScore)
         * int maxScore = -1 (maxScore > 0)
         *
         * (studentScore/maxScore)*100 = 92.2
         *
         * Your grade = A, percentage = 92.2
         * if student-score is invalid, print "Invalid student score entered"
         * if max-score is invalid,  print "Invalid max score entered"
         *
         */

        int maxScore = 100;
        double studentScore = 79;
        double percentage = (studentScore / maxScore) * 100;

        if (studentScore > 100 || studentScore < 0) {
            System.out.println("Invalid Student Score Entered. Allowed 0-100");
        } else if (maxScore != 100) {
            System.out.println("Invalid Max Score Entered. Allowed is 0-100");
        } else if (percentage >= 91 && percentage <= 100) {
            System.out.println("Grade A");
        } else if (percentage >= 81 && percentage <= 90.99) {
            System.out.println("Grade B");
        } else if (percentage >= 71 && percentage <= 80.99) {
            System.out.println("Grade C");
        } else if (percentage >= 61 && percentage <= 70.99) {
            System.out.println("Grade D");
        } else if (percentage <= 60.99) {
            System.out.println("Grade F");
        }

/**
 * Q6
 */
        String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live", "give", "living standard", "life"};
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 6 && words[i].toLowerCase().startsWith("l")) {
                System.out.println(words[i]);
            }
        }
    }
}


      /**

     * Q6:
     * String[] words = {"healthy", "speak", "learning", "king", "Joy", "smile", "learn", "live" , "give", "living standard", "life"}
     * print the values which has length greater than 5 and starts with l
     * <p>
     * expected ans:
     * learning
     * living standard
     */


