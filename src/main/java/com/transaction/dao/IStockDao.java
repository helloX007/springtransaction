package com.transaction.dao;

public interface IStockDao {
	void insertStock(String sname, int amount);
	
	void updateStock(String sname, int amount, boolean isBuy);
}
