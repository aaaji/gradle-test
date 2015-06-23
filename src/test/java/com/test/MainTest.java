package com.test;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
public class MainTest {
	
	Log log = LogFactory.getLog(MainTest.class);
	
	@Autowired
	TestService testService;
	
	@Test
	public void test1() {
		System.out.println("test1...");
		System.out.println();
		Assert.assertTrue(true);
		Assert.assertEquals(System.getProperty("property"), "value2");
		log.error("errorerrorerrorerror");
		log.debug("debugdebugdebugdebug");
		log.warn("warnwarnwarnwarn");
		
	}
	
	@Test
	public void springMethod() {
		Assert.assertNotNull(testService.getTestName());
	}

}
