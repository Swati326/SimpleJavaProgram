package com.DeadLockBetweenThreads;
/*
 * deadlock is part of multithrading.deadlock can occur in situation when thread is waiting for an object lock, that is acquired by 
 * another thread and second thread is waiting for an object lock that is acquired by first thread.
 * so both threads are waiting for each other to release the lock,the condition is called deadlock.
 */

class DeadLock {
	String s1 = "swati";
	String s2 = "neha";

	Thread t1 = new Thread() {
		public void run() {
			while (true) {
				synchronized (s1) {
					try {
						System.out.println(Thread.currentThread().getName() + "locked" + s1);
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (s2) {
						System.out.println(Thread.currentThread().getName() + "locked" + s2);
						System.out.println(s1 + s2);
					}
				}
			}

		}

	};

	Thread t2 = new Thread() {

		public void run() {
			while (true) {
				synchronized (s2) {
					System.out.println(Thread.currentThread().getName() + "locked" + s2);
					synchronized (s1) {
						System.out.println(Thread.currentThread().getName() + "locked" + s1);
						System.out.println(s1 + s2);
					}
				}
			}

		}

	};

}

public class DeadLockBetweenThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock d = new DeadLock();
		d.t1.start();
		d.t2.start();

	}

}
