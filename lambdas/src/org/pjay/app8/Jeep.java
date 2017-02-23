/**
 * 
 */
package org.pjay.app8;

/**
 * @author vijayk
 *
 */
public class Jeep implements FourWheeler, Vehicle {

	// Error: Duplicate default methods named print with the parameters () and () are inherited from the types FourWheeler and Vehicle
	
	@Override
	public void print() {
		FourWheeler.super.print();
		// trying this probability
		Vehicle.blowHorn();
	}
	
	// Error
	/**
		Multiple markers at this line
			- The method blowHorn() of type Jeep must override or implement a supertype 
			 method
			- overrides org.pjay.app8.Vehicle.blowHorn
	 */
	// Solution by IDE is remove @Override annotation, but this takes super which is first implemented - Here first is FourWheeler
	// In case if Vehicle was first in implements order then it overridden from vehicle
	// static methods cannot be overridden though you have method it is like method hiding in case of classes extending another class. As static methods are class level and are not instance level
	// This looks different for interfaces helper static methods. It show overridden in IDE, but we cannot call them via class instance they can only be called by Interface name. Verify Application.java for this example
	//@Override
	public void blowHorn(){
		System.out.println("Jeep blows Horn");
		Vehicle.blowHorn();
		FourWheeler.blowHorn();
	}
	
}
