package com.tnz.goodcodeintro.v4.bll.impl;

import com.tnz.goodcodeintro.v4.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v4.bll.RectangleUseCaseException;
import com.tnz.goodcodeintro.v4.model.Rectangle;
import com.tnz.goodcodeintro.v4.model.impl.SquareImpl;

public class RectangleUseCaseImpl implements RectangleUseCase {

	public int getArea(int width, int height) throws RectangleUseCaseException {

		Rectangle r = new SquareImpl();

		r.setHeigth(height);
		r.setWidth(width);

		int area = r.getArea();
		
		if (area != height * width) {
			throw new RectangleUseCaseException(width, height, area);
		}
		
		return area;
	}
}
