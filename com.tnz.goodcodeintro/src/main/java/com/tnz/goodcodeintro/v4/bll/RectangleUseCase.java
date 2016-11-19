package com.tnz.goodcodeintro.v4.bll;

import java.io.Serializable;

public interface RectangleUseCase extends Serializable {

	 int getArea(int width, int height) throws RectangleUseCaseException;
}
