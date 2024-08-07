package JavaPrograms;

public class LazyLoading {
	
	int Id;
	String name;
	
	private static LazyLoading lazyLoading = null;
	
	private LazyLoading(int Id, String name) {
		this.Id = Id;
		this.name = name;
	}
	
	public static LazyLoading getLazyLoading() {
		if(lazyLoading==null) {
			lazyLoading = new LazyLoading(100, "Sudhir");
		}
		return lazyLoading;
	}
	
	public String toString() {
		return Id+"..."+name;
	}
	public static void main(String [] args) {
		LazyLoading ll = LazyLoading.getLazyLoading();
		System.out.println(ll);
	}
}
