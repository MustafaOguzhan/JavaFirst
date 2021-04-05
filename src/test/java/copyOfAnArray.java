public class copyOfAnArray {


    private static int[] copyOfAnArray(int[] ap) {
        int[] copy = new int[ap.length];
        for (int i = 0; i < ap.length; ++i) {
            copy[i] = ap[i];
        }

        return copy;

    }

    public static void main(String[] args) {
        int[] original = {3,5,8,965,89,45};
        int[] copy;
        copy = copyOfAnArray(original);
        for (int i=0; i < copy.length; ++i)
            System.out.print(copy[i] + " ");
        System.out.println();
    }


    }
