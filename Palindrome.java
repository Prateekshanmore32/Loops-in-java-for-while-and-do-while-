package loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(temp>0)
		{
			int rem=temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		if(rev==n)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
	}

}
//Enter a number
//123
//Number is not palindrome


//Enter a number
//1221
//Number is palindrome
