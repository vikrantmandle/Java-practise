package com.app.threads;

// Thread creation using Thread class
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("Run Method running in my thread class");
	}
}
public class Multithreading1 {

	public static void main(String[] args){
	MyThread thread = new MyThread();
	thread.run();

	Thread objThread =  new Thread(()->{
		System.out.println("Obj Thread is running");}
	);
		objThread.run();
	}
}
