package com.TestNg_Concepts;

import org.testng.annotations.Test;

public class Priority_Concept {

	@Test(priority = 1)
	private void bookSearch() {

		System.out.println("book search");
	}

	@Test(priority = -1)
	private void laptopSearch() {

		System.out.println("Laptop Search");
	}

	@Test
	private void earphonesSearch() {

		System.out.println("Ear phones Search");
	}

	@Test(priority = 0)
	private void mobileSearch() {

		System.out.println("Mobile Search");
	}

}
