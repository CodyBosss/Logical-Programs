package EnumPrograms;

enum Demo {	
	a(10),b(20),c(30),d(40),e;
	int temp;
	Demo(int temp){
		this.temp = temp;
	}
	Demo(){
		this.temp = 50;
	}
	
	public int getTemp() {
		return temp;
	}
}

class ETest {

	public static void main(String[] args) {

		Demo [] d = Demo.values();
		for(Demo dm : d) {
			System.out.println(dm+"........"+dm.getTemp());
		}
	}
}