package com.tnz.goodcodeintro.v6.bll;

/**
 * note that this time RuntimeExcepiton is extended
 * alternative pattern to the new excpetion (factory)
 * @author terenzio
 *
 */
public class RectangleUseCaseException extends RuntimeException {

	private RectangleUseCaseException(int width, int height, int area) {
		super("W: " + width + " H: " + height + " but area is " + area);
	}
	
	public static RectangleUseCaseException AreaEvaluationMismatch(int width, int height, int area) {
		return new RectangleUseCaseException(width, height, area);
	}
}
