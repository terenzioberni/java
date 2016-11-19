package com.tnz.unittests;

import org.junit.Assert;
import org.junit.Test;

import com.tnz.unittests.Multiplier;

public class MultiplierTests {

	@Test
	public void testZeros() {
		Multiplier m = new Multiplier();

		double result = m.times(0, 0);

		Assert.assertEquals(0, result, 0);
	}

	@Test
	public void testInt() {
		Multiplier m = new Multiplier();

		double result = m.times(7, 5);

		Assert.assertEquals(35, result, 0);
	}

	@Test
	public void testDouble() {
		Multiplier m = new Multiplier();

		double result = m.times(0.1, 10);

		Assert.assertEquals(1, result, 0.0001);
	}

	@Test
	public void testMax() {
		Multiplier m = new Multiplier();

		double result = m.times(Double.MAX_VALUE, Integer.MAX_VALUE);

		Assert.assertEquals(Double.POSITIVE_INFINITY, result, 0);

	}
}
