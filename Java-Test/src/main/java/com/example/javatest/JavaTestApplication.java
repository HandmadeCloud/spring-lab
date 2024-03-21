package com.example.javatest;

public class JavaTestApplication {

	public static void main(String[] args) throws InterruptedException{
		A a = new A();
		Thread thread1 = new Thread(() -> a.run("thread1"));
		Thread thread2 = new Thread(() -> a.print("thread2"));
		thread1.start();
		Thread.sleep(500);
		thread2.start();

		//syncronized 키워드가 없는 경우, 락과 상관 없이 별도로 잘 실행된다.
	}

}
