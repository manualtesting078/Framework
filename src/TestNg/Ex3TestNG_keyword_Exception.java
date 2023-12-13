package TestNg;

import org.testng.annotations.Test;

import zmq.ZError.IOException;

public class Ex3TestNG_keyword_Exception
{
	@Test(expectedExceptions = { IOException.class })          //Passes
	public void exceptionTestOne() throws Exception {
		//throw new IOException();
	}

	@Test(expectedExceptions = { IOException.class, NullPointerException.class })      //Fails
	public void exceptionTestTwo() throws Exception {
		throw new Exception();
	}
	@Test(expectedExceptions = { ArithmeticException.class })
	void arithmatic() {
		int a=10;
		int b=2;
		int c=a%b;
		System.out.println(c);
		//throw new ArithmeticException();
	}
	

}
