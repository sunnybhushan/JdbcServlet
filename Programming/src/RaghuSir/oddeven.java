package RaghuSir;

import java.util.Scanner;

public class oddeven 
{
	

		
	
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the no");
			int no = sc.nextInt();
			int count=0;
			for(int i=1;i<=no;i++)
			{
			int n=i%2;
			if(n==0)
			{
			count++;
			System.out.println("Total Even digits are "+i);			
			}
		    
			}
			System.out.println("count"+count);
	       int  n=10;
			String st=String.valueOf( n);
			System.out.println(st);
			
		}
			}
	
	

