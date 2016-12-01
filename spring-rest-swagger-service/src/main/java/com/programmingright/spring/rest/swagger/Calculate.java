package com.programmingright.spring.rest.swagger;

public class Calculate {
	
	private final String operation;
	private final long result;
	
	public Calculate(String operation,long result){
		this.operation=operation;
		this.result=result;
	}

	public String getOperation() {
		return operation;
	}

	public long getResponse() {
		return result;
	}

}
