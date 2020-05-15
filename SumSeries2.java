package loops;

import java.util.Scanner;

public class SumSeries2 {

	public static void main(String args[])
	{
		/*
		 * 1+(1/2)+(1/3)+(1/4)....
		 */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double res=0;
		for(int i=1;i<=n;i++)
		{
			res+=(double)1/(double)i;
		}
		System.out.println(res);
	}
}
/*
8
2.7178571428571425
*/