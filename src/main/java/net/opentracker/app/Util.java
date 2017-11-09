package net.opentracker.app;

import net.opentracker.app.Key.Code;

public class Util {
	
	private Util() {
		
	}
	
	/*
    public static final double WIDTH = 221;
    public static final double HEIGHT = 249;
    public static final String TITLE = "Calculator";
    */

	public static final Code[][] KEY_CODES = new Code[][] {
        {Code.M_PLUS, Code.M_MINUS, Code.M, Code.DIVIDE},
        {Code.DIGIT_7, Code.DIGIT_8, Code.DIGIT_9, Code.MULTIPLY},
        {Code.DIGIT_4, Code.DIGIT_5, Code.DIGIT_6, Code.ADD},
        {Code.DIGIT_1, Code.DIGIT_2, Code.DIGIT_3, Code.SUBTRACT},
        {Code.DIGIT_0, Code.DECIMAL, Code.CLEAR, Code.EQUALS}

	};

}
