package hw00;

public class MaxInArray {
    /** Returns the maximum value from m. */

    public static int max(int[] m) {
        int max=0;
        for (int number:m){
            if (number>max){
                max=number;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}