package loops;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
			// x^y
			int ans=1;
			for(int i=0;i<y;i++)
			{
				ans*=x;
			}
			System.out.println(ans);
	}

}

/*
5                 x=5
4				  y=4						
625
*/