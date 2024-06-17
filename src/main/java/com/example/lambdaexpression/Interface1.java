package com.example.lambdaexpression;


public interface Interface1 extends Interface2 {

	String display(String text);
	
	default int num() {
		return 10;
	}
	
	static String name() {
		return "text";
	}
	
}
