package mybatis_c3p0_spring5_study.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import mybatis_c3p0_spring5_study.dto.Employee;

@Repository /* @Repository - DAO객체를 Spring에게 인식시키기 위한 의미*/
public class EmployeeDaoImpl implements EmployeeDao {
	private String namespace = "mybatis_c3p0_spring5_study.mappers.EmployeeMapper";
	
	@Inject /* Spring이 생성해서  주입 */
	private SqlSession sqlSession;
	
	@Override
	public int insertEmployee(Employee employee){
		return sqlSession.insert(namespace+".insertEmployee", employee);
	}

	@Override
	public int deleteEmployee(Employee employee) {
		return sqlSession.delete(namespace+".deleteEmployee", employee);
	}

	@Override
	public int updateEmployee(Employee employee) {
		return sqlSession.update(namespace+".updateEmployee", employee);
	}

	@Override
	public List<Employee> selectEmployeeByAll() {
		return sqlSession.selectList(namespace+".selectEmployeeByAll");
	}

	@Override
	public Employee selectEmployeeByNo(Employee employee) {
		return sqlSession.selectOne(namespace+".selectEmployeeByNo", employee);
	}

	@Override
	public int selectNextNo() {
		return sqlSession.selectOne(namespace + ".selectNextNo");
	}

}
