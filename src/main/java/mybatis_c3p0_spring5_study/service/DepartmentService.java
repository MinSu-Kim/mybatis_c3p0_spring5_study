package mybatis_c3p0_spring5_study.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import mybatis_c3p0_spring5_study.dao.DepartmentDao;
import mybatis_c3p0_spring5_study.dto.Department;

@Service
public class DepartmentService {
	
	@Inject
	private DepartmentDao dao;

	public void register(Department department) {
		dao.insertDepartment(department);
	}

	public Department read(Department department){
		return dao.selectDepartmentByNo(department);
	}

	public void modifiy(Department department)  {
		dao.updateDepartment(department);
	}

	public void remove(Department department)  {
		dao.deleteDepartment(department);
	}

	public List<Department> listAll()  {
		return dao.selectDepartmentByAll();
	}
	
	public int nextDeptNo() {
		return dao.selectNextNo();
	}
}
