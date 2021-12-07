import java.util.Scanner;

public class ResultOfStudent {
	public static void main(String args[]) {
	int result;
	
	Scanner sc = new Scanner (System.in);
	System.out.println("what is yor score");
	result = sc.nextInt();
	
	if (result>=60) {
		System.out.println("you have passed with first division");
	}
		else if (result>=40) {
			System.out.println("you have passed with second division");
		}
		else if (result<40) {
			System.out.println("you have passed with third division");
		}
	}
	
	
}
