package Reverse;

import java.sql.SQLOutput;
import java.util.Scanner;

public class reverse1 {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your word.");
        char [] newInput = input.next().toCharArray();

        for (char print : newInput) {
            System.out.print(print);

        }
        System.out.println("\n--------------");

        char [] reverse = new char[newInput.length];
        int j =0;
        for (int i = newInput.length-1; i>=0; i--) {
            reverse[j] = newInput[i];
            j++;
        }
        for (char reversed:reverse) {
            System.out.print(reversed);
        }

    }


}





