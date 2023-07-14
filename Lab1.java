package july14;

public class Lab1 {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setAddress("No 10 Ekattuthangal");
		p1.setAge(24);
		p1.setName("Lakshmi");
		
		System.out.println(p1.getAddress());
		System.out.println(p1.getAge());
		System.out.println(p1.getName());
		
		
		Person p2=new Person("Lakshmi",21,"no 12 mancherial");
		Person p3=new Person("Naren",24,"no 13 chennai");
		Person p4=new Person("prashanth",23,"no 14 coyambatur");
		
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		Employee e1=new Employee(1001,18000);
		System.out.println(e1);
		System.out.println(Person.count);
		
	}
		
	

	

}
