package com.transaction.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.transaction.dao.IStockDao;

public class StockDaoImpl extends JdbcDaoSupport implements IStockDao {

	@Override
	public void insertStock(String sname, int amount) {
		String sql = "insert into stock(sname, count) values (?,?)";
		this.getJdbcTemplate().update(sql , sname, amount);

	}

	@Override
	public void updateStock(String sname, int amount, boolean isBuy) {
		//isBuy为true,则表示购买股票,此时应增加股票账户中的股票数量
		String sql = "update stock set count=count-? where sname=?";
		if (isBuy) {
		    sql = "update stock set count=count+? where sname=?";
		}
		this.getJdbcTemplate().update(sql, amount, sname);

	}

}
