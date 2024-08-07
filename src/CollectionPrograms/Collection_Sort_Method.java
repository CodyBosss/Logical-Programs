
package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_Sort_Method {
	
	private String name;
	private int age;	

	public Collection_Sort_Method(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Collection_Sort_Method [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		List<Collection_Sort_Method> list = new ArrayList<>();
		
		list.add(new Collection_Sort_Method("Sudhir", 28));
		list.add(new Collection_Sort_Method("Bala", 22));
		list.add(new Collection_Sort_Method("Ronny", 8));
		list.add(new Collection_Sort_Method("Chinti", 2));
		
		Collections.sort(list, new Comparator<Collection_Sort_Method>(){
			
			public int compare(Collection_Sort_Method c, Collection_Sort_Method c1) {
				return c.getAge() - c1.getAge();
			}
		});
		for(Collection_Sort_Method sorting : list) {
			System.out.println(sorting);
		}		
		
//		int index = list.size() - 1;
//		list.remove(index);
//		for(Collection_Sort_Method c : list) {
//		System.out.println(c);}
		
		
	}	
}
