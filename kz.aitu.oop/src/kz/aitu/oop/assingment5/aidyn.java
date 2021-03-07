package kz.aitu.oop.assingment5;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class aidyn {

	public static void main(String[] args) {
		Pandora <Integer, String> box = new Pandora<>(123, "Arthur");
		//Pandora <Double, Float> box2 = new Pandora<>();
		box.add(1, "value1");
		box.add(2, "value2");
		box.add(3, "value3");
		box.printDescription();
		box.getSum();
		Integer[] f= {1, 2 ,3};
		Pandora.arithMean(f);
		Friday test;
		test = (b) -> {
			if (b%13==0)
			return true;
			else
			return false;
		};
		int b=26;
		System.out.println(test.isDivisible(b) + " for " + b);
		test = (c) -> {
			if (c%2==0)
			return true;
			else
			return false;
		};
		b = 39;
		System.out.println(test.isDivisible(b) + " for " + b);

	}

}
