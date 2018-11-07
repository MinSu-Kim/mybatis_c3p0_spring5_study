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

import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.persistence.DepartmentDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/root-context.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentServiceTest {
	
	@Inject
	private DepartmentDao dao;
	

	@Test
	public void test1DepartmentByAll() throws SQLException {
		List<Department> list = dao.selectDepartmentByAll();
		Assert.assertNotNull(list);
	}

	@Test
	public void test2DepartmentByCode() throws SQLException {
		Department department = dao.selectDepartmentByNo(new Department(1));
		Assert.assertNotNull(department);
	}

	@Test
	public void test3InsertDepartment() throws SQLException {
		Department department = new Department(5, "개발", 10);
		int res = dao.insertDepartment(department);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test4UpdateDepartment() throws SQLException {
		Department department = new Department(5, "개발2", 20);
		int res = dao.updateDepartment(department);
		Assert.assertEquals(1, res);
	}

	@Test
	public void test5DeleteDepartment() throws SQLException {
		Department department = new Department(5);
		int res = dao.deleteDepartment(department);
		Assert.assertEquals(1, res);
	}
}
