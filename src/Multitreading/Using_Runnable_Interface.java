package Multitreading;

public class Using_Runnable_Interface implements Runnable {
	public void run() {
		for(int i=1; i<=10; i++) {	
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
public static void main(String [] args) {
	Using_Runnable_Interface t = new Using_Runnable_Interface();
	Thread thread = new Thread(t);
	
//	Creating Thread class obj 
	
	Using_Thread_Class t1 = new Using_Thread_Class();
	
	thread.start();
	t1.start();
	}
}
