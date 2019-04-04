package org.myboot.admin.user;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {

	public static void main(String[] args) {   
		ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
			new ArrayBlockingQueue<Runnable>(5));
		//ExecutorService exc = Executors.newFixedThreadPool(5); 
		for(int i=0;i<16;i++){
			MyTask myTask = new MyTask(i);
			executor.execute(myTask);
			System.out.println("线程池中线程数目："+executor.getPoolSize()
							+"，队列中等待执行的任务数目："+executor.getQueue().size()
							+"，已执行完的任务数目："+executor.getCompletedTaskCount());
		}
		executor.shutdown();
	}
}

class MyTask implements Runnable {
	private int taskNum;
	 
	public MyTask(int num) {
	    this.taskNum = num;
	}
	
	public int getTaskNum(){
		return taskNum;
	}
	
	public String toString(){
		return taskNum+"";
	}
	
	@Override
	public void run() {
		System.out.println("正在执行task "+taskNum);
		try {
		    Thread.currentThread().sleep(4000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		System.out.println("task "+taskNum+"执行完毕");
	}
}