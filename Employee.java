package july14;

public class Employee extends Person{
	int employeeId;
	double salary;
	
	
	public Employee(int employeeId, double salary) {
		super();
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}



}
