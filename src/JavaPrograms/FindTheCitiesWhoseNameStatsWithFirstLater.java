package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindTheCitiesWhoseNameStatsWithFirstLater {

	public static void main(String[] args) {
		
List<String> city =new ArrayList<>();
    	
    	city.add("Nagpur");
    	city.add("Pune");
    	city.add("Mumbai");
    	city.add("Baramati");
    	city.add("Shirur");
    	city.add("Kolhapur");
    	
    	System.out.println(city);
    	
    	List excity = new ArrayList();
    	
    	for(String name : city) {
    		if(name.startsWith("P")) {
    			excity.add(name);
    		}
    	}
    	System.out.println(excity);
	}

}
