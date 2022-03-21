package com.mens.publisher;

import java.util.Scanner;

public class MensClothesImpl implements Mensclothes {

	Scanner sc = new Scanner(System.in);
	int quntity = 0;
	int totalBill = 0;
	int size = 0;
	String color = "";
	int category = 0;
	int discount = 0;
	int disTotalBill = 0;

	@Override
	public void calculateMensClothesPrice(int price) {

		System.out.println("----Welcome to the Mens Clothing Sector----");

		System.out.println("--Select the Mens Clothes Category option below mention--");
		System.out.println("Denim  : Option 01");
		System.out.println("Shirt  : Option 02");
		System.out.print("Enter Size Option Number you want : ");
		category = sc.nextInt();

		System.out.println("--Select the Mens size option below mention--");
		System.out.println("small  : Option 01");
		System.out.println("medium : Option 02");
		System.out.println("large  : Option 03");
		System.out.print("Enter Size Option Number you want : ");
		size = sc.nextInt();

		System.out.println("Select the Mens-Shirt Color you want :");
		color = sc.next();

		System.out.print("Select the Mens-Shirts Qunatity you want : ");
		quntity = sc.nextInt();
		System.out.println(" -- all the mens shirts added 10% discount --");

		if (size == 1 && category == 1) {
			int newprice = price + 100;
			int totalBill = quntity * newprice;
			discount = totalBill * 10 / 100;
			disTotalBill = totalBill - discount;
			System.out.println(" --Dress Details-- ");
			System.out.println("Color code :" + color + "| Category : Denim");
			System.out.println("discount price for your clothes :" + discount);
			System.out.println("Total Price is : " + disTotalBill);
			System.out.println("THANK YOU COME AGAIN!");
		} else if (size == 1 && category == 2) {
			int newprice = price + 100;
			int totalBill = quntity * newprice;
			discount = totalBill * 10 / 100;
			disTotalBill = totalBill - discount;
			System.out.println(" --Dress Details-- ");
			System.out.println("Color code :" + color + "| Category : Shirt");
			System.out.println("discount price for your clothes :" + discount);
			System.out.println("Total Bill Price is : " + disTotalBill);
			System.out.println("THANK YOU COME AGAIN!");
		} else if (size == 2 && category == 1) {
			int newprice = price + 200;
			int totalBill = quntity * newprice;
			discount = totalBill * 10 / 100;
			disTotalBill = totalBill - discount;
			System.out.println(" --Dress Details-- ");
			System.out.println("Color code :" + color + "| Category : Denim");
			System.out.println("discount price for your clothes :" + discount);
			System.out.println("Total Bill Price is : " + disTotalBill);
			System.out.println("THANK YOU COME AGAIN!");
		} else if (size == 2 && category == 2) {
			int newprice = price + 200;
			int totalBill = quntity * newprice;
			discount = totalBill * 10 / 100;
			disTotalBill = totalBill - discount;
			System.out.println(" --Dress Details-- ");
			System.out.println("Color code :" + color + "| Category : Shirt");
			System.out.println("discount price for your clothes :" + discount);
			System.out.println("Total Bill Price is : " + disTotalBill);
			System.out.println("THANK YOU COME AGAIN!");
		} else if (size == 3 && category == 1) {
			int newprice = price + 300;
			int totalBill = quntity * newprice;
			discount = totalBill * 10 / 100;
			disTotalBill = totalBill - discount;
			System.out.println(" --Dress Details-- ");
			System.out.println("Color code :" + color + "| Category : Denim");
			System.out.println("discount price for your clothes :" + discount);
			System.out.println("Total Bill Price is : " + disTotalBill);
			System.out.println("THANK YOU COME AGAIN!");
		} else if (size == 3 && category == 2) {
			int newprice = price + 300;
			int totalBill = quntity * newprice;
			discount = totalBill * 10 / 100;
			disTotalBill = totalBill - discount;
			System.out.println(" --Dress Details-- ");
			System.out.println("Color code :" + color + "| Category : Shirt");
			System.out.println("discount price for your clothes :" + discount);
			System.out.println("Total Bill Price is : " + disTotalBill);
			System.out.println("THANK YOU COME AGAIN!");
		} else {
			System.out.println("Enter the valid number!");
		}

	}

	@Override
	public String publishService() {
		// TODO Auto-generated method stub
		return "active the mens clothes publisher";
	}

}
