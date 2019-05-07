package jpu2016.gameframe;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {
	private List<IGraphicsBuilder> _graphicsBuilder = new ArrayList<IGraphicsBuilder>();
	public GamePanel() {
		IGraphicsBuilder graphicBuilder;
	}
	public void update(Observable observable) {
		
	}
	public void paintComponent(Graphics graphic) {
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub

	}

}
