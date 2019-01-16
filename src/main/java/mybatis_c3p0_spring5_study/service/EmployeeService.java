package mybatis_c3p0_spring5_study.service;

import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import mybatis_c3p0_spring5_study.dao.EmployeeDao;
import mybatis_c3p0_spring5_study.dto.Employee;

@Service
public class EmployeeService {
	
	@Inject
	private EmployeeDao dao;

	public void register(Employee employee) throws SQLException {
		dao.insertEmployee(employee);
	}

	public void unregister(Employee employee) throws SQLException {
		dao.deleteEmployee(employee);
	}
	
}
