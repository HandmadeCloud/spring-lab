package com.example.javatest;

public class JavaTestApplication {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		Thread thread1 = new Thread(() -> a1.run("thread1"));
		Thread thread2 = new Thread(() -> a2.run("thread2"));
		thread1.start();
		thread2.start();
		// 서로 다른 객체에  대한 접근이니 lock을 공유하지 않아 동기화가 발생하지 않음
	}

}
