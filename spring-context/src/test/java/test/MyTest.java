package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import lookup.GetBeanTest;

import java.net.URL;

/**
 * @author linShengJie
 * @date 2021/2/9 12:09
 */
public class MyTest {


	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("test/lookup/lookupTest.xml");
		GetBeanTest test = (GetBeanTest) bf.getBean("getBeanTest");
		test.showMe();
	}
}
