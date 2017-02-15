package org.pjay;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

/**
 * @author vijayk
 *
 */
public class SampleController {
	
	@FXML
	private Button clickMeButton;//Match the id name from xml object
	
	public void initialize(){
		// Without lambdas
		/**
			clickMeButton.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					System.out.println("You Clicked Me!");
				}
			});
		 */
		
		// With lambdas
		//clickMeButton.setOnAction((even) -> System.out.println("You Clicked Me!"));
		clickMeButton.setOnAction(even -> System.out.println("You Clicked Me!"));
	}
	
}
