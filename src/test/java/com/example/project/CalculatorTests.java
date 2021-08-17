/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {

	@Test
	@DisplayName("5 * 2 = 10; 5 / 2 = 2,5; 5 % 2 = 1")
	void fiveAndTwo() {
		Calculator calculator = new Calculator();
		Number[] expectedResult = new Number[] { 10d,  2.5d, 1d };
		assertArrayEquals(expectedResult , calculator.returnMultiplicationDivisionAndTheRemainderOfTheDivision(5d, 2d), "5 * 2 = 10; 5 / 2 = 2,5; 5 % 2 = 1");
	}

}
