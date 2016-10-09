//  Michelle Loven  10.9.2016

import java.util.Random;
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;
import java.awt.Color;


public class Cirlces_rand extends Applet{

	public void paint(Graphics g) {
	     
		Scanner askNum = new Scanner(System.in);
	     System.out.println("Pick the number of circles you want!");
	     double gotNum = askNum.nextDouble();
		
		double numCirc = 0;
	     
		while(numCirc < gotNum){
		
		Random randColor = new Random();
		int rColor = randColor.nextInt(256);
		int gColor = randColor.nextInt(256);
		int bColor = randColor.nextInt(256);
		
		Color colorC = new Color(rColor,gColor,bColor);
		
		
		
		Random firstCirc = new Random();
		int dFirst = firstCirc.nextInt(700);
		
		Random secondCirc = new Random();
		int dSecond = secondCirc.nextInt(300);
		
		Random thirdCirc = new Random();
		int dThird = thirdCirc.nextInt(300);
		
	
		g.setColor(colorC);
		g.fillOval(dFirst, dSecond, dThird, dThird);
		
		
		
		numCirc = numCirc + 1;
		}
		
		/* public void init(){	
			Scanner askNum = new Scanner(System.in);
		     System.out.println("Pick the number of circles you want!");
		     double gotNum = askNum.nextDouble();
		     
		     
		}*/
	}
}


