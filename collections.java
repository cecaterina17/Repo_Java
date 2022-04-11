package Class10;

import java.util.ArrayList;
import java.util.Arrays;

    public class collections extends  ListMethods{

        public static void main(String[] args) {

            ArrayList<String> strList = new ArrayList<>();
            strList.add("Happy");
            strList.add("GroW");
            strList.add("LeaRN");
            strList.add("PeaCEfUL");
            strList.add("Learning");
            strList.add("HAPPy");
            strList.add("Growing");
            strList.add("ListeN");
            strList.add("PEACE");
            strList.add("King KONG");

            strList.add("happiness");
            strList.add("greeN");
            strList.add("SkiLLS");
            strList.add("PRICELeSs");
            strList.add("Health");
            strList.add("NEW");
            strList.add("LAUgh");
            strList.add("QUeeN");
            strList.add("YouNG");
            strList.add("OLD");

            strList.add("HAPPy");
            strList.add("Growing");
            strList.add("ListeN");
            strList.add("PEACE");
            strList.add("King KONG");
            strList.add("happiness");
            strList.add("greeN");
            strList.add("SkiLLS");
            strList.add("PRICELeSs");
            strList.add("Health");

            strList.add("NEW");
            strList.add("LAUgh");
            strList.add("King KONG");
            strList.add("happiness");
            strList.add("greeN");
            strList.add("SkiLLS");
            strList.add("PRICELeSs");
            strList.add("Health");
            strList.add("NEW");
            strList.add("LAUgh");

            System.out.println("\nQ1) Count of Matching Words");
            int sum = getCount("HAppY", strList); // <-- should return 3
            System.out.println("HAppY is present --> " + sum + " Times");


            System.out.println("\nQ2) Count of Containing Words");
            String toCheck = "A";
            int total = getContains(toCheck, strList); // <-- should return 17
            System.out.println(toCheck+" is present --> " + total + " Times");


            System.out.println("\nQ3) Remove int value from given intArray ");
            int[] numArr = { 100, 122, 23, 4, 105, 200, 50 };
            System.out.println(Arrays.toString(numArr));
            int toRemove = 200;
            System.out.println("Remove value - " + toRemove);
            int[] arr2 = removeNum(numArr,toRemove);
            System.out.println(Arrays.toString(arr2));
        }
    }

