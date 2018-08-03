package in.com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.com.factory.Messagefactory;
import in.com.renderer.MessageRender;

public class test {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	MessageRender renderer= (MessageRender) context.getBean("render");
	
	renderer.render();
	}
}
