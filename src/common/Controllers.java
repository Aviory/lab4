package common;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.GrayFilter;
import javax.swing.JFrame;

import elements.MyWindow;
import elements.OneMovable;
import interfases.Movable;

public class Controllers {
	private Movable[] movables;
	private JFrame jFrame;
	private ArrayList<GUIdraw> guidraws;
	GUIdraw gui;
	
	public Controllers(Movable[] movables, JFrame jFrame){
		this.movables = movables;
		this.jFrame = jFrame;
	}
	
	 void show(){
		 GUIdraw gui = new GUIdraw();
		 jFrame.add(gui);
	}
	 void swapXY1ToArray(){
		if(guidraws!=null)
		for (GUIdraw v : guidraws) {
			 jFrame.remove(v);
		}
		guidraws = new ArrayList<GUIdraw>();
		for(int i=0; i<movables.length;i++){
			try{
			swapXY_1(movables[i]);
			gui = new GUIdraw();
			gui.setX(movables[i].getX());
			gui.setY(movables[i].getY());
			guidraws.add(gui);
			jFrame.add(gui);
			jFrame.setVisible(true);
			}catch(NullPointerException e){
				System.out.println(e);
			}
		}
	}
	 void swapXY2ToArray(){
		 if(guidraws!=null)
				for (GUIdraw v : guidraws) {
					 jFrame.remove(v);
				}
				guidraws = new ArrayList<GUIdraw>();
		for(int i=0; i<movables.length;i++){
			try{
				swapXY_2(movables[i]);
				gui = new GUIdraw();
				gui.setX(movables[i].getX());
				gui.setY(movables[i].getY());
				guidraws.add(gui);
				jFrame.add(gui);
				jFrame.setVisible(true);
			}catch(NullPointerException e){
				System.out.println(e);
			}
			
		}
	}
	 void mult2XYToArray(){
		 if(guidraws!=null)
				for (GUIdraw v : guidraws) {
					 jFrame.remove(v);
				}
				guidraws = new ArrayList<GUIdraw>();
		for(int i=0; i<movables.length;i++){
			try {
				mult2XY(movables[i]);
				gui = new GUIdraw();
				gui.setX(movables[i].getX());
				gui.setY(movables[i].getY());
				guidraws.add(gui);
				jFrame.add(gui);
				jFrame.setVisible(true);
			} catch (IllegalAccessException e) {
				System.out.println(e);
			}
		}
	}

	 void swapXY_1(Movable object)throws NullPointerException{
		if(object==null){
			throw new NullPointerException();
		}
		else{
			System.out.println("before: x="+object.getX()+" y="+object.getY());
			object.moveTo(object.getY(), object.getX());
			System.out.println("after: x="+object.getX()+" y="+object.getY());
		}
	}
	 void swapXY_2(Movable object){
		if(object==null){
			throw new NullPointerException();
		}
		else{
			System.out.println("before: x="+object.getX()+" y="+object.getY());
			object.moveTo(object.getY(), object.getX());
			System.out.println("after: x="+object.getX()+" y="+object.getY());
		}
	}
	 void mult2XY (Movable object) throws IllegalAccessException {
		if(object==null){
			throw new IllegalAccessException();
		}
		else{
			System.out.println("before: x="+object.getX()+" y="+object.getY());
			object.moveTo(object.getX()*2, object.getY()*2);
			System.out.println("after: x="+object.getX()+" y="+object.getY());
		}
	}

}
