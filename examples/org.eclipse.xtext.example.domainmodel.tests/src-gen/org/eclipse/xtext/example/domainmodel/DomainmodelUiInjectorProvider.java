/*
* generated by Xtext
*/
package org.eclipse.xtext.example.domainmodel;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DomainmodelUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.eclipse.xtext.example.domainmodel.ui.internal.DomainmodelActivator.getInstance().getInjector("org.eclipse.xtext.example.domainmodel.Domainmodel");
	}
	
}
