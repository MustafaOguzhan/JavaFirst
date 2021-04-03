import java.util.Scanner;

public class arraAsParamAndReturnValue {
    /*
     * reverse method
     */
    private static char[] turn (char[] characters) {
        /* returning array to same size as the one received as parameter */
        char[] retuning = new char[characters.length];
        int j = 0;
        for (int i = characters.length - 1; i >= 0; --i) {
            retuning[j] = characters[i];
            j++;
        }
        // return the array
        return retuning;
    }

    /*
     * printer method
     */
    private static void printer (char[] characters) {
        for (int i = 0; i < characters.length; ++i) {
            System.out.print(characters[i]);
        }
        System.out.println();
    }

//    public static double[] getArray() {
//        double[] x = {1.2, 3.5, 4.8};
//        return x;
//    }

    ;

    // main method
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println(" Please enter your input. ");
        char[] characterTable =input.next().toCharArray();
        printer(characterTable);
        char [] reverse = turn(characterTable);
        printer(reverse);

        //call getArray();
//        double[] values = getArray();
//
//        for (double numbers : values
//            ) {
//            System.out.println("numbers = " + numbers);
//        }

    }

}
