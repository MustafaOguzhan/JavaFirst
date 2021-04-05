package Reverse;

import java.util.Scanner;

public class reverseCharacters {

    private static void print(char[] userInput) {

        for (int i = 0; i < userInput.length; i++) {
            System.out.print(userInput[i]);
        }
        ;
        System.out.println();
    }

    private static char[] reverse(char[] userInput) {
        char[] reverseInput = new char[userInput.length];
        int j = 0;

        for (int i = reverseInput.length - 1; i >= 0; i--) {
            reverseInput[j] = userInput[i];
            j++;
        }

        return reverseInput;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter your input");
        char[] userInput = input.next().toCharArray();
        //print(userInput);
        reverse(userInput);
        System.out.println(reverse(userInput));

    }

}
