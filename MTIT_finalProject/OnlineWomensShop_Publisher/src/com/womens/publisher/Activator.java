package com.womens.publisher;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration serviceReferenceWomens;


	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Start Online-shop(womens)");
		
		Womensclothes women = new WomensClothesImpl();
		serviceReferenceWomens = context.registerService(Womensclothes.class.getName(),women, null);
		
	
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop Online-shop(womens)");
		serviceReferenceWomens.unregister();
		
	}


}

