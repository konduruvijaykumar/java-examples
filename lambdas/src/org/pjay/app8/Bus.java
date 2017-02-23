/**
 * 
 */
package org.pjay.app8;

/**
 * @author vijayk
 *
 */
public class Bus implements Vehicle, FourWheeler {

	// Error: Duplicate default methods named print with the parameters () and () are inherited from the types FourWheeler and Vehicle
	
	@Override
	public void print() {
		// You can call any one super method in implementation or both. Else you can override the whole logic without calling super
		Vehicle.super.print();
		FourWheeler.super.print();
	}
	
	// This takes super which is first implemented - Here first is Vehicle
	// In case if FourWheeler was first in implements order then it overridden from FourWheeler
	// static methods cannot be overridden though you have method it is like method hiding in case of classes extending another class. As static methods are class level and are not instance level
	// This looks different for interfaces helper static methods. It show overridden in IDE, but we cannot call them via class instance they can only be called by Interface name. Verify Application.java for this example
	public void blowHorn(){
		System.out.println("Bus blows Horn");
	}
}
