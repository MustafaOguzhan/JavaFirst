

import java.util.Scanner;

public class Question3optionsScanner {

    public static void main(String[] args) {

        String  question = "What is the current month?";
        String  A = "January", B = "February" , C = "March";

        String correctAnswer = C;

        Scanner input = new Scanner(System.in);

        System.out.println(question);
        System.out.println("Options are: A: " + A + " B: " + B + " or C: " + C);
        String UserAnswer = "";

        while(UserAnswer!=correctAnswer) {
            System.out.println("Select your answer");


            UserAnswer = input.next();
            //if user input equal to correct answer
            if (UserAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Congrats you are correct");
                break;

            } else System.out.println("Sorry!!! You are incorrect. The correct answer is " + correctAnswer);
            break;

        }

    }


}
