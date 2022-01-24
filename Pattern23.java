import java.util.Scanner;

public class Pattern23 
{

	public static void main(String[] args) 
{
		System.out.println("HELLOW WORLD !!!");
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		int odd = 1;
		int even = 2;
		int i = 1;
		while(true) {
			if(count == number) break;
			if(i % 2 == 1) {
				System.out.print(odd+" ");
				count++;
				odd += 3;
			}
			else {
				System.out.print(even+" ");
				count++;
				even += 2;
			}
			i++;
		}
		System.out.println();
	
	
}
}


