package Class10;

import java.util.ArrayList;

    class ListMethods {
        /**
         * Q1:
         *  Create method that will count (and return) the number of times a given String (ignoring the case) is present in given ArrayList
         *  name : getCount
         *  inputs : 2 (String, ArrayList<String>)
         *  return type : int
         */
        // Method should accept 2 inputs and return int value
        // I use advanced for loop and check every List<String> value against user-provided String
        // If condition is met, count variable increases by 1
        // Loop repeats cycle until List runs out of values
        public static int getCount(String toCheck, ArrayList<String> list) {
            int count = 0;
            for (String val : list) {
                if (toCheck.equalsIgnoreCase(val)){
                    count++;
                }
            }
            return count;
        }


        /**
         * Q2:
         *  Create method that will return the number of ArrayList-values contains the given String (ignoring the case)
         *  name : getCount
         *  inputs : 2 (String, ArrayList<String>)
         *  return type : int
         */
        // Similar to Q1, I use for loop and count variable to execute requirements
        // Decided to use toLowerCase(); method on both List values and user-provided String
        // I bring both to same format and check if List value contains sequence(s) of user input
        public static int getContains(String toCheck, ArrayList<String> list) {
            int count = 0;
            for (String val : list) {
                if (val.toLowerCase().contains(toCheck.toLowerCase())) {
                    count++;
                }
            }
            return count;
        }


        /**
         * Q3:
         * Create a method to return an int-array after removing input-int-value from an input-int-array
         *
         * -> How to create List using Array and vice-versa
         *
         * create a List using values of input-int-array
         * remove the input-int-value from List
         * create an int-array using List-values
         * return int-array
         */

        // I needed a bit of Google search for this exercise
        // There are multiple ways of turning List into Array and vice-versa
        // Trick is to find way around primitive datatype such as int

        // I practiced few other solutions and also liked stream() methods
        // Here, I simply use for loops to pull values from collection and add into array
        // To remove value, you need to provide 'new Integer' so java knows its a value and not index
        // When converting List to Array, I set the length to size(); of the List.
        public static int[] removeNum (int[] inputArr, int toRemove){

            // first turn inputArr into list
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : inputArr) {
                list.add(i); // <-- values
            }

            //remove inputValue
            list.remove(new Integer(toRemove));

            //turn list back into Array
            int[] newArray = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                newArray[i] = list.get(i);
            }
            return newArray;
        }
    }





