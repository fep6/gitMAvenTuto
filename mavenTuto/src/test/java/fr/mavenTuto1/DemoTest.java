package fr.mavenTuto1;

import static org.junit.Assert.*;
import org.junit.Test;

import fr.mavenTuto1.Demo;

// import static src.main.java.mavenTuto1.Demo;

public class DemoTest {
	@Test
	public void devraitRetournerVrai() {
		Demo demo = new Demo();
		assertTrue(demo.getBool());
	}
}
