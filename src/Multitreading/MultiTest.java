package Multitreading;

class Company {
	int n;
	boolean f = false;

	synchronized public void produced_Items(int n) {
		if (f) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.n = n;
		System.out.println("Produced : " + this.n);
		f = true;
		notify();
	}

	synchronized public int consumed_Items() {
		if (!f) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("Consumer : "+this.n);
		f=false;
		notify();
		return n;
	}
}

class Producer extends Thread{
	Company c;
	
	Producer(Company c){
		this.c = c;
	}
	
	public void run() {
		int i =1;
		while(true) {
			this.c.produced_Items(i);
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {}
			i++;
		}
	}
}

class Consumer extends Thread{
	Company c;
	
	Consumer(Company c){
		this.c = c;
	}
	
	
	public void run() {
		while(true) {
		this.c.consumed_Items();
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {}
		}
	}
}

class MultiTest {
	public static void main(String[] args) {
		
		Company com = new Company();
		Producer p = new Producer(com);
		Consumer c = new Consumer(com);
		
		p.start();
		c.start();
	}
}
