package mybatis_c3p0_spring5_study;

import javax.inject.Inject;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/root-context.xml" })
public class MyBatisTest {
	private static final Log log = LogFactory.getLog(MyBatisTest.class);
	
	@Inject
	private SqlSessionFactory sqlFactory;

	@Test
	public void testFactory() {
		Assert.assertNotNull(sqlFactory);
		log.debug("SqlSessionFactory " + sqlFactory);
	}

	@Test
	public void testSession() {
		try (SqlSession session = sqlFactory.openSession()) {
			log.debug("SqlSession " + session);
			Assert.assertNotNull(session);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
