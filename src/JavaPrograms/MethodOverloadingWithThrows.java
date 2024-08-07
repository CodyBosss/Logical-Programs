package JavaPrograms;

	class Test{
		void show() {
			System.out.println("1");
		}
	}
	class MethodOverloadingWithThrows extends Test{
		void show()throws ArithmeticException {
			System.out.println("2");
		}
		public static void main(String [] args) {
			
			Test t = new MethodOverloadingWithThrows();
			t.show();
		}
	}