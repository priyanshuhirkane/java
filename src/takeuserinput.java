import java.util.Scanner;

public class takeuserinput {
	public static void main(String args[]) {
			int a,b,result;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the first name");
			a = sc.nextInt();
			
			System.out.println("enter the second name");
			b = sc.nextInt();
			
			result = a + b;
			
			System.out.print("sum of " + a + "& " + b + "is " + result );
    
	}
}