import java.util.Scanner;

public class guessNumber {

    public static void main(String[] args) {

        int guessedNo=38;
        int timesGuessed = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please guess a number between 1-50");
        int guess = input.nextInt();

        do {
            // ask for a guess from the user and place the guess into the variable guess
            if(guess < guessedNo) {
                System.out.println("Number is bigger than " + guess);
                System.out.println("Please guess another number");
                guess = input.nextInt();
            } else if(guess > guessedNo) {
                System.out.println("Number is smaller than " + guess);
                System.out.println("Please guess another number");
                guess = input.nextInt();
            } else {
                System.out.println("Correct!!");
                break; // correct, jump out of loop
            }
            timesGuessed++;
        } while(timesGuessed < 10); // maximum ten guesses
    }
}
