package mybatis_c3p0_spring5_study;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.service.DepartmentService;

public class Main {
	
	public static void main(String[] args) throws SQLException {
		try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");){
			DepartmentService service = context.getBean("departmentService", DepartmentService.class);
			List<Department> lists = service.listAll();
			for(Department d : lists) {
				System.out.println(d);
			}
		}
	}
	
}
