# lcn-demo
SpringBoot2.1 + SpringCloud + Mybatis + LCN5.0.2 分布式解决方案demo

使用SpringBoot、Mybatis框架，以consul为注册中心，实现分布式事务管理；具体实现流程请看博客
https://blog.csdn.net/qq_38286002/article/details/102657429

1.新建两个数据库: bank-a 和 bank-b;
2.各个数据库分别新建一张表 t_bank，建表语句如下：

CREATE TABLE `t_bank` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `user` varchar(255) DEFAULT NULL,
  `money` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

3.项目中把mysql数据库连接换成自己的。
4.测试


