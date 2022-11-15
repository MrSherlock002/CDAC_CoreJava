package com.acts.utils;

public class TestMethods {

	public void method1() {
		System.out.println("Method1 started " + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method1 Completed " + Thread.currentThread().getName());
	}
	
	public void method2() {
		System.out.println("Method2 started " + Thread.currentThread().getName());
		try {
			Thread.sleep(550);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method2 Completed " + Thread.currentThread().getName());
	}
	
	public synchronized void method3() {
		System.out.println("Method3 started " + Thread.currentThread().getName());
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method3 Completed " + Thread.currentThread().getName());
	}
	
	public  synchronized void method4() {
		System.out.println("Method4 started " + Thread.currentThread().getName());
		try {
			Thread.sleep(650);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method4 Completed " + Thread.currentThread().getName());
	}
	
	public static void method5() {
		System.out.println("Method5 started " + Thread.currentThread().getName());
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method5 Completed " + Thread.currentThread().getName());
	}
	
	public  static void method6() {
		System.out.println("Method6 started " + Thread.currentThread().getName());
		try {
			Thread.sleep(650);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method6 Completed " + Thread.currentThread().getName());
	}
	
	
	
	public static synchronized void method7() {
		System.out.println("Method7 started " + Thread.currentThread().getName());
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method7 Completed " + Thread.currentThread().getName());
	}
	
	public static synchronized void method8() {
		System.out.println("Method8 started " + Thread.currentThread().getName());
		try {
			Thread.sleep(600);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Method8 Completed " + Thread.currentThread().getName());
	}
}
