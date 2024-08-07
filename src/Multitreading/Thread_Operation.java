package Multitreading;

class MyThread extends Thread{
	
	public void run() {
		System.out.println("run method is started...");
	}
	
}

public class Thread_Operation {	
	
	public static void main(String [] args) {
//		This is a simple program.
		
		System.out.println("Program Started...");
		int x = 10+20;
		System.out.println("Sum is "+x);
		
//		by using thread operation
		
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("Current Thread Name is "+tname);
		
//		Set Name
		t.setName("Sudhir");
		System.out.println(t.getName());
		
		try {
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println(e);
		};
		
		System.out.println(t.getId());
		
		System.out.println("Program ended...");
		
		MyThread thread = new MyThread();
		thread.start();
	}

}
