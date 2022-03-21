package com.kids.publisher;

import java.util.Scanner;

public class KidsClothesImpl implements Kidsclothes{

	
	Scanner sc = new Scanner(System.in);
	int quntity = 0;
	int totalBill = 0;
	int size = 0;
	String color = "";

	@Override
	public void calculateKidsClothesPrice(int price) {
		
		System.out.println("----Welcome to the Kids Clothing Sector----");
		
		System.out.println("--Select the Kids-Shirt size option below mention--");
		System.out.println("small  : Option 01");
		System.out.println("medium : Option 02");
		System.out.println("large  : Option 03");
		System.out.print("Enter Size Option Number you want : ");
		size = sc.nextInt();
		
		System.out.println("Select the Kids-Shirt Color you want :");
		color = sc.next();

		System.out.print("Select the Kids-Shirts Qunatity you want : ");
		quntity = sc.nextInt();
		
		
		if(size == 1) {
			int newprice = price + 100;
			int totalBill = quntity * newprice;
			System.out.println("Total Bill Price is :" + totalBill + " AND Selected color code is : " + color);
			System.out.println("THANK YOU COME AGAIN!");
			
			
		}
		else if(size == 2) {
			int newprice = price + 200;
			int totalBill = quntity * newprice;
			System.out.println("Total Bill Price is :" + totalBill + " AND Selected color code is : " + color);
			System.out.println("THANK YOU COME AGAIN!");
		}
        else if(size == 3) {
        	int newprice = price + 300;
			int totalBill = quntity * newprice;
			System.out.println("Total Bill Price is :" + totalBill + " AND Selected color code is : " + color);
			System.out.println("THANK YOU COME AGAIN!");
		}
        else {
        	System.out.println("Enter the valid number!");
        }
		
	}
		


	@Override
	public String publishService() {
		// TODO Auto-generated method stub
		return "active the kids clothes publisher";
	}
		
	}


