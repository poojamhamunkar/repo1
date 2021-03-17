package testng;

import org.testng.annotations.Test;

public class P4 {
	
	@Test
	public void pen() {
		System.out.println("from pen");
		
	}
@Test(priority=2)
public void mouse() {
	System.out.println("from mouse");
}

@Test(priority=1)
public void keyboard() {
System.out.println("from keyboard");
}
	@Test 
	public void duster() {
	System.out.println("from duster");
	
			}
}