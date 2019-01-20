package mybatis_c3p0_spring5_study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
	
	public void launch() {
		System.out.println("launch()-start");
//		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml")){}
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		System.out.println("launch()-end");
	}
	
}
