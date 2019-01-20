package mybatis_c3p0_spring5_study;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mybatis_c3p0_spring5_study.dao.DepartmentDao;
import mybatis_c3p0_spring5_study.dto.Department;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/context-root.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentDaoTest extends AbstractTest{
	
	@Inject
	private DepartmentDao dao;
	
	@Test
	public void test1DepartmentByAll() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		List<Department> list = dao.selectDepartmentByAll();
		Assert.assertNotNull(list);
	}

	@Test
	public void test2DepartmentByCode() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = dao.selectDepartmentByNo(new Department(1));
		Assert.assertNotNull(department);
	}

	@Test
	public void test3InsertDepartment() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(5, "개발", 10);
		int res = dao.insertDepartment(department);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test4UpdateDepartment() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(5, "개발2", 20);
		int res = dao.updateDepartment(department);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test5DeleteDepartment() throws SQLException {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		Department department = new Department(5);
		int res = dao.deleteDepartment(department);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void test6selectNextNo() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		int res = dao.selectNextNo();
		Assert.assertNotEquals(1, res);
	}
}
