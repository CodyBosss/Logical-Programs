package Multitreading;

public class Using_Thread_Class extends Thread{
	public void run() {
		for(int i=10; i>=1; i--) {
			try {
				System.out.println(i);
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	
	
}
