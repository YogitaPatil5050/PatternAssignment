import java.util.Scanner;

public class Pattern25 
{

	public static void main(String[] args) 
{
		System.out.println("HELLOW WORLD !!!");
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
int count = 0;
int even = 2;
int odd = 3;
for(int i = 1;; i++) {
	if(count == number) break;
	if(i % 2 == 1) {
		System.out.print(even+" ");
		even *= 2;
	}
	else {
		System.out.print(odd+" ");
		odd *= 3;
	}
	count++;
}
System.out.println();
	
}
}

