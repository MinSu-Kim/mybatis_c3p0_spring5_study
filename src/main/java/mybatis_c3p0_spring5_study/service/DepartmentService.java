package mybatis_c3p0_spring5_study.service;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import mybatis_c3p0_spring5_study.dao.DepartmentDao;
import mybatis_c3p0_spring5_study.dto.Department;

@Service
public class DepartmentService {
	
	@Inject
	private DepartmentDao dao;

	public void register(Department department) throws SQLException {
		dao.insertDepartment(department);
	}

	public Department read(Department department) throws SQLException {
		return dao.selectDepartmentByNo(department);
	}

	public void modifiy(Department department) throws SQLException {
		dao.updateDepartment(department);
	}

	public void remove(Department department) throws SQLException {
		dao.deleteDepartment(department);
	}

	public List<Department> listAll() throws SQLException {
		System.out.println(dao);
		return dao.selectDepartmentByAll();
	}
}
