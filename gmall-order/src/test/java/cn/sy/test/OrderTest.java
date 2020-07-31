package cn.sy.test;

import cn.sy.service.imp.OrderServiceImp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class OrderTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:consumer.xml");

        OrderServiceImp bean = context.getBean(OrderServiceImp.class);
        bean.createOrders();


        System.in.read(); //读取字符
    }
}
