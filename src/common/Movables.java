package common;

import elements.MyWindow;
import elements.OneMovable;
import interfases.Movable;

public class Movables {
	private Movable[] movables;
	public Movables(){
		init();
	}
	
	public Movable[] getMovables() {
		return movables;
	}

	void init(){
		movables = new Movable[3];
		movables[0] = new OneMovable();
		movables[0].moveTo(55, 22);
		movables[1] = null;
		movables[2] = new MyWindow();
		movables[2].moveTo(77, 33);
	}
}
