package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CollectionTest {

	int age;
	String name;

	CollectionTest(int age, String name) {
		this.age = age;
		this.name = name;
	}

	CollectionTest() {
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "CollectionTest[name="+name+",age="+age+"]";
	}
	
	public static void main(String [] args) {
		List<CollectionTest> list = new ArrayList<>();
		
		list.add(new CollectionTest(10,"Sudhir"));
		list.add(new CollectionTest(5,"Bala"));
		list.add(new CollectionTest(2,"Ronny"));
		list.add(new CollectionTest(11,"Vicky"));
		
		Collections.sort(list, new Comparator<CollectionTest>() {
			public int compare(CollectionTest t1, CollectionTest t2) {
				return t1.getAge() - t2.getAge();
			}
		});
		
		for(CollectionTest result : list) {
			System.out.println(result);
		}
		System.out.println("\n");
		int index = list.size()-1;
		list.remove(index);
		for(CollectionTest count : list) {
			System.out.println(count);
		}
		
	}

}