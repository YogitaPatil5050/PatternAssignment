import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HELLOW WORLD !!!");
        System.out.print("Enter the Number= ");
        int num = sc.nextInt();

        printSpiral(num);

        sc.close();
    }

    public static void printSpiral(int size) {
        int row = 0, col = 0;

        int boundary = size - 1;
        int sizeLeft = size - 1;
        int flag = 1;
        char move = 'r';

        int matrix[][] = new int[size][size];

        for (int i = 1; i < size * size + 1; i++) {

            matrix[row][col] = i;
            switch (move) {

                case 'r':
                    col += 1;
                    break;

                case 'l':
                    col -= 1;
                    break;

                case 'u':
                    row -= 1;
                    break;

                case 'd':
                    row += 1;
                    break;
            }

            if (i == boundary) {

                boundary += sizeLeft;

                if (flag != 2) {

                    flag = 2;
                } else {

                    flag = 1;
                    sizeLeft -= 1;
                }
                switch (move) {

                    case 'r':
                        move = 'd';
                        break;

                    case 'd':
                        move = 'l';
                        break;

                    case 'l':
                        move = 'u';
                        break;

                    case 'u':
                        move = 'r';
                        break;
                }
            }
        }

        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {

                int n = matrix[row][col];
                if (n < 10) {
                    System.out.print(n + "   ");
                } else if (n < 100) {
                    System.out.print(n + "  ");
                } else if (n < 1000) {
                    System.out.print(n + " ");
                }
            }

            System.out.println();
        }
    }

}