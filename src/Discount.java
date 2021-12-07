import java.util.Scanner;
public class Discount {
	public static void main(String args[]) {
		int amount;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the amount ");
		amount = sc.nextInt();
		
		if (amount>50000) {
			System.out.println("your payable amount is " + (amount-5000));
		}
		else if (amount>30000) {
			System.out.println("your payable amount is " + (amount-2000));
		}
		}

}
