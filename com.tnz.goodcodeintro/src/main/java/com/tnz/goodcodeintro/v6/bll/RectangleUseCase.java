package com.tnz.goodcodeintro.v6.bll;

//note the import is now clean
import java.io.Serializable;

public interface RectangleUseCase extends Serializable {

	//no need to throw any exception anymore
	 int getArea(int width, int height);
}
