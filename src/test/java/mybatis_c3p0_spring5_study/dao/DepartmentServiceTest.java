package mybatis_c3p0_spring5_study.dao;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.persistence.DepartmentDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/root-context.xml" })
public class DepartmentServiceTest {
	
//	private static final Log log = LogFactory.getLog(MyBatisTest.class);

	@Inject
	private DepartmentDao dao;
	

	@Test
	public void testDepartmentByAll() throws SQLException {
		List<Department> list = dao.selectDepartmentByAll();
		Assert.assertNotNull(list);
	}

/*	@Test
	public void testDepartmentByCode() throws SQLException {
		Department department = service.findDepartmentByCode("D001");
		log.trace(department);
		Assert.assertNotNull(department);
	}

	@Test
	public void testRegisterDepartment() throws SQLException {
		Department department = new Department("D005", "개발", 10);
		int res = service.registerDepartment(department);
		log.trace("result : " + res);
		Assert.assertEquals(1, res);
	}

	@Test
	public void testUnRegisterDepartment() throws SQLException {
		int res = service.unRegisterDepartment("D005");
		log.trace("result : " + res);
		Assert.assertEquals(1, res);
	}

	@Test
	public void testUpdateDepartment() throws SQLException {
		Department department = new Department("D004", "영업", 15);
		int res = service.updateDepartment(department);
		log.trace("result : " + res);
		Assert.assertEquals(1, res);
	}*/
}
