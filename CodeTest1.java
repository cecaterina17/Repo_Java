package Class6;

import java.util.Arrays;

public class CodeTest1 {

        public static void main(String[] args) {
            CodeTest answer = new CodeTest();

            int[] q1Numbers = {32, 54, 12, 67, 2, 5};
            System.out.println("***** Answer for Q1: *****\nInput array -> " + Arrays.toString(q1Numbers));
            int[] q1Result = answer.sortArray(q1Numbers);
            System.out.println("Sorted Array -> " + Arrays.toString(q1Result));

            int q2Input = 333;
            int q2Result = answer.addDigitsFromNumber(q2Input);
            System.out.println("\n\n***Answer for Q2: ****\nInput value -> " + q2Input);
            System.out.println("Total of digits -> " + q2Result);


            int[] q4Array = {23, 54, 67, 12, 34, 23, 56};
            int q4NumberToRemove = 23;
            int[] q4Result = answer.removedIntFromArray(q4NumberToRemove, q4Array);
            System.out.println("\n\n*** Answer for Q3: **\nInput number to remove -> " + q4NumberToRemove + "\nInput array -> " + Arrays.toString(q4Array));
            System.out.println("Array after removing -> " + Arrays.toString(q4Result) + "\n\n\n");


            String[] q3Input1 = {"ab", "jhs", "abc", "jgaGJJUE", "KAHSJ", "ui"};
            String[] q3Input2 = {"abcde", "jhuy", "king", "loly"};
            System.out.println("\n\n*** Answer for Q4: *****\nInput array-1 -> " + Arrays.toString(q3Input1) + "\nInput array-2 -> " + Arrays.toString(q3Input2));
            System.out.println("Common values -> ");
            answer.printCommonInArrays(q3Input1, q3Input2);

        }
    }
