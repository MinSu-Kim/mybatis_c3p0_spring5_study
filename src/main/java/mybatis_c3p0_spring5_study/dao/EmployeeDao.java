package mybatis_c3p0_spring5_study.dao;

import java.util.List;

import mybatis_c3p0_spring5_study.dto.Employee;

public interface EmployeeDao {
	
	int insertEmployee(Employee employee);

	int deleteEmployee(Employee employee);

	int updateEmployee(Employee employee);

	List<Employee> selectEmployeeByAll();

	Employee selectEmployeeByNo(Employee employee);
	
	int selectNextNo();
}
