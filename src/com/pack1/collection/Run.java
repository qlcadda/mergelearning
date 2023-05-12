package com.pack1.collection;


class A
{
	void m1() throws Exception
	{
		System.out.println("I am in M1 of A class ");
	}
}

class B extends A
{
	//void m1() throws Throwable // Compile time Error
	//void m1() throws Exception // No Error
	void m1() throws ArithmeticException // No Error
	{
		System.out.println("I am in M1 of B class ");
	}
}


public class Run 
{
	public static void main(String[] args) throws Exception
	{
		A a1 = new B();
		a1.m1(); // I am in M1 of B class 
	}
}
