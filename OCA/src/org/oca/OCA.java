package org.oca;

import org.oca.chapter1.Animal;
import org.oca.chapter1.Constructor;
import org.oca.chapter1.ImportExample;
import org.oca.chapter1.RedundantImports;

public class OCA {
	public static void main(String[] args) {
		chapter1();

	}

	private static void chapter1() {
		// Chapter 1. Classes vs. Files
		/*Animal dog = new Animal();
		dog.setName("Bakuncho");
		System.out.println(dog.getName());*/

		// Chapter 1. Understanding package declaration
		/*ImportExample importExample = new ImportExample();
		importExample.printNumber();*/
		
		
		// Chapter 1. Redundant imports
		//RedundantImports redundant = new RedundantImports();
		//redundant.printNumber();
		//redundant.dateValues();
		
		Constructor constructor = new Constructor();
		
	}
}
