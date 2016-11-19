package com.tnz.goodcodeintro.v6;

import com.tnz.goodcodeintro.v4.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v4.bll.RectangleUseCaseException;
import com.tnz.goodcodeintro.v5.bll.impl.RectangleUseCaseImpl;

/**
 * slightly better example of exception management
 * 
 * @author terenzio
 * 
 */
public class UnceckedMain {

	/**
	 * note the absence of throws in all the program because we are using unchecked exception style
	 * @param args
	 */
	public static void main(String[] args) {
		UnceckedMain lvm = new UnceckedMain();

		try {
			lvm.execute();
		} catch (RectangleUseCaseException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (Throwable t) {
			System.out.println("System Error: " + t.getMessage());
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
