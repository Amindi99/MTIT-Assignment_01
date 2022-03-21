package com.kids.publisher;


import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



/**
 * The activator class controls the plug-in life cycle
 */
public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistrationKids;


	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Start Online-shop(kids)");
		Kidsclothes kid = new KidsClothesImpl();
		serviceRegistrationKids = context.registerService(Kidsclothes.class.getName(),kid, null);
		
		
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop Online-shop(kids)");
		serviceRegistrationKids.unregister();

	}


}
