package com.mens.publisher;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {


	ServiceRegistration serviceReferenceMens;


	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Start Online-shop(mens)");
	
		
		Mensclothes men = new MensClothesImpl();
		serviceReferenceMens = context.registerService(Mensclothes.class.getName(),men, null);
		

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop Online-shop(mens)");
	
		serviceReferenceMens.unregister();

	}


}

