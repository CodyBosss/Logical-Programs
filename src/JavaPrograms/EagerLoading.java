package JavaPrograms;

public class EagerLoading {
	
	private static EagerLoading el = new EagerLoading(1000, "Sandy");
	
	int Id;
	String name;
	
	private EagerLoading(int Id, String name) {
		this.Id=Id;
		this.name=name;
	}
	
	public static EagerLoading getEagerLoading() {
		return el;
	}
	
	public String toString() {
		return Id +"....."+ name;
	}
	
	public static void main(String [] args) {
		EagerLoading eagerLoading = EagerLoading.getEagerLoading();
		System.out.println(eagerLoading);
	}
}
