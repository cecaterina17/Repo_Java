package thirdHW;

public class prepro {

    public static void main(String[] args) {

        /**
         *
         * Due date: Mar 8 2022
         *
         * Refer for formula: https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html
         *
         * C -> F
         * C -> K
         *
         * F -> C
         * F -> K
         *
         * K -> C
         * K -> F
         *
         */

        /**
         * Convert degree-Celsius into deg-Fahrenheit
         *
         * fT = cT × 9/5 + 32
         *
         */
        double cTemp = 20.7;
        double fTemp = cTemp * 9/5 + 32;
        System.out.println("\n" + cTemp + "˚C is equal to " + fTemp + "˚F");

        double CTemp = 20.7;
        double kTemp = cTemp + 273.15;
        System.out.println("\n" + CTemp + "˚C is equal to " + kTemp + "˚K");

        double FTemp = 26.7;
        double CCTemp = (FTemp - 32) * 5/9;
        System.out.println("\n" + FTemp + "˚F is equal to " + CCTemp + "˚C");

        double FFTemp = 60;
        double KTemp = (FFTemp + 459.67) * 5/9;
        System.out.println("\n" + FFTemp + "˚F is equal to " + KTemp + "˚K");

        double KKTemp = 40;
        double CCCTemp = KKTemp - 273.15;
        System.out.println("\n" + KKTemp + "˚K is equal to " + CCCTemp + "˚C");

        double KKKTemp = 40;
        double FFFTemp = (KKKTemp * 9)/5 - 459.67;
        System.out.println("\n" + KKKTemp + "˚K is equal to " + FFFTemp + "˚F");





    }
}

