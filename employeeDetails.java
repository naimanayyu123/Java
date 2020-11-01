package JavaEmployee.com;

class  employeeDetails {

	private String EmployeeName, designation ;
	private int age ;
	private long Salary;
	
	employeeDetails(){
		
	}
	
	employeeDetails(String name, int age, long sal, String designation){
		this.EmployeeName = name;
		this.age = age;
		this.Salary = sal;
		this.designation = designation;
		
	}
	
	
	
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.EmployeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return Salary;
	}
	public void setSalary(long salary) {
		this.Salary = salary;
	}
	public String getdesignation() {
		return designation;
	}
	public void setdesignation(String designation) {
		this.designation = designation;
	}
	
	
	void displayDetails() {
		System.out.print("Name : "+getEmployeeName()+"   ");
		System.out.print("Age : "+getAge()+"   ");
		System.out.print("Salary : "+getSalary()+"   ");
		System.out.print("Designation : "+getdesignation()+"   ");
	}
}

