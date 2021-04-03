package Reverse;

import java.util.Scanner;

public class reverse2 {

    private static char[] reverse(char[] newInput) {
        char[] reverseWord = new char[newInput.length];
        int j = 0;
        for (int i = reverseWord.length - 1; i >= 0; i--) {
            reverseWord[j] = newInput[i];
            j++;
        }

        return reverseWord;
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word you want to printout");
        char[] newInput = input.next().toCharArray();
        System.out.println("newInput = " + newInput.length);
        System.out.println(reverse(newInput));


    }
}
