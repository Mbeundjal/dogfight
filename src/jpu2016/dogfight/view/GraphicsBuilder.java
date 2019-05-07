package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.RenderingHints;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.util.ArrayList;

import jpu2016.dogfight.model.Dimension;
import jpu2016.dogfight.model.IArea;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

import jpu2016.dogfight.model.*;

public class GraphicsBuilder implements BufferedImageOp, IDogfightModel, IGraphicsBuilder {
	
	private  BufferedImage _emptySky;
	private  IDogfightModel _dogfightModel;
	
	public GraphicsBuilder () {
		IDogfightModel dogfightModel;
		_emptySky = new BufferedImage(null, null, false, null);
		//_dogfightModel = new IDogfightModel();
	}
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	public void buildEmptySky() {
		
	}
	public void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}

	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
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

	@Override
	public BufferedImage createCompatibleDestImage(BufferedImage arg0, ColorModel arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage filter(BufferedImage arg0, BufferedImage arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle2D getBounds2D(BufferedImage arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point2D getPoint2D(Point2D arg0, Point2D arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RenderingHints getRenderingHints() {
		// TODO Auto-generated method stub
		return null;
	}

}
