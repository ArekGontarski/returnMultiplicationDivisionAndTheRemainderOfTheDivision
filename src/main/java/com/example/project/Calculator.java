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

public class Calculator {

	public Number[] returnMultiplicationDivisionAndTheRemainderOfTheDivision(Double number1, Double number2) {
		Number[] mathOperation = new Number[3];
		mathOperation[0] = number1 * number2;
		mathOperation[1] = number1 / number2;
		mathOperation[2] = number1 % number2;
		return mathOperation;
	}

}
