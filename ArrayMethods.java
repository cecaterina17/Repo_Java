package Class6;

public class ArrayMethods {

        /**
         * Q3:
         * Create method to find the maximum value from int-array
         * Purpose - user provides int array and method find max number
         * - I use additional variable to hold Max value
         * - At first, Max value equals to index[0]
         * - If bigger value found, max value becomes that value
         * - Loop repeats as many times as number of values in array
         * - Method returns only biggest value.
         */
        public int maxArrayValue(int[] input) {
            int maxValue = input[0];
            int i = 0;
            while (i < input.length){
                if (input[i] > maxValue) {
                    maxValue = input[i];
                }
                i++;
            }
            return maxValue;
        }


        /**
         * Q5
         * Create a method to find the longest String in the given String-array
         * Method should return (String)
         * Purpose - user provides String array and method finds longest value
         * - I need to use similar logic to min/max values of array
         * - I create variable to hold final result of longest String
         * - I use condition inside loop to compare length of Strings. I use .length() method
         * - Every time I find longer value, above mentioned variable becomes that value
         * - I return longestValue variable holding longest String in given String array
         */
        public static String longestString(String[] input) {
            String longestValue = input[0];
            int i = 0;
            do {
                if (input[i].length() > longestValue.length()) {
                    longestValue = input[i];
                }
                i++;
            } while (i < input.length);
            return longestValue;
        }

    }


