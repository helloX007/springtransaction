# springtransaction
学习spring事务配置Demo

项目功能描述：
	购票过程：account表中扣除金额balance,stock表中票数修改
	场景：买票过程中，出现了异常，用户金额扣除了，但是票数没有更新，这个时候需要事务回滚成购票前的状态。
	项目测试类在src/test/java/com.transaction.test.MyTest

相关sql为mytestdb.sql文件

本项目相关的博客：https://blog.csdn.net/charberming/article/details/78575756