import java.util.Scanner;

public class Pattern8 {
	public static void main(String[] args) 
	{
		System.out.println("HELLOW WORLD !!!");
	
	System.out.println("Enter number");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	int value = 1;
	for(int i = 1; i <= number; i++) {
		for(int j = 1; j <= number+1; j++) {
			if(i % 2 == 1 && j == number+1) {
				System.out.print(++value);
			}
			else if(i % 2 == 0 && j == 1) {
				System.out.print(++value);
			}
			else
				System.out.print(i);
		}
		System.out.println();
}
}
}