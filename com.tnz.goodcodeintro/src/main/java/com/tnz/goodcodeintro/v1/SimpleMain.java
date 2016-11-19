package com.tnz.goodcodeintro.v1;

import com.tnz.goodcodeintro.v1.bll.RectangleUseCase;

/**
 * First layering example
 * @author terenzio
 *
 */
public class SimpleMain {

	public static void main(String[] args) {

		SimpleMain sm = new SimpleMain();
		
		sm.execute();
	}
	
	public void execute() {
		RectangleUseCase r = new RectangleUseCase();

		System.out.println("Area is: " + r.getArea(3,4));
	}
}
