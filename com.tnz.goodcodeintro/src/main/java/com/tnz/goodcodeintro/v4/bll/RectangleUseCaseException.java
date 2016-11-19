package com.tnz.goodcodeintro.v4.bll;

public class RectangleUseCaseException extends Exception {

	public RectangleUseCaseException(int width, int height, int area) {
		super("W: " + width + " H: " + height + " but area is " + area);
	}
}
