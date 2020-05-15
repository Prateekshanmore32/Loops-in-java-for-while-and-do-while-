package loops;

public class ForLoops {

	public static void main(String[] args) {

		/*
		 * print numbers from 1 to 100
		 */
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		/*
		 * print all even numbers from 0 to 100
		 */
		for(int i=0;i<=100;i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		/*
		 * print numbers form 100 to 1;
		 */
		for(int i=100;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		/*
		 * sum of first 100 numbers
		 */
		int sum=0;
		for(int i=0;i<=100;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		/*
		 * factorial of a number
		 */
		int n=5;
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact*=i;
		}
		System.out.println("fact of "+n+"is "+ fact);
	}

}
/*
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100 
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100 
100 99 98 97 96 95 94 93 92 91 90 89 88 87 86 85 84 83 82 81 80 79 78 77 76 75 74 73 72 71 70 69 68 67 66 65 64 63 62 61 60 59 58 57 56 55 54 53 52 51 50 49 48 47 46 45 44 43 42 41 40 39 38 37 36 35 34 33 32 31 30 29 28 27 26 25 24 23 22 21 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 
5050
fact of 5is 120
*/