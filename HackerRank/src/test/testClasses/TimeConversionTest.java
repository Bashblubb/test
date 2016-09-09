package test.testClasses;

import static org.junit.Assert.*;
import org.junit.Test;
import algorithms.Warmup.TimeConversion;

public class TimeConversionTest {
	
	TimeConversion time = new TimeConversion();
	
	@Test
	public void testTimeConversion() {
		//AM bleibt immer gleich
		assertEquals("07:05:45", time.convertTime("07:05:45AM"));	
		assertEquals("00:05:45", time.convertTime("12:05:45AM"));	
		//PM wird um 12 Stunden erweitert
		assertEquals("12:05:45", time.convertTime("12:05:45PM"));
		assertEquals("19:05:45", time.convertTime("07:05:45PM"));
		assertEquals("15:05:45", time.convertTime("03:05:45PM"));
		assertEquals("23:05:45", time.convertTime("11:05:45PM"));
		assertEquals("13:05:45", time.convertTime("01:05:45PM"));
		
	}

}
