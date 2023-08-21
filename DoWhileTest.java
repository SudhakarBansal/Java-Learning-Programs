package practice_programs;

public class DoWhileTest {
    public static void main(String args[]) {
        int row, col, y;
        System.out.println("Multiplication table is : ");
        row = 1;
        do {
            col = 1;
            do {
                y = row * col;
                System.out.print(y + " ");
                col++;
            } while (col <= 3);
            System.out.println();
            row++;
        } while (row <= 3);
    }
}

