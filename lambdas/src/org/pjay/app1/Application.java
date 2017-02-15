/**
 * 
 */
package org.pjay.app1;

/**
 * @author vijayk
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new MyRunnable()).start();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("\nRunning Thread From Anonymous Class");
				//System.out.println("Class Name \t" + Thread.currentThread().getClass().getName());
				//System.out.println("Class Simple Name \t" + Thread.currentThread().getClass().getSimpleName());
				System.out.println("Class Name \t" + this.getClass().getName());
				System.out.println("Class Simple Name \t" + this.getClass().getSimpleName());
			}
		}).start();
		
		// lambdas
		//new Thread(() -> System.out.println("\nRunning Thread Using Lambdas")).start();
		new Thread(() -> {
				System.out.println("\nRunning Thread Using Lambdas");
				System.out.println("Active Thread Count \t" + Thread.activeCount());
				/**
					// Error: Cannot use this in a static context, because main is static
					// http://stackoverflow.com/questions/24202236/lambda-this-reference-in-java
					System.out.println("Class Name \t" + this.getClass().getName());
					System.out.println("Class Simple Name \t" + this.getClass().getSimpleName());
				*/
			}).start();
	}

}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Running Thread From MyRunnable Class");
		System.out.println("Class Name \t" + this.getClass().getName());
		System.out.println("Class Simple Name \t" + this.getClass().getSimpleName());
	}
	
}