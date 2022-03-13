package Class5;

public class HWfour {

        public static void main(String[] args) {

            String myName = "Ecaterina Rusu";
            int myNameLength = myName.length();
            System.out.println("Length of My Name = " + myName  + myNameLength);

            /**
             * Due date: Mar 13 (Sunday)
             */

            /**
             * Task -1
             * using Ternary operator assign value to int-variable
             *
             * Variable -> result1
             *
             * if the length of sentence1-String is greater or equals to 5
             *      value in result1 should be 10
             * else
             *      value in result should be 15
             *
             * print:
             *      value of sentence1
             *      length of sentence1
             *      value of result1
             */

            /**
             * Task - 2
             *
             * Create a String Variable and store your full name in it.
             * Print the following values:
             *  1. length of your full name
             *  2. check if your name ends with "a" (ignore the case)
             *  3. check if your name contains with "a" (ignore the case)
             *
             */

            /**
             *Tasl 3
             */

            /**
             * Print the results for:
             *  1. task3-value contains "king" (ignore cases)
             *  2. index of first occurrence of "EW" (ignore cases)
             */
            /**
             * Tast 4
             * Convert the value in task4 variable into Titlecase
             *      (FirstCharacterUppercase and rest all in lowercase)
             *
             * "kINg" -> "King"
             * "QUEEN" -> "Queen"
             */

            String sentence1 = "hhhh";
            System.out.println("\nTask 1:\n1) Value of sentence1 --> "+sentence1);
            System.out.println("2) Length of sentence1 --> "+sentence1.length());

            int result1 = sentence1.length() >= 5 ? 10 : 15;
            System.out.println("3) Value of Result1 -> "+ result1);


            String myFullName = "Ecaterina Rusu";
            System.out.println("\nTask 2:\n1) Length of my name --> " + myFullName.length());

            String myFullName_L = myFullName.toLowerCase();
            String charCheckWith = "a".toLowerCase();
            boolean isCharPresent = myFullName_L.endsWith(charCheckWith);

            System.out.println("2) Does name end with 'a'? --> "+isCharPresent);
            System.out.println("3) Does name contain 'a'? --> "+myFullName_L.contains(charCheckWith));



            String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
            String task3_L = task3.toLowerCase();
            String seqCheck = "king".toLowerCase();
            boolean isSeqPresent = task3_L.contains(seqCheck);
            System.out.println("\nTask 3:\n1) Does Task3 contain 'king' --> "+isSeqPresent);

            seqCheck = "EW".toLowerCase();
            System.out.println("2) Index of First Occurance of 'EW' --> "+task3_L.indexOf(seqCheck));




            String task4 = "kINg";
            String tas4 = "QUEEN";
            String task4_L = task4.toLowerCase();
            String tas4_L = tas4.toLowerCase();

            // Using substring() method
            String task4_T = task4_L.substring(0,1).toUpperCase() + task4_L.substring(1,4);
            System.out.println("\nTask 4:\n1) Convert 'kINg' to Titlecase --> "+task4_T);

            String tas4_T = tas4_L.substring(0,1).toUpperCase() + tas4_L.substring(1,5);
            System.out.println("\nTask 4:\n1) Convert 'QUEEN' to Titlecase --> "+tas4_T);

            // Using replace() method
            String tas4_T2 = tas4_T.replace("Q","Q");
            System.out.println("2) Convert 'QUEEN' to Titlecase --> "+tas4_T2);




        }
    }

