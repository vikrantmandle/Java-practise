package com.app.threads;

// Thread creation using Runnable interface
public class Multithreading2 {

	public static void main(String[] args){

		Runnable objRunnable = ()->{
			System.out.println("Thread Name: "+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
			System.out.println("Thread Status: "+ Thread.currentThread().getState());
			System.out.println("Thread is running in objRunnable");
		};

		Thread thread1= new Thread(objRunnable,"Thread1");
		thread1.start();
	}
}
