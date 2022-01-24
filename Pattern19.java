import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("HELLOW WORLD !!!");
        System.out.print("Enter the Number-");
        int num = sc.nextInt();
        num = num % 2 == 0 ? num : ++num;
        int num1 = num / 2;
        int m = num1;
        int n = 1;
        for (int i = num1; i >= 1; i--) {
            for (int j = i; j >= 2; j--) {
                System.out.print(" ");
            }
            for (int k = m; k <= num1; k++) {
                if (i == num1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int l = num1 - 1; l >= i; l--) {
                System.out.print("*");
            }
            
            for (int k = n; k <= num1; k++) {
                System.out.print(" ");
            }
           
            for (int j = i; j >= 2; j--) {
                System.out.print(" ");
            }
            for (int k = m; k <= num1; k++) {
                if (i == num1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int l = num1 - 1; l >= i; l--) {
                System.out.print("*");
            }
            n++;
            m--;
            System.out.println();
        }
        m = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = m; k <= num; k++) {
                System.out.print("*");
            }
            for (int l = num - 1; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
            m++;
        }

        sc.close();
    }

}