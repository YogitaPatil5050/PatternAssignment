package com.pattern2;
import java.util.Scanner;

public class Pattern2 
{

	
	public static void main(String[] args) 
{
		System.out.println("HELLOW WORLD !!!");
		
		System.out.println("Enter n ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	 
		for(int i=1;i<=n;i++)
		{ 
			for(int j=1; j<=n ;j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
			
		
		
}

}
