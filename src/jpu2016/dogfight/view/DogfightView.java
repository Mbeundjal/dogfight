package jpu2016.dogfight.view;

import java.lang.*;
import java.util.Observable;

import jpu2016.dogfight.controller.*;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.*;

public class DogfightView implements Runnable, IViewSystem {
	private  EventPerformer _eventPerformer;
	private  GraphicsBuilder _graphicsBuilder;
	private  GameFrame _gameFrame;
	public DogfightView() {
		IOrderPerformer orderPerformer;
		IDogfightModel dogfightModel;
		Observable observable;
		//_eventPerformer = new EventPerformer();
		_graphicsBuilder = new GraphicsBuilder();
		_gameFrame = new GameFrame();
	}

	public DogfightView(DogfightController dogfightController, DogfightModel dogfightModel,
			DogfightModel dogfightModel2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
