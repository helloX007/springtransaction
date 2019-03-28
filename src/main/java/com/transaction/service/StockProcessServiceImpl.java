package com.transaction.service;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.transaction.dao.IAccountDao;
import com.transaction.dao.IStockDao;
import com.transaction.myexception.StockException;

public class StockProcessServiceImpl implements IStockProcessService {

	private IAccountDao accountDao;
	private IStockDao stockDao;

	public void setAccountDao(IAccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setStockDao(IStockDao stockDao) {
		this.stockDao = stockDao;
	}

	@Override
//	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)/*使用SpringAOP注解设置事务*/
	public void openAccount(String aname, double money) {
		accountDao.insertAccount(aname, money);

	}

	@Override
//	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED)/*使用SpringAOP注解设置事务*/
	public void openStock(String sname, int amount) {
		stockDao.insertStock(sname, amount);

	}

	@Override
//	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRED, rollbackFor=StockException.class) /*使用SpringAOP注解设置事务*/
	public void buyStock(String aname, double money, String sname, int amount) throws StockException {
		boolean isBuy = true;
		accountDao.updateAccount(aname, money, isBuy);
		//故意抛出异常
		if (true) {
		    throw new StockException("购买股票异常");
		}
		stockDao.updateStock(sname, amount, isBuy);

	}

}
