package com.infotech.client;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalDemo implements Runnable{

	private static final AtomicInteger nextId = new AtomicInteger(0);
	private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(()->nextId.getAndIncrement());
	
	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName()+" Value-"+threadId.get());
	}
}
