//  Michelle Loven  10.9.2016

import java.util.Random;
import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;
import java.awt.Color;


public class Circles_rand extends Applet{    //fixed spelling mistake cirlces* ~brendan

        @Override //added override suggested by ide ~brendan
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
                //calls new draw method, description below ~brendan
		drawSymbol(g,dFirst, dSecond, dThird, dThird);
		
		
		
		numCirc++; //shorthand ~brendan
		}
	}
        
        
//        This method attempts to take randomly generated numbers and convert them
//        into a visual representation, of the infinite variable that is my love
//        for mishka <3 ~brendan
        
        public void drawSymbol(Graphics g, int x, int y, int width, int height) {
                int[] triangleX = {
                        x - 2*width/18,
                        x + width + 2*width/18,
                        (x - 2*width/18 + x + width + 2*width/18)/2};
                int[] triangleY = { 
                        y + height - 2*height/3, 
                        y + height - 2*height/3, 
                        y + height};
                g.fillOval(
                        x - width/7,
                        y, 
                        width/2 + width/6 + width/10, 
                        height/2); 
                g.fillOval(
                        x + width/2 - width/8,
                        y,
                        width/2 + width/6 + width/10,
                        height/2);
                g.fillPolygon(triangleX, triangleY, triangleX.length);
        }
        
}

