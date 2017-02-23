/**
 * 
 */
package org.pjay.app8;

/**
 * @author vijayk
 *
 */

//https://www.tutorialspoint.com/java8/java8_default_methods.htm
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Vehicle car1 = new Car();
		FourWheeler car2 = new Car();
		Car car3 = new Car();
		
		System.out.println("\n=================== Car =======================");
		car1.print();// only method accessible
		car2.print();// only method accessible
		car3.print();// only method accessible
		
		
		Vehicle bus1 = new Bus();
		FourWheeler bus2 = new Bus();
		Bus bus3 = new Bus();
		
		System.out.println("\n=================== Bus =======================");
		bus1.print();
		// Error: This static method of interface Vehicle can only be accessed as Vehicle.blowHorn
		//bus1.blowHorn();
		bus2.print();
		// Error: This static method of interface FourWheeler can only be accessed as FourWheeler.blowHorn
		//bus2.blowHorn();
		bus3.print();
		bus3.blowHorn();
		
		
		Vehicle jeep1 = new Jeep();
		FourWheeler jeep2 = new Jeep();
		Jeep jeep3 = new Jeep();
		
		System.out.println("\n=================== Jeep =======================");
		jeep1.print();
		//Error: This static method of interface Vehicle can only be accessed as Vehicle.blowHorn
		//jeep1.blowHorn();
		jeep2.print();
		//Error: This static method of interface FourWheeler can only be accessed as FourWheeler.blowHorn
		//jeep2.blowHorn();
		jeep3.print();
		jeep3.blowHorn();
		
		
		System.out.println("\n=================== SuperClassA Instances =======================");
		SuperClassA superClassA1 = new SuperClassA();
		superClassA1.print();
		superClassA1.method1();
		
		System.out.println("\n=================== SubClassB Instances =======================");
		SuperClassA subClassB1 = new SubClassB();
		SubClassB subClassB2 = new SubClassB();
		
		// Only two methods accessible
		// Warning: The static method print() from the type SuperClassA should be accessed in a static way
		subClassB1.print();
		subClassB1.method1();
		
		// All three methods accessible
		// Warning: The static method print() from the type SubClassB should be accessed in a static way
		subClassB2.print();
		subClassB2.method1();
		subClassB2.method2();
		
	}

}
