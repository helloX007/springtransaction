package com.transaction.myexception;

public class StockException extends Exception {

	private static final long serialVersionUID = 2797558584772783065L;

	public StockException() {
		super();
	}
	
	public StockException(String message) {
		super(message);
	}
	
}
