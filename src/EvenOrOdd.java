import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String args[]) 
	{
		int num1;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println();
		 
			System.out.println("enter any number ");
			num1 = sc.nextInt();
			if (num1%2==0) {
				System.out.println("this is even number");
			}
			else {
				System.out.println("this is not even number");
			}
	}
}
