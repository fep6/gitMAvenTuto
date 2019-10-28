package mavenTuto1;

import static org.junit.Assert.*;
import org.junit.Test;

public class DemoTest {
	@Test
	public void devraitRetournerVrai() {
		Demo demo = new Demo();
		assertTrue(demo.getBool());
	}
}
