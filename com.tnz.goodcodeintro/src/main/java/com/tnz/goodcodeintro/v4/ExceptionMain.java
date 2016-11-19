package com.tnz.goodcodeintro.v4;

import com.tnz.goodcodeintro.v4.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v4.bll.RectangleUseCaseException;
import com.tnz.goodcodeintro.v4.bll.impl.RectangleUseCaseImpl;

/**
 * example of exception management
 * 
 * @author terenzio
 * 
 */
public class ExceptionMain {

	public static void main(String[] args) throws RectangleUseCaseException {
		ExceptionMain lvm = new ExceptionMain();

		lvm.execute();
	}

	public void execute() throws RectangleUseCaseException {
		RectangleUseCase r = new RectangleUseCaseImpl();

		System.out.println("Area is: " + r.getArea(3, 4));
	}

}
