package hilos;

public class HiloRunnable implements Runnable{

	private int numeroPrimo;	
	
	public HiloRunnable(int numeroPrimo) {
		this.numeroPrimo = numeroPrimo;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
	
		boolean prime = true; 
	    for(int i = 2; i < numeroPrimo; i++) {
	        if (numeroPrimo % i == 0) {
	            prime = false;
	            break;
	        }
	    }
	    if (prime) {
	    	time_end = System.currentTimeMillis();
	    	System.out.println("El numero "+numeroPrimo+" es primo");	
	    	System.out.println("*****La ejecución ha tardado "+((time_start-time_end)/1000)+" segs*****");
	    }  else {
	    	time_end = System.currentTimeMillis();
	    	System.out.println("El numero "+numeroPrimo+" NO es primo");	
	    	System.out.println("*****La ejecución ha tardado "+((time_start-time_end)/1000)+" segs*****");
		    	
	    }
	}

}
