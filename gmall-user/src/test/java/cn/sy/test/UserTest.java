package cn.sy.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class UserTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:provider.xml");
        context.start();
        System.in.read(); //读取字符
    }

}
