package com.tnz.goodcodeintro.v5;

import com.tnz.goodcodeintro.v4.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v4.bll.RectangleUseCaseException;
import com.tnz.goodcodeintro.v5.bll.impl.RectangleUseCaseImpl;

/**
 * slightly better example of exception management
 * 
 * @author terenzio
 * 
 */
public class ExceptionMain {

	//global exception management
	/**
	 * note the absence of throw because the exception is managed
	 * @param args
	 */
	public static void main(String[] args) {
		ExceptionMain lvm = new ExceptionMain();

		try {
			lvm.execute();
		} catch (RectangleUseCaseException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	/**
	 * note the throws declaration
	 * @throws RectangleUseCaseException if something went wrong in the use case
	 */
	public void execute() throws RectangleUseCaseException {
		RectangleUseCase r = new RectangleUseCaseImpl();

		//System.out.println("Area is: " + r.getArea(3, 4));
		
		System.out.println("Area is: " + r.getArea(0,4));
	}

}
