package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawExceptions;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String name = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, name, balance, withdrawLimit);

			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdrawBalance = sc.nextDouble();
			
			account.withdraw(withdrawBalance);
		} catch (WithdrawExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		sc.close();

	}

}
