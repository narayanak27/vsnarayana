package july14;

public class Person {

	
		private String name;
		private int age;
		private String address;
		public static int count=0;
		 
		public Person(){
			count++;
		}
		public Person(String name,int age, String address){
			 this.address=address;
			 this.age=age;
			 this.name=name;
			 count++;
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Person name=" + name + ", age=" + age + ", address=" + address;
		}
		
	}


