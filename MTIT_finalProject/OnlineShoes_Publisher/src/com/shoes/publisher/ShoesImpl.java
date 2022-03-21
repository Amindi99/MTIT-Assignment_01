package com.shoes.publisher;

import java.util.Scanner;

public class ShoesImpl implements Shoes {

	Scanner sc = new Scanner(System.in);
	int quntity = 0;
	int totalBill = 0;
	int size = 0;
	String color = "";
	int category = 0;
	int discount = 0;
	int disTotalBill = 0;
	int gender = 0;

	@Override
	public void calculateShoesPrice(int price) {

		System.out.println("----Welcome to the Shoes Sector----");

		System.out.println("--Select the Gender you looking for shoes--");
		System.out.println("Male    : Option 01");
		System.out.println("Female  : Option 02");
		System.out.print("Enter Option Number you want : ");
		gender = sc.nextInt();

		if (gender == 1) {
			System.out.println("select the category you looking for");
			System.out.println("Atheletic shoes : Option 01");
			System.out.println("Sleepes         : Option 02");
			category = sc.nextInt();
			if (category == 1) {
				System.out.println("--Select the Mens size option below mention--");
				System.out.println("small  : Option 01");
				System.out.println("medium : Option 02");
				System.out.print("Enter Size Option Number you want : ");
				size = sc.nextInt();

				System.out.print("Select the Shoes Qunatity you want : ");
				quntity = sc.nextInt();

				System.out.println(" -- all the mens shoes added 15% discount --");

				if (size == 1) {

					int totalBill = quntity * price;
					discount = totalBill * 15 / 100;
					disTotalBill = totalBill - discount;
					System.out.println(" --Shoes Details-- ");
					System.out.println("shoe size : small | Category : mens");
					System.out.println("discount price for your shoes :" + discount);
					System.out.println("Total Price is : " + disTotalBill);
					System.out.println("THANK YOU COME AGAIN!");

				} else if (size == 2) {

					int totalBill = quntity * price;
					discount = totalBill * 15 / 100;
					disTotalBill = totalBill - discount;
					System.out.println(" --Shoes Details-- ");
					System.out.println("shoe size : medium | Category : mens");
					System.out.println("discount price for your shoes :" + discount);
					System.out.println("Total Price is : " + disTotalBill);
					System.out.println("THANK YOU COME AGAIN!");

				}

				else {
					System.out.println("Enter the valid shoe size!");
				}
			} else if (category == 2) {
				System.out.println("--Select the Mens size option below mention--");
				System.out.println("small  : Option 01");
				System.out.println("medium : Option 02");
				System.out.print("Enter Size Option Number you want : ");
				size = sc.nextInt();

				System.out.print("Select the Shoes Qunatity you want : ");
				quntity = sc.nextInt();

				System.out.println(" -- all the mens shirts added 15% discount --");

				if (size == 1) {

					int totalBill = quntity * price;
					discount = totalBill * 15 / 100;
					disTotalBill = totalBill - discount;
					System.out.println(" --Shoes Details-- ");
					System.out.println("shoe size : small | Category : mens");
					System.out.println("discount price for your shoes :" + discount);
					System.out.println("Total Price is : " + disTotalBill);
					System.out.println("THANK YOU COME AGAIN!");

				} else if (size == 2) {

					int totalBill = quntity * price;
					discount = totalBill * 15 / 100;
					disTotalBill = totalBill - discount;
					System.out.println(" --Shoes Details-- ");
					System.out.println("shoe size : medium | Category : mens");
					System.out.println("discount price for your shoes :" + discount);
					System.out.println("Total Price is : " + disTotalBill);
					System.out.println("THANK YOU COME AGAIN!");

				}
			}
		} else if (gender == 2) {
			System.out.println("select the category you looking for");
			System.out.println("Atheletic shoes : Option 01");
			System.out.println("Sleepes         : Option 02");
			category = sc.nextInt();
			if (category == 1) {
				System.out.println("--Select the Woens size option below mention--");
				System.out.println("small  : Option 01");
				System.out.println("medium : Option 02");
				System.out.print("Enter Size Option Number you want : ");
				size = sc.nextInt();

				System.out.print("Select the Shoes Qunatity you want : ");
				quntity = sc.nextInt();

				System.out.println(" -- all the womens shoes added 10% discount --");

				if (size == 1) {

					int totalBill = quntity * price;
					discount = totalBill * 10/ 100;
					disTotalBill = totalBill - discount;
					System.out.println(" --Shoes Details-- ");
					System.out.println("shoe size : small | Category : mens");
					System.out.println("discount price for your shoes :" + discount);
					System.out.println("Total Price is : " + disTotalBill);
					System.out.println("THANK YOU COME AGAIN!");

				} else if (size == 2) {

					int totalBill = quntity * price;
					discount = totalBill * 10 / 100;
					disTotalBill = totalBill - discount;
					System.out.println(" --Shoes Details-- ");
					System.out.println("shoe size : medium | Category : mens");
					System.out.println("discount price for your shoes :" + discount);
					System.out.println("Total Price is : " + disTotalBill);
					System.out.println("THANK YOU COME AGAIN!");

				}

				else {
					System.out.println("Enter the valid shoe size!");
				}
			} else if (category == 2) {
				System.out.println("--Select the Womens size option below mention--");
				System.out.println("small  : Option 01");
				System.out.println("medium : Option 02");
				System.out.print("Enter Size Option Number you want : ");
				size = sc.nextInt();

				System.out.print("Select the Shoes Qunatity you want : ");
				quntity = sc.nextInt();

				System.out.println(" -- all the mens shirts added 15% discount --");

				if (size == 1) {

					int totalBill = quntity * price;
					discount = totalBill * 10 / 100;
					disTotalBill = totalBill - discount;
					System.out.println(" --Shoes Details-- ");
					System.out.println("shoe size : small | Category : womens");
					System.out.println("discount price for your shoes :" + discount);
					System.out.println("Total Price is : " + disTotalBill);
					System.out.println("THANK YOU COME AGAIN!");

				} else if (size == 2) {

					int totalBill = quntity * price;
					discount = totalBill * 10 / 100;
					disTotalBill = totalBill - discount;
					System.out.println(" --Shoes Details-- ");
					System.out.println("shoe size : medium | Category : womens");
					System.out.println("discount price for your shoes :" + discount);
					System.out.println("Total Price is : " + disTotalBill);
					System.out.println("THANK YOU COME AGAIN!");

				}else {
					System.out.println("Enter the valid shoe size!");
				}
			}
			

		} else {
			System.out.println("enter the valid gender type!");
		}

		

	}

	@Override
	public String publishService() {
		// TODO Auto-generated method stub
		return "active the Shoes publisher";
	}

}
