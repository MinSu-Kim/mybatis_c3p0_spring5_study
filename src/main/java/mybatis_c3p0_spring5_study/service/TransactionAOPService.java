package mybatis_c3p0_spring5_study.service;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import mybatis_c3p0_spring5_study.dao.DepartmentDao;
import mybatis_c3p0_spring5_study.dao.EmployeeDao;
import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.dto.Employee;

@Service
public class TransactionAOPService {
	@Inject
	private DepartmentDao deptDao;
	
	@Inject
	private EmployeeDao empDao;
	
	public int trRegister(Department department, Employee employee) throws SQLException {
		int res = deptDao.insertDepartment(department);
		res += empDao.insertEmployee(employee);
		if (res !=2 ) throw new RuntimeException();
		return res;
	}


	public int trUnRegister(Department department, Employee employee) throws SQLException {
		int res = empDao.deleteEmployee(employee);
		res += deptDao.deleteDepartment(department);
		if (res !=2 ) throw new RuntimeException();
		return res;
	}
}
