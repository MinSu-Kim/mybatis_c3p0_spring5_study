package mybatis_c3p0_spring5_study.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import mybatis_c3p0_spring5_study.dao.DepartmentDao;
import mybatis_c3p0_spring5_study.dao.EmployeeDao;
import mybatis_c3p0_spring5_study.dto.Department;
import mybatis_c3p0_spring5_study.dto.Employee;

@Service
public class EmployeeService {
	
	@Inject
	private EmployeeDao empDao;
	
	@Inject
	private DepartmentDao deptDao;
	
	public void register(Employee employee) {
		empDao.insertEmployee(employee);
	}

	public void unregister(Employee employee) {
		empDao.deleteEmployee(employee);
	}
	
	public List<Department> listAll()  {
		return deptDao.selectDepartmentByAll();
	}
	
}
