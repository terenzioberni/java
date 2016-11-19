package com.tnz.goodcodeintro.v5.bll.impl;

import com.tnz.goodcodeintro.v4.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v4.bll.RectangleUseCaseException;
import com.tnz.goodcodeintro.v4.model.Rectangle;
import com.tnz.goodcodeintro.v4.model.impl.SquareImpl;

public class RectangleUseCaseImpl implements RectangleUseCase {

	/**
	 * @throws RectangleException when area mismatch
	 * @throws IllegalArgumentExceiton if input is < 0
	 */
	public int getArea(int width, int height) throws RectangleUseCaseException{

		//argument check
		if (height <= 0 || width <= 0) {
			throw new IllegalArgumentException("Width and Height should be greater than 0");
		};
		
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
