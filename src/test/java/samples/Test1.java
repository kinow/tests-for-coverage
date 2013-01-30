package samples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test1 {

	@Test
	public void testDummy() {
		assertTrue(System.currentTimeMillis() > 0);
		// Comment any of the assert statements below to see the branch coverage difference
		A a = new A();
		assertEquals(1, a.say(0));
		assertEquals(0, a.say(6));
		assertEquals(1, a.say(8));
		// run mvn package to get the site/reports
	}
	
}
