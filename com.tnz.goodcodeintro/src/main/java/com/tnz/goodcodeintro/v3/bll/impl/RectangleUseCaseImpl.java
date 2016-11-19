package com.tnz.goodcodeintro.v3.bll.impl;

import com.tnz.goodcodeintro.v3.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v3.model.Rectangle;
import com.tnz.goodcodeintro.v3.model.impl.SquareImpl;

public class RectangleUseCaseImpl implements RectangleUseCase {

	public int getArea(int width, int height) {

		Rectangle r = new SquareImpl();

		r.setWidth(width);
		r.setHeigth(height);

		return r.getArea();
	}
}
