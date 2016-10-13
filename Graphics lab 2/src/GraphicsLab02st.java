// GraphicsLab02st.java
// This is the student, starting version of the GraphicsLab02 assignment.


import java.awt.*;
import java.applet.*;


public class GraphicsLab02st extends Applet
{
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);	
		
		for (x1 = 10; x1 < 990; x1 += 14)
		{
			y2 -= 9;
			
		    
			
				
			
		g.drawLine(x1, y1, x2, y2);
		}
		
		
			x1 = 990;
			y1 = 640;
			x2 =10;
			y2 = 640;
				
		
			
			
			for (x1 = 990; x1 > 10; x1 -= 14){
			
				y2 -= 9;

			g.drawLine(x2, y2, x1, y1);
			}
				
		}	
	}






