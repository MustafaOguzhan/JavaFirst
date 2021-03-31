import java.sql.SQLOutput;
import java.util.Scanner;

public class salaryCalculating {
    //static function or method
    public static double Salary(int weeklyHours, double moneyPerHour, int vacation){

        double deduction = moneyPerHour*(vacation*8);
        double grossSalary= ((moneyPerHour*weeklyHours)*52)-deduction;
         return grossSalary;
    };

    public static void main(String[] args) {

        double payCheck = Salary(40, 200, 60);
        System.out.println("payCheck = " + payCheck);

    }

}
