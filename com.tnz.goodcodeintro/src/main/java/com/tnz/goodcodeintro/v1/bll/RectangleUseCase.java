package com.tnz.goodcodeintro.v1.bll;

import com.tnz.goodcodeintro.v1.model.Rectangle;

public class RectangleUseCase {

	public int getArea(int width, int height) {

		Rectangle r = new Rectangle();

		r.setHeigth(height);
		r.setWidth(width);

		return r.getArea();
	}
}
