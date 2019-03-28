package com.transaction.service;

import com.transaction.myexception.StockException;

public interface IStockProcessService {
	void openAccount(String aname, double money);
	void openStock(String sname, int amount);
	void buyStock(String aname, double money, String sname, int amount) throws StockException;
}
