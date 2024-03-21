package com.example.javatest;

public class A {

	public void run(String name){
		synchronized (this) {
		System.out.println(name + "lock");

		try{
			Thread.sleep(1000);
		} catch (InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(name + "unlock");
		}
	}

	public synchronized void print(String name) {
		System.out.println(name + "hi");
	}
}
