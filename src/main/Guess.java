package main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Guess {
	
	Image image;
	String type;
	
	public Guess(String string) {
		type = string;
		assignImage();
	}
	
	public Image getImage(){
		return image;
	}
	
	private void assignImage() {
		
		switch(type){
		case "Correct":
			try {
			    image = ImageIO.read(new File("strawberry.jpg"));
				} catch (IOException e) {
				}
			break;
		case "WrongPlace":
			try {
			    image = ImageIO.read(new File("strawberry.jpg"));
				} catch (IOException e) {
				}
			break;
		case "Incorrect":
			try {
			    image = ImageIO.read(new File("strawberry.jpg"));
				} catch (IOException e) {
				}
			break;
		}
		
		
	}

}
