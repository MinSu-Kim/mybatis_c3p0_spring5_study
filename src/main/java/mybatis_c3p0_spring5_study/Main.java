package mybatis_c3p0_spring5_study;

import java.sql.SQLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");){}
	}
	
}
