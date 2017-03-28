package common;

import elements.MyWindow;
import elements.OneMovable;
import elements.TwoMovable;
import interfases.Movable;

public class Main {
	private static Movable[] movables;

	public static void main(String[] args) {
		SimpleGUI app = new SimpleGUI();
		app.setVisible(true);
		
		movables = new Movable[3];
		movables[0] = new OneMovable();
		movables[0].moveTo(55, 22);
		movables[1] = null;
		movables[2] = new MyWindow();
		movables[2].moveTo(77, 33);

	}
	static void show(){
		for(int i=0; i<movables.length;i++){
			try{
				System.out.println("x: "+movables[i].getX()+" y: "+movables[i].getY());
			}catch(NullPointerException e){
				System.out.println(e);
			}
		}
	}
	static void swapXY1ToArray(){
		
		for(int i=0; i<movables.length;i++){
			try{
			swapXY_1(movables[i]);
			}catch(NullPointerException e){
				System.out.println(e);
			}
		}
	}
	static void swapXY2ToArray(){
		for(int i=0; i<movables.length;i++){
			try{
				swapXY_2(movables[i]);
			}catch(NullPointerException e){
				System.out.println(e);
			}
			
		}
	}
	static void mult2XYToArray(){
		for(int i=0; i<movables.length;i++){
			try {
				mult2XY(movables[i]);
			} catch (IllegalAccessException e) {
				System.out.println(e);
			}
		}
	}

	static void swapXY_1(Movable object)throws NullPointerException{
		if(object==null){
			throw new NullPointerException();
		}
		else{
			System.out.println("before: x="+object.getX()+" y="+object.getY());
			object.moveTo(object.getY(), object.getX());
			System.out.println("after: x="+object.getX()+" y="+object.getY());
		}
	}
	static void swapXY_2(Movable object){
		if(object==null){
			throw new NullPointerException();
		}
		else{
			System.out.println("before: x="+object.getX()+" y="+object.getY());
			object.moveTo(object.getY(), object.getX());
			System.out.println("after: x="+object.getX()+" y="+object.getY());
		}
	}
	static void mult2XY (Movable object) throws IllegalAccessException{
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
