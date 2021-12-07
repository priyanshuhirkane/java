import java.util.Scanner;

public class SimpleInterest {
	public static void main(String args[]) {
		int amount,time,rate=10;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter principal amount ");
		amount = sc.nextInt();
		
				System.out.println("enter time ");
		time = sc.nextInt();
		 
				if (amount>100000) {
					rate=14;
			
				}
				else if (amount>50000) {
					rate=12;
					
					
				}
		float si= amount*rate*time/100;
		System.out.println("simple interesr is " + si );
		
				
				
					
	}
	

}
