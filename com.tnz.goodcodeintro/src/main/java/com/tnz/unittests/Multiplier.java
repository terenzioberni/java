package com.tnz.unittests;

public class Multiplier {

	public double times(double val, int times) {
		
		double x = 0;
		
		for (int i = 0; i < times; i++) {
			x = x + val;
		}
		
		return x;
	}
	
}
