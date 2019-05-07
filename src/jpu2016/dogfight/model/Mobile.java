package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.scene.paint.GradientUtils.Point;

import java.awt.Color;

public class Mobile implements IMobile {
	private List<Dimension> _dimension = new ArrayList<Dimension>();
	private List<Position> _position = new ArrayList<Position>();
	private List<Direction> _direction = new ArrayList<Direction>();
	private final Image _images;
	
	/*
	private Mobile() {
		_images = new Image();
	}
	
	class Image{
		private final Sky _sky;
		private Image() {
			_sky = new Sky();
		}
	}
	*/
	int speed;
	
	public Mobile() {
		Direction direction;
		Position position;
		Dimension dimension;
		int speed;
		String image;
		_images = new Image();
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
	private void moveUp() {
		
	}
	private void moveRight() {
		
	}
	private void moveDown() {
		
	}
	private void moveLeft() {
		
	}
	public Color getColor() {
		return null;
		
	}
	public IDogfightModel getDogfightModel() {
		return null;
		
	}
	public void setDogfightModel(IDogfightModel dogfightModel) {
		
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
	public java.awt.Point getPosition() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		
	}

}
