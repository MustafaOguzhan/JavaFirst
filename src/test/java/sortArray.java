public class sortArray {

    private static double[] selectionSort(double[] table) {


        // go through elements from first to second to last
        for (int i = 0; i < table.length-1; ++i) {
            // go through elements after i
            for (int j=i+1; j < table.length; ++j) {
                // if elements in wrong order
                if (table[i] < table[j]) {
                    // i and j element swap places
                    double tmp = table[i];
                    table[i] = table[j];
                    table[j] = tmp;
                }
            }
        }
        return table;
    }


    public static void main(String[] args) {
        double[] numbers = new double[]{1.2, 3.4, 0.5, 0.88};
        selectionSort(numbers);

        for (double x : selectionSort(numbers)) {
            System.out.print(x+",");
        }


    }

    //we can sort the arrays and arrayList .sort or Collections.sort(arrayListname);

}
