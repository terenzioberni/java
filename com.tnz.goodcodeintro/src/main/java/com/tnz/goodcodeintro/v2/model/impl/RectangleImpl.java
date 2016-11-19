package com.tnz.goodcodeintro.v2.model.impl;

import com.tnz.goodcodeintro.v2.model.Rectangle;

public class RectangleImpl implements Rectangle {

	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}


	public void setHeigth(int height) {
		this.height = height;
	}


	public int getArea() {
		return width * height;
	}

}
