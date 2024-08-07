package CollectionPrograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// using stream API remove duplicate values.

public class CollectionExample {
	
	private String name;
	private String Id;
	private double salary;
	
	CollectionExample(String name, String Id, double salary){
		this.name = name;
		this.Id = Id;
		this.salary = salary;
	}
		
	public CollectionExample() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return name+" "+Id+" "+salary;			
	}
	
	    public static void main(String args[])throws IOException{	  
	    
	    	List<CollectionExample> emp = new ArrayList<>();
			emp.add(new CollectionExample("S", "10", 1234));
			emp.add(new CollectionExample("K", "11", 3211));
			emp.add(new CollectionExample("M", "14", 3213));
						
			int index = emp.size() - 1;
			emp.remove(index);
			for(CollectionExample e : emp) {
				System.out.println(e);
			}		
		}
	}




