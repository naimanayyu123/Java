package JavaEmployee.com;


public class Doctor extends employeeDetails {
	
	String specialisation;
	
	Doctor( String name, int age, long sal, String specialisation){
		setEmployeeName(name);
		setAge(age);
		setSalary(sal);
		setdesignation("Doctor");
		this.specialisation = specialisation;
		
	}
	
	/*public void PatientName() {
		System.out.println("Enter Patient name and number of patients");
		Scanner sc = new Scanner(System.in);
		PatientsNum = sc.nextInt();
		PatientName = sc.next();

		System.out.println("Patient's name "+  PatientName);
	}
	public void PatientsNum() {
		System.out.println("Number of patients per day" +  PatientsNum);
	}
	*/
	
	void displayDetails()
	{
		super.displayDetails();
		System.out.println("specialisation : "+specialisation);
	}


}
