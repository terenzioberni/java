package com.tnz.goodcodeintro.v3.model.impl;

public class SquareImpl extends RectangleImpl {
	
	//private int side;

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeigth(width);
	}


	@Override
	public void setHeigth(int height) {
		super.setWidth(height);
		super.setHeigth(height);
	}

}
