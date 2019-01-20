package mybatis_c3p0_spring5_study.dao;

import java.util.List;

import mybatis_c3p0_spring5_study.dto.Department;

public interface DepartmentDao {
	int deleteDepartment(Department department);
	int insertDepartment(Department department);
	int updateDepartment(Department department);
	List<Department> selectDepartmentByAll();
	Department selectDepartmentByNo(Department department);
	
	int selectNextNo();
}
