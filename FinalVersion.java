import java.awt.Graphics;

import javax.swing.JApplet;

public class Tick extends JApplet {
    public void paint(Graphics canvas) {
    	canvas.drawLine(250, 100, 250, 500);
    	canvas.drawLine(500,  100, 500, 500);
    	canvas.drawLine(590, 400, 150, 400);
    	canvas.drawLine(590, 200, 150, 200);
    	canvas.drawLine(450, 250,250,370);
    	canvas.drawLine(450, 370, 250, 250);
    	canvas.drawLine(600, 370, 550, 250);
    	canvas.drawLine(600, 250, 550, 370);
    	canvas.drawLine(100, 250, 175, 370);
    	canvas.drawLine(175, 250, 100, 370);
    	canvas.drawLine(0, 300, 700, 300);
    	canvas.drawOval(115, 80, 120, 120);
      //  canvas.drawOval(50, 50, 100, 100);
        //canvas.drawOval(70, 10, 10, 10);
    }
	}


