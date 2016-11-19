package com.tnz.boxing.std;

import com.tnz.boxing.Multiplier;

public class MultiplierImpl implements Multiplier {

	public double times(double val, int times) {

		double x = 0;

		for (int i = 0; i < times; i++) {
			x = x + val;
		}

		return x;
	}
}
