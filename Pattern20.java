import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("HELLOW WORLD !!!");
		System.out.println("Enter odd number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == (num / 2) + 1) {
                    System.out.print("* ");
                } else if (j == (num / 2) + 1) {
                    System.out.print("* ");
                } else if (i == 1 && j > (num / 2)) {
                    System.out.print("* ");
                } else if (i == num && j <= (num / 2)) {
                    System.out.print("* ");
                } else if (j == 1 && i <= (num / 2)) {
                    System.out.print("* ");
                } else if (j == num && i > (num / 2)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }

}

