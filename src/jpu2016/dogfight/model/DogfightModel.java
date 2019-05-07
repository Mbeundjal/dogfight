package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel {
	private final Sky _sky;
	private List<IMobile> _mobiles = new ArrayList<IMobile>();
	public DogfightModel() {
		_sky = new Sky();
	}

	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMobile(IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeMobile(IMobile Mobile) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<IMobile> getMobile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub

	}

}
