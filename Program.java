package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Tools;



public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		Tools tools = new Tools();
		
		System.out.print("Enter account number: ");
		tools.setAccNumber(sc.nextInt());
		System.out.print("Enter account Holder: ");
		tools.name = sc.next();
		sc.nextLine();
		System.out.print("is there a initial deposit? (y/n): ");
		String f = sc.next();
		if (f.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit: ");
			tools.Addition(sc.nextDouble());
		}
		System.out.println("");
		tools.accountData();
		
		System.out.println("");
		System.out.print("Enter a deposit value: ");
		tools.Addition(sc.nextDouble());
		tools.accountData();
		
		System.out.println("");
		System.out.print("Enter a withdraw value: ");
		tools.Decrease(sc.nextDouble());
		tools.accountData();
		
		
		

		
		sc.close();
	}
}


