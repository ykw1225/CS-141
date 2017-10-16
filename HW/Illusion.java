// Yeung Kit Wong
// 10-12-2014
// HW3
// Part B

import java.awt.*;
public class Illusion
{
	public static void main(String[]args)
	{
		DrawingPanel panel=new DrawingPanel(500,400);
		panel.setBackground(Color.GRAY);
		Graphics g=panel.getGraphics();

		drawCir(g,0,0,90,3);
		drawCir(g,120,10,90,3);
		drawCir(g,250,50,80,5);
		arrage(g,350,20,40,5,3);
		arrage(g,10,120,100,10,2);
		arrage(g,230,160,50,5,4);
	}
	public static void drawCir(Graphics g, int x, int y, int d, int sub) // This method is to draw the circles. d means diameter. sub is how many small circle in there.
	{
		int gap=d/sub/2;
		g.setColor(Color.RED);

		g.fillOval(x,y,d,d); // Red circle with fill.
		drawDia(g,x,y,d);

		for(int i=0;i<=sub;i++) // Black outline circle.
		{
			g.drawOval(x,y,d,d);
			x+=gap;
			y+=gap;
			d-=2*gap;
		}
	}
	public static void drawDia(Graphics g, int x, int y, int d) // This method is to draw the diamond.
	{
		g.setColor(Color.BLACK);

		// Here are the four points of the diamond shape which inside the circle.
		int p1_x=x, 	p1_y=y+d/2,
			p2_x=x+d/2, p2_y=y,
			p3_x=x+d, 	p3_y=y+d/2,
			p4_x=x+d/2, p4_y=y+d;

		g.drawLine(p1_x, p1_y, p2_x, p2_y);
		g.drawLine(p2_x, p2_y, p3_x, p3_y);
		g.drawLine(p3_x, p3_y, p4_x, p4_y);
		g.drawLine(p4_x, p4_y, p1_x, p1_y);
	}
	public static void drawSqt(Graphics g, int x, int y, int l) // This method is to draw the light gray squrt.
	{
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x,y,l,l);
		g.setColor(Color.RED);
		g.drawRect(x,y,l,l);
	}
	public static void arrage(Graphics g, int x, int y, int d, int s, int l) // This method is to arrage the circle with different rows and cols.
	{
		drawSqt(g,x,y,l*d);
		for(int i=0; i<l; i++)
		{
			for(int j=0,X=x; j<l; j++) // Here I create new variable X because I have to initialize x value every single row.
			{
				drawCir(g,X,y,d,s);
				X+=d;
			}
			y+=d;
		}
	}
}