package mybatis_c3p0_spring5_study.service;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mybatis_c3p0_spring5_study.dao.DepartmentDao;
import mybatis_c3p0_spring5_study.dao.EmployeeDao;
import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.dto.Employee;

@Service
public class TransactionService {
	
	@Inject
	private DepartmentDao deptDao;
	
	@Inject
	private EmployeeDao empDao;
	
	@Transactional
	public int registerTransaction(Department department, Employee employee) throws SQLException {
		int res = deptDao.insertDepartment(department);
		res += empDao.insertEmployee(employee);
		return res;
	}

	@Transactional
	public int unRegisterTransaction(Department department, Employee employee) throws SQLException {
		int res = empDao.deleteEmployee(employee);
		res += deptDao.deleteDepartment(department);
		return res;
	}
}
