package com.bridgelabs;

import java.util.Scanner;

public class Main {
	static AddressBook obj = new AddressBook();

	public static void main(String[] args)
	{
		boolean isExit = false;
		while (!isExit)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Select any option from below \n \n 1.Add Contact.\n 2.Edit Contact.\n 3.Display Contact \n 4.Exit");
			int input = sc.nextInt();
			switch (input)
			{
			case 1:
				System.out.println("Add contact details ");
				obj.addNewContact();
				break;
			case 2:
				obj.editContact();
				break;
			case 3:
				obj.displayList();
				break;
			case 4:
				isExit = true;
				break;
			default:
				System.out.println("Kindly enter a valid input");
				sc.close();
			}
		}
	}
}