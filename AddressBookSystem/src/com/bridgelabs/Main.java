package com.bridgelabs;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");
		AddressBook addressBook = new AddressBook();
		addressBook.addContacts();
		System.out.println(addressBook.toString());
	}
}
