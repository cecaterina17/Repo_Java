package Class6;

public class CodeTest {
    public static void main(String[] args) {

    }

    /**
     * Ques-1:
     * Create a method to return an int-array after sorting a given input-int-array
     * points: 10
     */
    /*
     *
     * eg:
     * input -> [32, 54, 12, 67, 2, 5]
     * returned array -> [2, 5, 12, 32, 54, 67]
     *
     * input -> [5, 4, 3, 1, 2]
     * returned array -> [1, 2, 3, 4, 5]
     *
     * input -> [90, 34, 12, 4]
     * returned array -> [4, 12, 34, 90]
     *
     * int[] inputArr = {32, 54, 12, 67, 2, 5};
     * int[] outputArr = sortArray(inputArr);   // {2, 5, 12, 32, 54, 67}
     *
     * int[] inputArr = {5, 4, 3, 1, 2};
     * int[] outputArr = sortArray(inputArr);   // {1, 2, 3, 4, 5}
     */

    public int[] sortArray(int[] numbersArray) {
        for (int i = 1; i < numbersArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (numbersArray[j] < numbersArray[j - 1]) {
                    numbersArray[j] = numbersArray[j] + numbersArray[j - 1];
                    numbersArray[j - 1] = numbersArray[j] - numbersArray[j - 1];
                    numbersArray[j] = numbersArray[j] - numbersArray[j - 1];
                }
            }
        }
        return numbersArray;
    }


    /**
     * Ques-2:
     * Create a method to return the sum of digits in input-int-value
     * points: 20
     */
    /*
     *
     * eg:
     * input -> 123
     * returned value -> 6  (1 + 2 + 3)
     *
     * input -> 323
     * returned value -> 8  (3 + 2 + 3)
     *
     * input -> 90
     * returned value -> 9  (9 + 0)
     *
     * int result1 = addDigits(123);    // result1 = 6
     *
     * int result2 = addDigits(575);    // result2 = 17
     *
     *
     *
     */
    public int addDigitsFromNumber(int number) {
        int total = 0;
        String numberAsString = String.valueOf(number);
        String[] numberStringArray = numberAsString.split("");
        for (String numberString : numberStringArray) {
            total += Integer.valueOf(numberString);
        }
        return total;
    }

    /**
     * Ques-3:
     * Create a method to return an int-array after removing input-int-value from an input-int-array
     * points: 30
     */
    /*
     *
     * eg:
     * input -> 23, {23, 54, 67, 12, 34, 23, 56}
     * returned array -> {54, 67, 12, 34, 56}
     *
     * input -> 5, {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
     * returned array -> {23, 67, 87, 10, 34, 98, 66, 55}
     *
     * input -> 11, {22, 33, 44, 55}
     * returned array -> {22, 33, 44, 55}
     *
     *
     * int[] inputArr = {23, 54, 67, 12, 34, 23, 56};
     * int[] outputArr = removeValueFromArray(23, inputArr);    // {54, 67, 12, 34, 56}
     *
     * int[] inputArr2 =  {23, 5, 67, 87, 10, 5, 34, 98, 66, 55}
     * int[] outputArr2 = removeValueFromArray(5, inputArr2);    // {23, 67, 87, 10, 34, 98, 66, 55}
     *
     */
    public int[] removedIntFromArray(int value, int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        int[] restOfValuesArr = new int[arr.length - count];
        int j = 0;
        for (int num : arr) {
            if (num != value) {
                restOfValuesArr[j] = num;
                j++;
            }
        }
        return restOfValuesArr;
    }


    /**
     * Ques-4:
     * Create a method to print the common Strings values in two input-String-arrays
     * points: 40
     * Note: two input-String-arrays can be of same size or different size
     */
    /*
     *
     * eg:
     * input -> {"happY", "king", "peace", "living standard"} , {"king kong", "Happy", "PEACE"}
     * Method should print ->
     * happy
     * peace
     *
     * input -> {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”} , {“abcde”, “jhuy”, “plot”, “koli”}
     * Method should print ->
     * abcde
     * koli
     *
     * String[] inputArr1 = {"happY", "king", "peace", "living standard"};
     * String[] inputArr2 = {"king kong", "Happy", "PEACE"};
     *
     * printCommons(inputArr1, inputArr2);
     * happy
     * peace
     *
     *
     * String[] inputArr3 = {“ab”, “abcd”, “abc”, “abcde”, “defg”, "koli”};
     * String[] inputArr4 = {“abcde”, “jhuy”, “plot”, “koli”};
     *
     * printCommons(inputArr3, inputArr4);
     * abcde
     * koli
     *
     *
     */
    public void printCommonInArrays(String[] array1, String[] array2) {
        for (String fromArray1 : array1) {
            for (String fromArray2 : array2) {
                if (fromArray1.equalsIgnoreCase(fromArray2))
                    System.out.println(fromArray1.toLowerCase());
            }
        }

    }
}

