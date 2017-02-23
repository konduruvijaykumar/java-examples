/**
 * 
 */
package org.pjay.app8;

/**
 * @author vijayk
 *
 */
public class Car implements Vehicle, FourWheeler {
	
	// IMP: if you don't implement any method from interfaces and try to create class then you will get below compiler Error
	// Duplicate default methods named print with the parameters () and () are inherited from the types FourWheeler and Vehicle
	
	/*
		@Override
		public void print() {
			// You can call any one super method in implementation or both. Else you can override the whole logic without calling super
			//Vehicle.super.print();
			FourWheeler.super.print();
		}
	*/
	
	public void print(){
		System.out.println("I am a Car");
	}

}
