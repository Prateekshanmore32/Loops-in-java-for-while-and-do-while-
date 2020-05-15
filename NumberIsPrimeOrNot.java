package loops;

import java.util.Scanner;

public class NumberIsPrimeOrNot {

	public static void main(String[] args) {

		//1st method   time complexity=O(n)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n1=sc.nextInt();
		boolean prime1=true;
		for(int i=2;i<n1;i++)
		{
			if(n1%i==0)
			{
				prime1=false;
				break;
			}
		}
		if(n1<2)
		{
			prime1=false;
		}
		System.out.println("Is Prime "+prime1);
		
		
		
		/**************************************************************************/
		
		
		
		//2nd method    time complexity=O(root(n))
		System.out.println("Enter a number");
		int n2=sc.nextInt();
		boolean prime2=true;
		for(int i=2;i*i<=n2;i++)
		{
			if(n2%i==0)
			{
				prime2=false;
				break;
			}
		}
		if(n2<2)
		{
			prime2=false;
		}
		System.out.println("Is Prime "+prime2);
		
		
	}

}


/*
Enter a number
13
Is Prime true


Enter a number
4
Is Prime false
*/