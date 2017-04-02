package common;

import java.awt.Color;

import javax.swing.JFrame;

import elements.MyWindow;
import elements.OneMovable;
import elements.TwoMovable;
import interfases.Movable;

public class Main {

	public static void main(String[] args) {
		
		Movable[] movables = new Movables().getMovables();
		
		JFrame frame=new JFrame("Figure");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		Controllers contr = new Controllers(movables, frame);
		
		SimpleGUI app = new SimpleGUI();
		app.setController(contr);
		app.setVisible(true);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
		
//		GUIdraw gui = new GUIdraw();
//		  
//		  frame.add(gui);
		
  
	}
	
}
