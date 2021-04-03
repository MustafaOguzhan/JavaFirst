public class totalOrMaxNumberArray {

    public static void main(String[] args) {

        int [] numbers = {2,5,89,659,9845,22,5487,787};
        int sum = 0;
        int max = numbers[0];

        for (int num:numbers) {

             if (max<num){
               max= num;
             };
            sum = sum+num;
        }
        System.out.println("Maximum number is  = " + max);
        System.out.println("The sum of the number is  = " + sum);

    }
}
