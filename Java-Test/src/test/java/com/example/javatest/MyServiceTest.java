package com.example.javatest;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.Test;

class MyServiceTest {

	@Test
	void test() {
		ExecutorService executorService = Executors.newFixedThreadPool(2);	// ThreadPoolExecutor 생성
		executorService.submit(new RunnableThread()); 				// Runnable을 구현한 객체 submit
		executorService.shutdown(); 						// ThreadPoolExecutor 종료
	}

	private static class RunnableThread implements Runnable {

		@Override
		public void run() {
			System.out.println(Thread.currentThread());
		}
	}


}
