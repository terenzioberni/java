package com.tnz.goodcodeintro.v1.model;

public class Rectangle {

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
