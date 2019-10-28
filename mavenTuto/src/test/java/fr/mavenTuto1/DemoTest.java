package fr.mavenTuto1;

import static org.junit.Assert.*;
import org.junit.Test;

import fr.mavenTuto1.Demo;

// import static src.main.java.fr.mavenTuto1.*;

public class DemoTest {
	@Test
	public void devraitRetournerVrai() {
		Demo demo = new Demo();
		assertTrue(Demo2.getBool());
		assertTrue(demo.getBool());
		System.out.println(demo.getBool());
	}
}
