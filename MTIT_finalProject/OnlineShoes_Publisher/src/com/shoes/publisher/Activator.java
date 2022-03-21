package com.shoes.publisher;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	
	ServiceRegistration serviceReferenceShoes;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Start Online-shop(shoes)");
	
		
		Shoes shoe = new ShoesImpl();
		serviceReferenceShoes = context.registerService(Shoes.class.getName(),shoe, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop Online-shop(shoes)");
	
		serviceReferenceShoes.unregister();
	}


}

