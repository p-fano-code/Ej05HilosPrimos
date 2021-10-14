package hilos;

public class HiloRunnable implements Runnable{

	private int numeroPrimo;	
	
	public HiloRunnable(int numeroPrimo) {
		this.numeroPrimo = numeroPrimo;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());
	
		boolean prime = true; 
	    for(int i = 2; i < numeroPrimo; i++) {
	        if (numeroPrimo % i == 0) {
	            prime = false;
	            break;
	        }
	    }
	    if (prime) {
	    	System.out.println("El numero "+numeroPrimo+" es primo");	
	    }  else {
	    	System.out.println("El numero "+numeroPrimo+" NO es primo");	
		    	
	    }
	}

}
