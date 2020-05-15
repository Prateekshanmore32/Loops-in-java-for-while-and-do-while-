package loops;

import java.util.Scanner;

public class SumSeries {

	public static void main(String[] args) {

		
		/*
		 * 1- (1/2) + (1/3) - (1/4)......infinity=log2 
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double res=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{ 
				res-=(double)1/(double)i;
			}
			else
			res+=(double)1/(double)i;
		}
		System.out.println(res);
	}

}
/*
8
0.6345238095238095
*/