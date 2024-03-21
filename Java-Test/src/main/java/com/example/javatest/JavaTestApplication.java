package com.example.javatest;

public class JavaTestApplication {

	public static void main(String[] args) throws InterruptedException {
		A a1 = new A();
		Thread[] threads = new Thread[5];
		for (int i = 0; i < threads.length; i++) {
			final int order = i;
			threads[i] = new Thread(() -> {
				a1.run("thread" + order);
			});
		}
		threads[0].start();
		Thread.sleep(100);
		threads[1].start();
		Thread.sleep(100);
		threads[2].start();
		Thread.sleep(100);
		threads[3].start();
		Thread.sleep(100);
		threads[4].start();
		// syncronized 스레드의 동기화 순서는 보장하지 않음
	}
}
