package JavaPrograms;

public class ThreadDemo extends Thread {

	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++){
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<=10; i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n2 * "+i+" = "+(i*2));
		}

	}

}
