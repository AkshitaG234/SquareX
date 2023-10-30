import java.awt.Graphics;
import java.awt.Color;

/*
   Akshita Gangiredla
   CS210 Fall Quarter
   
   This program draws 30 squares with faces
   as an X utilizing Graphics.
*/ 

public class SquareFaceX {
   public static void main(String[] args) {
      //creating the panel and the graphics
      DrawingPanel dee = new DrawingPanel(800, 800);
      Graphics gee = dee.getGraphics();
      //setting an x variable to be changed
      int x = 25;
      //loop to draw 15 squares and its faces
      for (int i = 0; i < 15; i++) {
         gee.setColor(Color.BLACK);
         gee.drawRect(x, x, 50, 50);
         gee.setColor(Color.BLUE);
         gee.fillOval(x+10, x+10, 10, 10);
         gee.fillOval(x+30, x+10, 10, 10);
         gee.setColor(Color.RED);
         gee.drawLine(x+15,x+35, x+35, x+35);
         x += 50;
      }
      
      //second list of variables to account for the 
      //squares going in other direction
      int x2 = 25;
      int y1 = 725;
      //loop to print out the fifteen squares
      for (int i = 0; i < 15; i++) {
         gee.setColor(Color.BLACK);
         gee.drawRect(x2, y1, 50, 50);
         gee.setColor(Color.BLUE);
         gee.fillOval(x2+10, y1+10, 10, 10);
         gee.fillOval(x2+30, y1+10, 10, 10);
         gee.setColor(Color.RED);
         gee.drawLine(x2+15, y1+35, x2+35, y1+35);
         x2 += 50;
         y1 -= 50;
      }
      
   }
}
