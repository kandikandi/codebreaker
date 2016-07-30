package main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Symbol {

	private Image image;
	
	public Symbol(int nextInt) {
		assignImage(nextInt);
	}
	
	public Image getImage(){
		return image;
	}

	private void assignImage(int nextInt) {
		switch(nextInt){
		
		case 0: try {
		    image = ImageIO.read(new File("strawberry.jpg"));
			} catch (IOException e) {
			}
		break;
		case 1: try {
		    image = ImageIO.read(new File("strawberry.jpg"));
			} catch (IOException e) {
			}
		break;
		case 2: try {
		    image = ImageIO.read(new File("strawberry.jpg"));
			} catch (IOException e) {
			}
		break;
		case 3: try {
		    image = ImageIO.read(new File("strawberry.jpg"));
			} catch (IOException e) {
			}
		break;
		case 4: try {
		    image = ImageIO.read(new File("strawberry.jpg"));
			} catch (IOException e) {
			}
		break;
		case 5: try {
		    image = ImageIO.read(new File("strawberry.jpg"));
			} catch (IOException e) {
			}
		break;
				
		}
	}
}


