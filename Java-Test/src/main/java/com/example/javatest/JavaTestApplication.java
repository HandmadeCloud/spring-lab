package com.example.javatest;

public class JavaTestApplication {

	public static void main(String[] args) {
		A a1 = new A();
		Thread thread1 = new Thread(() -> a1.run("thread1"));
		Thread thread2 = new Thread(() -> a1.run("thread2"));
		thread1.start();
		thread2.start();
	}
	// block으로 필요한 부분만 lock을 거는 것도 가능하다.
}
