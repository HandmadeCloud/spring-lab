package com.example.javatest;

public class JavaTestApplication {

	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new RunnableThread());

		System.out.println("before start: " + Thread.currentThread());
		thread.start(); // 스레드 실행
		System.out.println("after start: " + Thread.currentThread());

		System.out.println("before join: " + Thread.currentThread());
		thread.join(); // thread 작업 끝날 때까지 메인 스레드 일시정지
		System.out.println("after join: " + Thread.currentThread());
	}


	private static final class RunnableThread implements Runnable {

		@Override
		public void run() {
			System.out.println("run method: " + Thread.currentThread());
		}
	}
}
