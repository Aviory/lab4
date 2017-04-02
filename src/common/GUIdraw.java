package common;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class GUIdraw extends JComponent  {
 private int x;
 private int y;
 public void setX(int x){
  this.x=x;
 }
 public void setY(int y){
  this.y=y;
 }
 private Graphics g2;
 public void paint(Graphics g){
	 super.paintComponents(g);	
	 g2 = g;
	  
	 g.setColor(Color.GREEN);
	 g.fillOval(x, y, 30, 30);
	 super.repaint();
 }
 public void white(Graphics g){
	 super.paintComponents(g);	
	 g.setColor(Color.WHITE);
	 g.fillRect(0, 0, 300, 300);
	 super.repaint();
 }
 
}