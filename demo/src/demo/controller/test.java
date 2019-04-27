package demo.controller;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the valuse");
		String val= sc.nextLine();
		
		while(flag) {
			System.out.println(val);
	if(val.equals("1")||val.equals("2")||val.equals("3")||val.equals("4"))
	{
		flag=false;
		break;
	}
		System.out.println("Enter the input");
		val=sc.nextLine();
	}
		System.out.println("right answer");
		
		
	String in="human";
	String out="";
	for (int i = 0; i < args.length; i++) {
		
	}
		
		
}
}













