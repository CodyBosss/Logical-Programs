package SingletonDesignPattern;

public class SingletonWithEager {
	
	private static SingletonWithEager swe = new SingletonWithEager();
	
	public static SingletonWithEager getSingletonWithEager() {
		return swe;
	}

}
