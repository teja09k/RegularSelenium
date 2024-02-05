package Listenerrss;

import org.testng.annotations.Test;

public class Skippedd {
	@Test(timeOut =1000)
	public void m1() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("executing m1");
	}
	@Test(dependsOnMethods = "m1")
	public void m2() {
		System.out.println("executing m2");
		
	}

}
