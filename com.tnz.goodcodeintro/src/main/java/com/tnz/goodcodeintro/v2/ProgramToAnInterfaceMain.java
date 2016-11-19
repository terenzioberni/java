package com.tnz.goodcodeintro.v2;

//note the import
import com.tnz.goodcodeintro.v2.bll.RectangleUseCase;
import com.tnz.goodcodeintro.v2.bll.impl.RectangleUseCaseImpl;

/**
 * example of program to an interface and serialaziable
 * things to point out
 * the imports
 * the serializable
 * 
 * @author terenzio
 * 
 */
public class ProgramToAnInterfaceMain {

	public static void main(String[] args) {

		ProgramToAnInterfaceMain ptaim = new ProgramToAnInterfaceMain();

		ptaim.execute();
	}

	public void execute() {
		RectangleUseCase r = new RectangleUseCaseImpl();

		System.out.println("Area is: " + r.getArea(3, 4));
	}
}
