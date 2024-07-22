package Sele;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestNG {

	@Test
	public void testcase1() {
		System.out.println("test");
	}
		@Before()
		public void testcase2() {
			System.out.println("testcase2");
		}
	
@After
public void testcase3() {
	System.out.println("testcase3");
}
	
		
	}
	


