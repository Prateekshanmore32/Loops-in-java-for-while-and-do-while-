package loops;

import java.util.Scanner;

public class WhileLoops {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		/*
		 * Display sum of digits of a number
		 */
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(temp>0)
		{
			sum+=temp%10;
			temp/=10;
		}
		System.out.println("Sum of digits of number "+n+"="+sum);
	}

}


//Enter a number
//523
//Sum of digits of number 523=10
