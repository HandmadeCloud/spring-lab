package com.example.javatest;

public class JavaTestApplication {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		Thread thread1 = new Thread(() -> a1.run("thread1"));
		Thread thread2 = new Thread(() -> a2.print("thread2"));
		thread1.start();
		thread2.start();
	}
	// 인스턴스와 클래스 단위의 syncronized 키워드는 공유되지 않음
}
