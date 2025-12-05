package com.app.threads;

import java.util.concurrent.*;

//Thread creation using callable interface

class MyCallable implements Callable<Integer> {
	@Override
	public Integer call() {
		System.out.println("State = " + Thread.currentThread().getState());
		return 42;
	}
}
public class MultiThreading3 {

	public static void main(String[] args) throws ExecutionException, InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Integer> f = service.submit(new MyCallable());
		System.out.println("Result = " + f.get());
		service.shutdown();
	}
}
