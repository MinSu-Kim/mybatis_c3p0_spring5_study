package mybatis_c3p0_spring5_study.dao;

import java.sql.SQLException;

import mybatis_c3p0_spring5_study.dto.Employee;

public interface EmployeeDao {
	
	int insertEmployee(Employee employee) throws SQLException;

	int deleteEmployee(Employee employee) throws SQLException;

/*	int updateEmployee(Employee employee) throws SQLException;

	List<Employee> selectEmployeeByAll() throws SQLException;

	Employee selectEmployeeByNo(Employee employee) throws SQLException;
	
	int transactionInsertEmployeeAndDepartmentApi(Employee emp, Department dept);
	
	int transactionInsertEmployeeAndDepartment(Employee emp, Department dept);*/
}
