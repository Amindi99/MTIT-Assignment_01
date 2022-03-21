package onlinekidsshop_subscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import com.kids.publisher.Kidsclothes;




public class Activator  implements BundleActivator  {

	
	ServiceReference serviceReferenceKids;


	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("start subscriber service Onlineshop");
		serviceReferenceKids = context.getServiceReference(Kidsclothes.class.getName());
		Kidsclothes kids = (Kidsclothes)context.getService(serviceReferenceKids);
		System.out.println(kids.publishService());
		

		
        Scanner scan = new Scanner(System.in);
		
        while (true) {
		
		System.out.println();
		System.out.println("-- Welcome to the Earth Wind Online Shop --");
		System.out.println();
		System.out.println("Kids clothes  | Enter 1");
		System.out.println("Women clothes | Enter 2");
		System.out.println("Men clothes   | Enter 3");
		System.out.println("Shoes         | Enter 4");
		System.out.println("Exit          | Enter 0");

		System.out.println("Select the category u like :");
		int num = scan.nextInt();
		
		if (num == 1) {
			System.out.println("Enter the price you looking for : ");
			int price = scan.nextInt();
			kids.calculateKidsClothesPrice(price);
		}
		
		if(num == 0) {
			System.out.println("Exit the online-shop");
			break;
		}
        }
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("good bye subscriber service Onlineshop");
		context.ungetService(serviceReferenceKids);

	}

	

}

