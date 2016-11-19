package com.tnz.unittests;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire un valore numerico");
		double val = scan.nextDouble();
		System.out.println("Inserire il numero di volte (INTERO) per cui lo si vuole moltiplicare");
		int times = scan.nextInt();
		
		Multiplier m = new Multiplier();
		
		System.out.println(m.times(val, times));
		
		scan.close();
	}

}
