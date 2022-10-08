//WPTD all the prime palindrome numbers from user given range(Start and End).

import java.util.Scanner;

public class SPrimePalindromeRange 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Starting Number");
		int start=sc.nextInt();
		
		System.out.println("\nEnter the Ending Number");
		int end=sc.nextInt();
		
		System.out.print("\nPrime Palindrome Numbers from " + start +" to "+ end + " = ");
		
		while(start<=end)
		{
			int num=start;
			
			int rev=0;
				
			while(num>0)
			{
				int digit=num%10;
					
				rev=rev*10+digit;
					
				num=num/10;	
			}
				
			if(rev==start)
			{
				int i=2;
				
				while(rev>=i)
				{
					if(rev%i==0)                          
					{
						break;                    
					}
					
					i++;		
				}
				
				if(rev==i)
				{
					System.out.print(rev + " ");
				}
			}
				
				start++;
		}	
	}
}
