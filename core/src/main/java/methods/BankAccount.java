package methods;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("*******************Banks Account Management System*******************");

		BankAccountManagement bankAccountManagement = new BankAccountManagement();
		System.out.println("Please Enter Your Choice");
		int ch = 1;
		while (ch > 0 && ch < 5) {
			System.out.println("\n1.Create Acount\n2.Display Data\n3.Add Ammount\n4.Withdraw Ammount\n5.Exit");
			ch = scanner.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Please Enter Your Name ");
				scanner.nextLine();
				String name = scanner.nextLine();
				System.out.println("Enter Account Number");
				int accNo = scanner.nextInt();
				System.out.println("Please Enter Ammount");
				double amm = scanner.nextDouble();
				bankAccountManagement.insertData(accNo, name, amm, true);
				break;
			case 2:
				bankAccountManagement.displayData();
				;
				break;
			case 3:
				System.out.println("Enter Ammount To Deposite");
				amm = scanner.nextDouble();
				bankAccountManagement.deposite(amm);
				break;
			case 4:
				System.out.println("Enter Ammount To Withdraw");
				amm = scanner.nextDouble();
				bankAccountManagement.withdraw(amm);
				break;
			default:
				System.out.println("Please Enter Correct Choice");
				break;
			}
		}
		scanner.close();
	}
}
