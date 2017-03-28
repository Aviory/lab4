package elements;

import interfases.Movable;

public class MyWindow implements Movable{
	private int x;
	private int y;

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public void moveTo(int x, int y) {
		System.out.println("change coordinates");
		this.x = x;
		this.y = y;
	}

}
