package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ;

		int a ,b ;
		char operator ;
		int result;
	
		
		System.out.println("enter first number");
		a = sc.nextInt();
		
		System.out.println("enter the operator");
		operator = sc.next().charAt(0);
		
		System.out.println("enter second number");
		b = sc.nextInt();
		
		switch (operator) {
		case ('+'):
		result = a + b ;
		System.out.println("addition of " + a + " & " + b + " is " + result );
			break;
		case ('-'):
			result = a - b ;
			System.out.println("subtraction of " + a + " & " + b + " is " + result );
				break;
		case ('/'):
			result = a / b ;
			System.out.println("division of " + a + " & " + b + " is " + result );
				break;
		case ('*'):
			result = a * b ;
			System.out.println("multiplication of " + a + " & " + b + " is " + result );
				break;
		default:
			System.out.println("thank you");
		
		
		
		}

	}
}

