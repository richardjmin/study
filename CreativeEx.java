package Test;

public class CreativeEx{
    public static void main(String[] args) {
        int col = 0;
        int row = 0;
        int Size = 5;
        while (row <= Size) {
            row = row + 1;
            col = 0;
            while (col < row) {
                col = col + 1;
                System.out.print('*');
            }
            System.out.println();
        }
    }
}