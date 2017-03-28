package common;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
	private JButton button;
	private JButton button2;
	private JButton button3;
	private JButton button4;

	
	public SimpleGUI() {
	    super("Lab 4");	  
	    setBounds(100,100,450,250);//координаты и размеры(x,y,w,h)
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//выход при нажатии крестика
	    setLayout(new FlowLayout());//слой на который кладем кнопки
	    
	    button =  new JButton("swapXY_1_toArray");
	    button.addActionListener(new ButtonEventListener());
	    add(button);
	    
	    button2 =  new JButton("Show");
	    button2.addActionListener(new ButtonEventListener());
	    add(button2);
	    
	    button3 =  new JButton("mult2XYToArray");
	    button3.addActionListener(new ButtonEventListener());
	    add(button3);
	    
	    button4 =  new JButton("swapXY2ToArray");
	    button4.addActionListener(new ButtonEventListener());
	    add(button4);
	}
	
	class ButtonEventListener implements ActionListener {//внутренний класс реализующий интерфейс слушателя нажатий кнопок

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ActionEvent e =arg0;
			if (e.getSource()==button){
				Main.swapXY1ToArray();
			}
			if (e.getSource()==button2){
				Main.show();
			}
			if (e.getSource()==button3){
				Main.mult2XYToArray();
			}
			if (e.getSource()==button4){
				Main.swapXY2ToArray();
			}
		}
	}
}