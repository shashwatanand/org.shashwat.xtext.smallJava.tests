/*
 * generated by Xtext
 */
package org.shashwat.xtext.smallJava;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SmallJavaDslUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.shashwat.xtext.smallJava.ui.internal.SmallJavaDslActivator.getInstance().getInjector("org.shashwat.xtext.smallJava.SmallJavaDsl");
	}
	
}
