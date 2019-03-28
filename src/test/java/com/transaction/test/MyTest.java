package com.transaction.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transaction.myexception.StockException;
import com.transaction.service.IStockProcessService;

public class MyTest {

	private IStockProcessService service;

	/*
	 * 普通创建
	*/
	@Before
	public void before() {
		System.out.println("before");
		// 创建容器
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		
		service = (IStockProcessService) context.getBean("stockService");
	}
	
	
	/*
	 * 使用代理工厂处理
	@Before
	public void before(){
		// 创建容器
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");	
		service = (IStockProcessService) context.getBean("stockServiceProxy");
	}
	*/
	
	/*
	 * 往数据库中初始化金额和商品数量
	 */
	@Test
	public void testOpen(){
		service.openAccount("Alex", 1000);
		service.openStock("Nubia", 100);
	}
	
	/*
	 * 测试购票事务回滚
	 */
	@Test
	public void testBuyStock() throws StockException{
		service.buyStock("Alex", 1000, "Nubia", 100);
	}
}
