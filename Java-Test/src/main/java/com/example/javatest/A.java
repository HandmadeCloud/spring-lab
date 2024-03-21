package com.example.javatest;

public class A {

	public synchronized void run(String name){
		System.out.println(name + "lock");
		try{
			Thread.sleep(1000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(name + "lock");
	}

	public void print(final String name) {
		System.out.println("hi");
	}
}
