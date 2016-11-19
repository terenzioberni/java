package com.tnz.goodcodeintro.v6.bll.impl;

import static com.tnz.goodcodeintro.v6.bll.RectangleUseCaseException.AreaEvaluationMismatch;

import com.tnz.goodcodeintro.v4.model.Rectangle;
import com.tnz.goodcodeintro.v4.model.impl.SquareImpl;
import com.tnz.goodcodeintro.v6.bll.RectangleUseCase;

public class RectangleUseCaseImpl implements RectangleUseCase {

	public int getArea(int width, int height) {

		//argument check
		if (height <= 0 || width <= 0) {
			throw new IllegalArgumentException("Width and Height should be greater than 0");
		};
		
		Rectangle r = new SquareImpl();

		r.setHeigth(height);
		r.setWidth(width);

		int area = r.getArea();

		if (area != height * width) {
			throw AreaEvaluationMismatch(width, height, area);
		}

		return area;
	}
}
