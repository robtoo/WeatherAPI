import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WeatherTest {

	Weather weather;

	@Before
	public void setUp() throws Exception {
		weather = new Weather();
	}
	
	@Test
	public void testGetTemp(){
		assertNotNull("getTempToday method returned value should not be null", 
				Weather.getTempToday());
		assertNotNull("getTempTomorrow method returned value should not be null", 
				Weather.getTempTomorrow());
		assertNotNull("getTempOvermorrow method returned value should not be null", 
				Weather.getTempOvermorrow());
		}
	
	@Test
	public void testMinTemp(){
		assertTrue("assert min Today is above -100C ", 
				Weather.getMinToday()>-100);
		assertTrue("assert min Tomorrow is above -100C ", 
				Weather.getMinTomorrow()>-100);
		assertTrue("assert min Overmorrow is above -100C ", 
				Weather.getMinOvermorrow()>-100);
		}
	
	@Test
	public void testMaxTemp(){
		assertTrue("assert maximum temperature for Today is less than 100C ", 
				Weather.getMaxToday()<100);
		assertTrue("assert maximum temperature for Tomorrow is less than 100C ", 
				Weather.getMaxTomorrow()<100);
		assertTrue("assert maximum temperature for Overmorrow is less than 100C ", 
				Weather.getMaxOvermorrow()<100);
		}
	
	@Test
	public void testMaxAndMin(){
		assertTrue("assert MaxTemp is bigger value than MinTemp ", 
				Weather.getMaxToday()< Weather.getMinToday());
		}
	
	@Test
	public void testGEO(){
		assertNotNull("getGEO method returned value should not be null", 
				Weather.getGEO());
		assertTrue ("getGEO has 7 digits in output",
				Weather.getGEO().length()==7);
		}
}
	