import java.util.Scanner;

public class Condition2 {
	public static void main(String args[]) {
		int a;
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter any number ");
			a = sc.nextInt();
			
			

				switch (a) {
					case 10:
						System.out.println("a is 10");
						break;
					case 20:
						System.out.println("a is 20");
						break;
					case 30:
						System.out.println("a is 30");
						break;
					case 40:
						System.out.println("a is 40");
						break;
					default:
						System.out.println("No condition true");
				}
			}
	}
