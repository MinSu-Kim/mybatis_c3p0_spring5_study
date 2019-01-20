package mybatis_c3p0_spring5_study;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/resources/context-root.xml"})
public class DataSourceTest extends AbstractTest{
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testDataSource() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		log.debug("DataSource " + ds);
	}
	
	@Test
	public void testConnection() {
		log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
		try(Connection con = ds.getConnection()){
			log.debug("Connection " + con);
			Assert.assertNotNull(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

