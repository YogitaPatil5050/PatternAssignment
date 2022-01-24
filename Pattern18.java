import java.util.Scanner;

public class Pattern18
{
	
	public static void main(String[] args) 
{
		System.out.println("HELLOW WORLD !!!");
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
	 
		int var = 1;
		for(int i = 1; i <= 2 * number - 1; i++) {
			if(i > number) {
				for(int j = 1; j <= i - number; j++) {
					System.out.print(" ");
				}
				for(int j = 2 * (i-2*var) -1; j >= 1; j--) {
					if(j % 2 == 1)
						System.out.print(i-2*var);
					else
					 System.out.print("*");
				}
				var++;
			}
			else {
				for(int j = number; j > i; j--) {
					System.out.print(" ");
				}
				for(int j = 1; j <= 2 * i - 1; j++) {
					if(j % 2 == 1) {
						System.out.print(i);
					}
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
	
}

}
