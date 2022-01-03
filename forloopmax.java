package Test;

public class forloopmax {
    /* returns the maximum value from m using a for loop */
    public static int forMax(int[] m) {
        int max = 0;
        for (int i = 0; i < m.length; i ++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 22, 69, 420};
        System.out.println(forMax(numbers));
    }
}