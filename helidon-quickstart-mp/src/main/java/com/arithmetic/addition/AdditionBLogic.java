package com.arithmetic.addition;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AdditionBLogic {
	public int execute(int a, int b, int c) {
		System.out.println(" AdditionBLogic.execute(" + a + "," + b + ","+c+")");
		return a + b + c;
	}
}
