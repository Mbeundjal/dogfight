package jpu2016.dogfight.model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class Sky implements IArea {
	private List<Dimension> _dimension = new ArrayList<Dimension>();
	private final Image _image;
	public Sky() {
		Dimension dimension;
		_image = new Image();
	}
	 public void paintComponent(Graphics g){
		    try {
		      BufferedImage _image = ImageIO.read(new File("C:/Users/MBEUNDJAL/git/dogfight/image/sky"));
		      g.drawImage(_image, 0, 0, (ImageObserver) this);
		      //Pour une image de fond
		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		    } catch (IOException e) {
		      e.printStackTrace();
		    }                
		  }     
	public Dimension getDimension() {
		return getDimension();
		
	}
	public Image getImage() {
		return _image;
		
	}

}
