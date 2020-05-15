package loops;
import java.util.Scanner;
public class Patterns {

	public static void main(String[] args) {

		
				//spaces=i-1 and print 2 spaces
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the pattern");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
//			
//			 			Enter the size of the pattern
//						6
//						* * * * * * 
//						* * * * * * 
//						* * * * * * 
//						* * * * * * 
//						* * * * * * 
//						* * * * * * 
//
//			
			
			
			
/**************************************************************************************************/			
			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
//			
//			                    Enter the size of the pattern
//						        6
//			 					*  
//								* * 
//								* * * 
//								* * * * 
//								* * * * * 
//								* * * * * * 
//			 
			
			
/********************************************************************************************************/			
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i-1;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=n-i+1;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
//				
//							 						* * * * * * 
//													  * * * * * 
//													    * * * * 
//													      * * * 
//													        * * 
//													          * 
//				
//			
			
			
			/**************************************************************************************************/
			
			
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
//			
//			  
//			                       * * * * * * 
//								   * * * * * 
//								   * * * * 
//								   * * * 
//								   * * 
//								   * 
//
//			 
//			
			/**************************************************************************************************/	
			
			
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i-1;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=n-i+1;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
			
//			         	  * 
//				        * * 
//				      * * * 
//				    * * * * 
//				  * * * * * 
//				* * * * * * 
//
//
//			 
			/**************************************************************************************************/
			
			
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=i-1;j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=n-i+1;j++)
				{
					System.out.print("*  ");
				}
				System.out.println();
			}
			
			
//			*  
//		    *  *  
//		   *  *  *  
//		  *  *  *  *  
//		 *  *  *  *  *  
//		*  *  *  *  *  *  

			
			/**************************************************************************************************/
			
			
			int rows=2*n-1;
			for(int i=1;i<=rows;i++)
			{
				if(i<=n)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print("* ");
					}
				}
				else
				{
					for(int j=1;j<=rows-i+1;j++)
					{
						System.out.print("* ");
					}
				}
				System.out.println();
			}
			
			
//			* 
//			* * 
//			* * * 
//			* * * * 
//			* * * * * 
//			* * * * * * 
//			* * * * * 
//			* * * * 
//			* * * 
//			* * 
//			* 

			/**************************************************************************************************/
			
			
			System.out.println("*");
			
			
			for(int i=2;i<=n-1;i++)
			{
				System.out.print("* ");
				for(int j=1;j<=i-2;j++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
				System.out.println();
			}
			if(n>1)
			{
				for(int i=1;i<=n;i++)
				{
					System.out.print("* ");
				}
			}
			
//			*
//			* * 
//			*   * 
//			*     * 
//			*       * 
//			* * * * * *
			/**************************************************************************************************/
	}

}
