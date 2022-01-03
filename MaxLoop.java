package Test;

public class MaxLoop {
    /* returns the maximum value from m */
    public static int max(int[] m) {
        int i = 0;
        int final_max = 0;
        while (i < m.length) {
            if (m[i] > final_max) {
                final_max = m[i];
            }
            i ++;
        }
        return final_max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 22, 10, 6};
        System.out.println(max(numbers));
    }
}