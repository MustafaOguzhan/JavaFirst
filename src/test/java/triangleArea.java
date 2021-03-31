import java.util.Scanner;

public class triangleArea {

    public static void main(String[] args) {

        System.out.println("Let`s calculate the area of a triangle");
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle in inches");
        double base =  input.nextDouble();

        while (base<=0){
            System.out.println("That`s invalid. Please input the base of the triangle more than 0");
            base = input.nextDouble();
        };

        System.out.println("Please input the height of the triangle.");
        double height = input.nextDouble();

        while (height<=0){
            System.out.println("Please input the height of the triangle more than 0");
            height = input.nextDouble();
        };

        double area= base * height / 2;
        System.out.println("The area is = " + area);
    }

}
