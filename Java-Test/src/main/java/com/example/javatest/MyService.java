package com.example.javatest;


public class MyService {

	private int count;

	public void increase() {
		int temp = count;
		count = temp + 1;
	}

	public int getCount() {
		return count;
	}
}