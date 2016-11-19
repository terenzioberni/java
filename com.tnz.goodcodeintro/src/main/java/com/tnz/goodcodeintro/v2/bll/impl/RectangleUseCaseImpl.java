package com.tnz.goodcodeintro.v2.bll.impl;

import com.tnz.goodcodeintro.v2.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v2.model.Rectangle;

public class RectangleUseCaseImpl implements RectangleUseCase {

	private Rectangle r;
	
	public void setRectangle(Rectangle r) {
		this.r = r;
	}
	
	public Rectangle getRectanglectangle() {
		return r;
	}
	
	public int getArea(int width, int height) {

		//Rectangle r = null; //new RectangleImpl();

		r.setHeigth(height);
		r.setWidth(width);

		return r.getArea();
	}
}
