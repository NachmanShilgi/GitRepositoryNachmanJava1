package e.loops;

import java.util.Scanner;

public class Demo2While {

		
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int password =123;
		 System.out.println("enter password");
		 int input = sc.nextInt();
		 
		
		while(input != password) {
			System.out.print("worng password, enter again");
			input = sc.nextInt();
			
		
		}
		
		sc. close();
		System.out.println("Log in");
	}

}
