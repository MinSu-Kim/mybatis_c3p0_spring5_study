package mybatis_c3p0_spring5_study;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/resources/*.xml"})
public class DataSourceTest {
	private static final Log log = LogFactory.getLog(DataSourceTest.class);
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testConnection() {
		try(Connection con = ds.getConnection()){
			log.trace("Connection " + con);
			Assert.assertNotNull(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

