import java.util.Scanner;

public class Pattern26 
{

	public static void main(String[] args) 
{
		System.out.println("HELLOW WORLD !!!");
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
int count = 0;
		
		int incriment = 2;
		for(int i = 1;;) {
			System.out.print(i+" ");
			if(count == number) break;
			i += incriment;
			incriment++;
			count++;
		}
		System.out.println();
	
}
}

