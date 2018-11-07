package mybatis_c3p0_spring5_study.persistence;

import java.sql.SQLException;
import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import mybatis_c3p0_spring5_study.dto.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	private String namespace = "mybatis_c3p0_spring5_study.mappers.DepartmentMapper";
	
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<Department> selectDepartmentByAll() {
		return sqlSession.selectList(namespace + ".selectDepartmentByAll");
	}
	
	@Override
	public int deleteDepartment(Department department) throws SQLException {
		return sqlSession.delete(namespace + ".deleteDepartment", department);
	}

	@Override
	public int insertDepartment(Department department) throws SQLException {
		return sqlSession.insert(namespace+".insertDepartment", department);
	}

	@Override
	public int updateDepartment(Department department) throws SQLException {
		return sqlSession.update(namespace + ".updateDepartment", department);
	}

	@Override
	public Department selectDepartmentByNo(Department department) throws SQLException {
		return sqlSession.selectOne(namespace + ".selectDepartmentByNo", department);
	}

}
