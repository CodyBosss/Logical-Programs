package Serialization_And_Deserialization_Practice;

import java.io.Serializable;

public class Employee implements Serializable{

	private int id;
	private String name;
	private String contact;

	public Employee(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	public void showName() {
		System.out.println("Hi There my name is : "+this.name);
	}

}
