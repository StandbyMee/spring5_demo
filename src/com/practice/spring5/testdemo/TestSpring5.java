package com.practice.spring5.testdemo;

import com.practice.spring5.Book;
import com.practice.spring5.Orders;
import com.practice.spring5.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testBook1() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        //User user = context.getBean("user", User.class);
        Book book = context.getBean("book",Book.class);
        System.out.println(book);
        book.test();
    }
    @Test
    public void testOrders() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        orders.ordersTest();
    }
}
