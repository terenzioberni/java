package com.tnz.goodcodeintro.v4.model.impl;

import com.tnz.goodcodeintro.v4.model.Rectangle;

public class SquareImpl implements Rectangle {
	
	private int side;

	public int getWidth() {
		return side;
	}

	public void setWidth(int width) {
		this.side = width;
	}

	public int getHeight() {
		return side;
	}

	public void setHeigth(int height) {
		this.side = height;
	}

	public int getArea() {
		return side * side;
	}
}
