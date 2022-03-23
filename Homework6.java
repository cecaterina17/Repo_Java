package Class6;

public class Homework6 {
    public static void main(String[] args) {


        // Due date: Mar 22, 2022
        /**
         * Q1:
         * Create the abbreviation
         *
         * make America great again -> MAGA
         * Good Morning -> GM
         * happy birthday to you dear friend -> HBTYDF
         * hEllo -> H
         * Air ballon -> AB
         *
         *
         * hint: split, charAt, toUppercase
         *      split, subString, toUppercase
         *
         */



        System.out.println("\n1)");
        String sentence2 = "make America great again";
        String[] sentence2Array = sentence2.split(" ");
        String Abbreviation = "";
        for (int i=0;i<sentence2Array.length;i++){
            //revWord += wordArray[i].substring(0,1).toUpperCase();      // <-- substring method
            Abbreviation += sentence2Array[i].toUpperCase().charAt(0);    // <-- charAt method
        }
        System.out.println(sentence2+" -- Abbreviation --> "+Abbreviation);


        // While Loop
        String arnoldQuote = "Happy Birth Day!";
        String[] secondWordArray = arnoldQuote.split(" ");
        String quoteAbbreviation = "";
        int k=0;
        while (k< secondWordArray.length){
            quoteAbbreviation += secondWordArray[k].substring(0,1).toUpperCase();
            k++;
        }
        System.out.println(arnoldQuote+" -- Abbreviation --> "+quoteAbbreviation);

        /**

         * Q2:
         * Reverse the given String
         * make America great again -> again great America make
         *
         */
        // I need to split sentence into separate words
        // I should read sentence backwards, meaning I need to start from last index
        // As in previous example, variable should hold reversed sentence and loop will help to add words multiple times
        // I need to create empty space between words. Last iteration of loop will create extra space.
        // trim method can help to remove space. I used debug tool to make sure it works.
        System.out.println("\n2)");
        String movieQuote = "make America great again";
        String[] movieWordArray = movieQuote.split(" ");
        String movieQuoteAbbreviation = "";
        int j= movieWordArray.length-1;
        do {
            movieQuoteAbbreviation += movieWordArray[j]+" ";
            j--;
        } while(j >= 0);
        movieQuoteAbbreviation = movieQuoteAbbreviation.trim();
        System.out.println(movieQuote+" -- Reverse Words ---> "+movieQuoteAbbreviation);



        /**
         * Q3:
         * Convert the String value in to Titlecase
         */
        // Same split, loop and variable logic as in previous example.
        // Difference is, I need to target first char and make it UpperCase.
        // substring method takes care of first char as well as any number of chars that follow first.
        // trim method removes extra spaces in the end of sentence.
        System.out.println("\n3)");
        String Title = "best day of my life";
        String[] titleWordArray = Title.split(" ");
        String Titlecase = "";
        for (int i=0; i<titleWordArray.length; i++){
            Titlecase += titleWordArray[i].substring(0,1).toUpperCase()+titleWordArray[i].substring(1).toLowerCase()+" ";
        }
        Titlecase=Titlecase.trim();
        System.out.println(Title+" -- In Titlecase --> "+Titlecase);



        /**
         * Q4:
         * Find the minimum value from the given array
         */
        // First, I thought to compare value[0] to every other value
        // If any value was less than that, I wanted to assign it to be index[0]
        // If I could keep re-assigning smaller values to index[0], at the end index[0] will be minimal value
        System.out.println("\n4)");
        int[] numbers = {87, 13, 89, 0, -289, 150, 23, -1, 2};
        int count = 0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[count] < numbers[0]){
                numbers[0] = numbers[count];
            }
            count++;
        }
        System.out.println("Minimum number from array --> " + numbers[0]);


        /**
         *  this is not my Comments/ i will leave it here for my information
         *  After solving Q4 using my weird code, I checked web for better solutions.
         *
         *  Q4 should be done in more effective way by making count variable equal to numbers[0].
         *  Then, there is no need to increment count variable like I did. Instead, using if/else, I should have stored min value in the count variable.
         *
         *  For learning purposes I kept my code. Will use better way for upcomming assignments.
         */
    }
}
