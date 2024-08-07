
package Java8Features;

public class ThreadDemoUsingLambdaExpression {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		Runnable thread = () -> {
			
			for(int i=0; i<=10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}					
			}			
		};
		Thread t = new Thread(thread);
		t.setName("Sudhir");
		t.start();
		
		Runnable t1 = () ->{
			for(int i=0; i<=10; i++) {
				System.out.println("2 * "+i+" = "+(i*2));
				
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			}
		};
		Thread t2 = new Thread(t1);
		t2.start();
	}

}
