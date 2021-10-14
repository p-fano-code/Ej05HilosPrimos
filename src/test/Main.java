package test;

import hilos.HiloRunnable;

public class Main {

	public static void main(String[] args) {

		HiloRunnable hilo1 = new HiloRunnable(26);
		HiloRunnable hilo2 = new HiloRunnable(44);
		HiloRunnable hilo3 = new HiloRunnable(7);
		
		Thread t1 = new Thread(hilo1);
		t1.setName("Hilo 1");
		
		Thread t2 = new Thread(hilo2);
		t2.setName("Hilo 2");

		Thread t3 = new Thread(hilo3);
		t3.setName("Hilo 3");
		
		t1.start();
		t2.start();
		t3.start();


	}

}
