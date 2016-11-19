package com.tnz.boxing.std;

import com.tnz.boxing.Multiplier;

public class BoxedMultiplierImpl implements Multiplier {

	private Multiplier multiplier;

	public BoxedMultiplierImpl() {
		multiplier = new MultiplierImpl();
	}

	public double times(double value, int times) {

		double result = 0;

		// Before
		before(value, times);

		try {
			// invoke
			result = multiplier.times(value, times);
		} catch (RuntimeException t) {
			// on Eception
			afterThrowing(value, times, t);
		}

		// After returning
		return afterReturning(value, times, result);
	}

	private void before(double value, int times) {
		System.out.println("Before invocation");
	}

	private double afterReturning(double value, int times, double result) {
		System.out.println("After invocation");
		return result;
	}

	private double afterThrowing(double value, int times, RuntimeException t) {
		System.out.println("On Exception");
		throw t;
	}
}
