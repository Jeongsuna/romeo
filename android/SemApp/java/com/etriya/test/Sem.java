package com.etriya.test;

public class Sem {
	
	String src() {
		return "taint";
	}
	
	String sink(String taint) {
		return "taint";
	}	

    void oneToTwo(String one, String two) {
        
    }
	
	String oneToRet(String one) {
        return one;
    }
}
