package com.tnz.goodcodeintro.v3;

import com.tnz.goodcodeintro.v3.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v3.bll.impl.RectangleUseCaseImpl;

/**
 * example of violation of liskov substitution principle
 * 
 * @author terenzio
 * 
 */
public class LiskovViolationMain {

	public static void main(String[] args) {
		LiskovViolationMain lvm = new LiskovViolationMain();

		lvm.execute();
	}

	public void execute() {
		RectangleUseCase r = new RectangleUseCaseImpl();

		System.out.println("Area is: " + r.getArea(3, 4));
	}

}
