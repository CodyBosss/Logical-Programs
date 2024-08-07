package SingletonDesignPattern.practice;

//Eager Loading Singleton Class

public class EmployeeEager {

	private static EmployeeEager eager = new EmployeeEager(200, "Ronny", 345678, "ronny@gmail.com");

	public int id;
	public String name;
	public long contact;
	public String email;

	private EmployeeEager(int id, String name, long contact, String email) {
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
	}

	public EmployeeEager() {
		super();
	}

	public static EmployeeEager getEmployeeEager() {
		return eager;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		System.out.println("toString()");
		return "EmployeeEager [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
	}
}
