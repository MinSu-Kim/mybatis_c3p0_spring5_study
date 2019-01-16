package mybatis_c3p0_spring5_study;

import java.sql.SQLException;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.dto.Employee;
import mybatis_c3p0_spring5_study.service.TransactionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/root-context.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TransactionServiceTest extends AbstractTest{
	
	@Inject
	private TransactionService service;
	
	@Test(expected=DuplicateKeyException.class)
	public void test1registerTransaction_Dept_Fail() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(1, "태스크포스", 10);
		Employee employee = new Employee(1004, "박신혜", "과장", new Employee(4377), 4100000, department);
		
		int res = service.registerTransaction(department, employee);
		Assert.assertEquals(1, res);
	}
	
	@Test(expected=DuplicateKeyException.class)
	public void test2registerTransaction_Emp_Fail() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(6, "태스크포스", 10);
		Employee employee = new Employee(4377, "박신혜", "과장", new Employee(4377), 4100000, department);
		
		int res = service.registerTransaction(department, employee);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test3registerTransaction_Success() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(6, "태스크포스", 10);
		Employee employee = new Employee(1005, "박신혜", "과장", new Employee(4377), 4100000, department);
		
		int res = service.registerTransaction(department, employee);
		Assert.assertEquals(2, res);
	}
	
	@Test
	public void test4UnregisterTransaction_Success() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(6, "태스크포스", 10);
		Employee employee = new Employee(1005, "박신혜", "과장", new Employee(4377), 4100000, department);
		
		int res = service.unRegisterTransaction(department, employee);
		Assert.assertEquals(2, res);
	}
}