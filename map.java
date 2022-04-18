package Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


    public class map extends Method {
        public static void main(String[] args) {

            //Q1
            System.out.println("\nQ1) Print the key(s) with common values (ignoring cases)\n");
            Map<Integer,String> wordsMap = new HashMap<>();
            wordsMap.put(101,"HAppy");
            wordsMap.put(102,"King");
            wordsMap.put(103,"HAPPY");
            wordsMap.put(104,"live");
            wordsMap.put(105,"Happy");
            wordsMap.put(106,"Live");
            wordsMap.put(107,"haPPy");

            /** If you want to test different scenario, comment out above inputs 101-107
             *  Uncomment below pairs
             */
//        wordsMap.put(101,"Batman");
//        wordsMap.put(102,"Harley Quinn");
//        wordsMap.put(103,"Joker");

            System.out.println(wordsMap);
            commonKeys(wordsMap);


            // Q2
            System.out.println("\n\nQ2) Print the name(s) of color appearing max number of times\n");
            /**
             * You can comment / uncomment below arrays and test different scenarios
             */
//        String[] colors = { "green", "blue", "red", "yellow", "grey", "green", "red", "grey",
//                            "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
//                            "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
//                            "green", "green" };
            //String[] colors = {"yellow","Yellow","red","Red", "blue","Blue"};
            String[] colors = {"yellow","Red","red","Blue","blue"};
            //String[] colors = {"yellow","RED","blue","BLUE"};
            System.out.println(Arrays.toString(colors));
            String findColorTotal = colorTotals(colors);
            System.out.println(findColorTotal);
        }
    }

