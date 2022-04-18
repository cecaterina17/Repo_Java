package Maps;

import java.util.*;

public class Method {


    /**
     *  Due Date: April-16 2022
     */

    /**
     * Question-1:
     * Create a HashMap with
     *      Integer as key and
     *      String as value
     *
     *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPY") , (104 = "live") , (105 = "Happy"), (106 = "Live") }
     *
     *  Create a method that will the HashMap<Integer, String> as Input
     *  print the key with common values (ignoring cases)
     *
     *      "Happy" is present with keySet = 101, 103, 105
     *      "Live" is present with keySet = 104, 106
     *
     *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPiness") , (104 = "life") , (105 = "king and queen"), (106 = "Live") }
     *  When no key are having common values, method should print,
     *      "No key have common values"
     */
    public static void commonKeys(Map<Integer,String> newMap) {
        Set<Integer> keySet = newMap.keySet();
        Collection<String> values = newMap.values();
        List<String> valueList = new ArrayList(values); // Collection to List (bcz can't figure how to work with collection)

        List<Integer> keyList = new ArrayList(keySet); // List of keys
        List<String> duplicatesList = new ArrayList(); // List of duplicates

        // store all duplicate values into above List (1st occurrence)
        // I tried to use Set, but I really struggle when I can't work with index number.

        for (int i = 0; i < valueList.size(); i++) {
            for (int j = i+1; j < valueList.size(); j++) {

                // Adding duplicates to List
                if (valueList.get(i).equalsIgnoreCase(valueList.get(j)) &&
                        duplicatesList.contains(valueList.get(i).toLowerCase()) == false ) {
                    duplicatesList.add(valueList.get(i).toLowerCase());
                }
            }
        }

        for (int i = 0; i < duplicatesList.size(); i++) {

            List keyTemp = new ArrayList(); // <- Empty list to store temporary keys
            String valueTemp = ""; // <- Empty string to store temporary value
            String toCheck = duplicatesList.get(i); // <-- Pick 1st duplicate [Happy] and continue inner for loop using ONLY [happy] vs all other values.

            for (int j = 0; j < keyList.size(); j++) {
                boolean isEqual = newMap.get(keyList.get(j)).equalsIgnoreCase(toCheck); // <-- 'Happy' isEqual? --> [value1,value2,value3.. last value]
                if (isEqual) {
                    keyTemp.add(keyList.get(j)); // <-- if 'Happy' finds match, store Key/Value pair in temporary variables.
                    valueTemp = newMap.get(keyList.get(j)).toLowerCase();
                }
            } // <-- Inner loop ends

            // Before loop resets and picks next value to compare, print temp variables which hold current pair.
            // Inner for loop will compare all values vs 'happy'. What I print is final result of how many keys are associated with such value
            // Next cycle will pick i.e 'live'. Again, inner loop checks all pairs and whatever is a match goes into temp variable
            System.out.println("'"+valueTemp.substring(0,1).toUpperCase()
                    +valueTemp.substring(1).toLowerCase()
                    +"' -"+" is present with keys = "+keyTemp);
        }
        if (duplicatesList.isEmpty()) { // <- This simple if block is triggered when above for loop can't find any duplicate values
            System.out.println("No key have common values");
        }
    }

    /**
     * Question-2:
     *
     * String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
     *             "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
     *             "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
     *             "green", "green"};
     *
     * Create a method that will return the name(s) of color appearing max number of times in the array.
     *
     * green - 7
     * blue - 5
     * red - 10
     * yellow - 8
     * grey - 6
     *
     * method will return "red"
     *
     * green - 7
     * blue - 10
     * red - 10
     * yellow - 8
     * grey - 6
     *
     * method will return "red", "blue"
     */
    public static String colorTotals(String[] colorNames) {

        String result = null; // <-- stores final output of method.

        // Count total occurrence of each color
        // Create Map using Color(key) and total count (value)
        // Nested advanced for loop
        //      - Pick first color - Example: GREEN
        //      - using nested loop, compare green to every other value. If equal, save result in colorCount Variable
        //      - Before jumping to second color, add current color(key) and current colorCount(value) to Map
        // Outer loop resumes, picks second color - Example: RED. Loop repeats cycle
        Integer colorCount = 0;
        Map<String, Integer> colorMap = new HashMap<>();
        for (String color : colorNames) {
            for (String color2 : colorNames) {
                if (color.equalsIgnoreCase(color2)){
                    colorCount++;
                }
            }
            colorMap.put(color.toLowerCase(),colorCount);
            colorCount = 0;
        }

        // Now, map consists of [color,count] --> Example: [red,5] [blue,8]
        // To find which color has max count I grab values using Collection and iterate through that with for loop
        // If value > otherValue, 'int max' variable becomes that value.
        Collection<Integer> colorValues = colorMap.values();
        int max = 0;
        for (Integer value : colorValues) {
            if (value>max) {
                max = value;
            }
        }
        // Following block was added after I discovered bug with counting duplicates
        // I use following boolean value in one of the if conditions at the end of the method
        boolean duplicateChecker = true;
        for (Integer value : colorValues) {
            for (Integer nextValue : colorValues) {
                if (value != nextValue) {
                    duplicateChecker = false;
                }
            }
        }

        // max value can remain 0 --> either every color is different OR every color is present same amount of times
        // If two or more values have same count, we need to find total duplicates. [green,green,red,red] <-- green=2 , red=2

        // duplicate count can occur and max value will NEVER remain 0, bcz some value must be more than other value

        // 0 --> each color is present same amount of times
        // 5 --> Example: RED,YELLOW & BLUE where present 5 times each. GREY only 3 times

        // To handle duplicate scenario, I created boolean isMaxDuplicate variable.
        // Boolean can change to true if condition is satisfied. If not, remains as false
        boolean isMaxDuplicate = false;
        int maxDuplicates = 0;
        for (Integer value : colorValues) {
            if (value == max) {
                maxDuplicates++; // <-- just count how many times same max value is present
            }
        }   // If more than 1, we have duplicate values --> Example: [red,2][blue,2][yellow,1]
        if (maxDuplicates > 1) { // <-- if true, change boolean value
            isMaxDuplicate = true;
        }

        // keySet method to access keys of the map created above
        // Using advanced for loop, I pick every value and use conditions
        Set<String> colorKey = colorMap.keySet();
        String duplicateKeys = "";
        for (String key : colorKey) {
            if (colorMap.get(key) == max && isMaxDuplicate) { // <-- to work on duplicate values
                duplicateKeys = duplicateKeys + ", "+key; // <-- storing duplicates in empty string variable
            }
            else if (colorMap.get(key) == max && isMaxDuplicate == false) { // <-- to print single max value
                result = key;
            }
        }
        if (duplicateChecker) {
            int value = 0;
            for (String i : colorKey) { // <-- get value out of colorMap --> Example: [red,2] [blue,2] [green,2]
                value = colorMap.get(i);
            }
            result = "Every color is present equal amount of times --> "+value+" time each";
        }
        else if (duplicateKeys.isEmpty() == false) {
            // To keep required format, I use string methods to remove comma & trim space
            duplicateKeys = duplicateKeys.substring(1).trim();
            result = duplicateKeys;
        }
        return result;
    }

}
