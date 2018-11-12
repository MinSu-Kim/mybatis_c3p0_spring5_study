package mybatis_c3p0_spring5_study.dao;

import java.sql.SQLException;
import java.util.List;

import mybatis_c3p0_spring5_study.dto.Department;

public interface DepartmentDao {
	int deleteDepartment(Department department) throws SQLException;

	int insertDepartment(Department department) throws SQLException;

	int updateDepartment(Department department) throws SQLException;

	List<Department> selectDepartmentByAll() throws SQLException;

	Department selectDepartmentByNo(Department department) throws SQLException;
}
