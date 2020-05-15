package loops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {

		/*
		 * taking user input till enters negative number
		 */
		Scanner sc=new Scanner(System.in);
		int n;
		for(;;)
		{
			n=sc.nextInt();
			if(n<0)
			{
				System.out.println("you entered negetive number");
				break;
			}
		}

	}

}
/*
23
1
2
7
7
8
-2
you entered negetive number
*/