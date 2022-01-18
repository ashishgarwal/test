package com.learning.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class WeekDaysHelperTest {

	WeekDaysHelper helloWold = new WeekDaysHelper();

	@Test
	public void getDayWithIdNullTest() {

		assertThrows(IllegalArgumentException.class, () -> {
			helloWold.getDay(null);
		});
	}

	@Test
	public void getDayWithInvalIdTest() {

		assertThrows(RuntimeException.class, () -> {
			helloWold.getDay(9);
		});
	}

	@Test
	public void getDayTest() {

		assertEquals("Tuesday", helloWold.getDay(3));
	}

}
