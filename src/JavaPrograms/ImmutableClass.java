package JavaPrograms;

final class ImmutableClass{
			//declare all properties final.
			final String rollNo;	
		 
			public ImmutableClass(String rollNo){
				this.rollNo = rollNo;
			}
		 
			//only create getter method.
			public String getRollNo() {
				return rollNo;
			}
				
			public static void main(String args[]){
				//creating object. 
				ImmutableClass obj = new ImmutableClass("MCA/07/06");
		 
				System.out.println(obj.getRollNo());
			}
		}
