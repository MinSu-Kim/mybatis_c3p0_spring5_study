package mybatis_c3p0_spring5_study;

import java.sql.SQLException;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mybatis_c3p0_spring5_study.dao.EmployeeDao;
import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.dto.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/root-context.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeDaoTest extends AbstractTest{
	
	@Inject
	private EmployeeDao dao;
	
	@Test
	public void test1InsertEmployee() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1004, "이유영", "과장", new Employee(4377), 4100000, new Department(1));
		int res = dao.insertEmployee(employee);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test2DeleteEmployee() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Employee employee = new Employee(1004);
		int res = dao.deleteEmployee(employee);
		Assert.assertEquals(1, res);
	}
}
