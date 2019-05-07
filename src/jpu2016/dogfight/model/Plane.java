package jpu2016.dogfight.model;

public class Plane extends Mobile {
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30;
	private int player;
	
	public Plane() {
		int player;
		Direction direction;
		Position position;
		String image;
	}
	
	public boolean isPlayer(int player) {
		return false;
		
	}
	public boolean hit() {
		return false;
		
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub

	}

}
