package com.example.javatest;

public class A {

	public static synchronized void run(String name){
		System.out.println(name + "lock");
		try{
			Thread.sleep(1000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(name + "unlock");
	}

	public static synchronized void print(String name) {
		System.out.println(name + "hi");
	}
}
