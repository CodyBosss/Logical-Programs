package JavaPrograms;

public class PojoClass {

	private String Name;
	private String Id;
	private double Salary;
	
	public void setName(String name) {
		this.Name = name;
	}
	public String getName() {
		return Name;
	}
	
	public void setId(String id) {
		this.Id = id;
	}
	public String getId() {
		return Id;
	}
	
	public void setSalary(double salary) {
		this.Salary = salary;
	}
	public double getSalary() {
		return Salary;
	}
	
	public static void main(String[] args) {
		
		PojoClass pc = new PojoClass();
		
		pc.setName("Sudhir");
		System.out.println("Name : "+pc.getName());
		
		pc.setId("100");
		System.out.println("Id : "+pc.getId());
		
		pc.setSalary(50000);
		System.out.println("Salary : "+pc.getSalary());

	}

}
