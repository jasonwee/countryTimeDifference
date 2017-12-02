package net.opentracker.app;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TimeDiffTest {
	
	protected static TimeDiff td;
	
	@BeforeClass
	public static void beforeClass() {
		td = new TimeDiff(false);
	}
	
	@AfterClass
	public static void afterClass() {
		
	}
	
	@Before
	public void setUp() {
		 
	}

	@After
	public void tearDown() {

	}

	@Test
	public void testConvertDateTime() {
		String time = td.convertDateTime("2017-12-02 16:42:06", "Asia/Kuala_Lumpur", "yyyy-MM-dd HH:mm:ss", "Europe/Amsterdam");
		assertEquals("2017-12-02 09:42:06", time);
	}
	
	@Test 
	public void testConverFromKLtoAms() {
		String time = td.convertDateTime("2017-12-02 16:42:06", "Asia/Kuala_Lumpur", "yyyy-MM-dd HH:mm:ss", "Europe/Amsterdam");
		assertEquals("2017-12-02 09:42:06", time);
	}
	
	@Test 
	public void testConverFromAmstoKL() {
		String time = td.convertDateTime("2017-12-02 09:42:06", "Europe/Amsterdam", "yyyy-MM-dd HH:mm:ss", "Asia/Kuala_Lumpur");
		assertEquals("2017-12-02 16:42:06", time);
	}
	
}
