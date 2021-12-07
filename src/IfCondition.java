import java.util.Scanner;

public class IfCondition {
	
	public static void main(String args[]) {
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter age");
		a = sc.nextInt();
		
		if( a > 18 ) {
			System.out.println("you can drive");
		}
		else {
			System.out.println("you cannot drive");
			
		}
		
	}

}
