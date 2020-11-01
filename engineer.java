package JavaEmployee.com;

import java.util.Scanner;

public class engineer extends employeeDetails {
	
	
	String ProjectName;
	String role;
	
	/*public void ProjectName() {
		System.out.println("Enter number of projects and Name of project");
		Scanner sc = new Scanner(System.in);
		NumOfProjects = sc.nextInt();
		ProjectName = sc.next();
	
		System.out.println("Project name "+  ProjectName);
	}
	public void NumOfProjects () {
		System.out.println("Number of Projects per year " +  NumOfProjects);
	}*/
	
	
	engineer(String name, int age, String role, String ProjectName, long sal){
		
		setEmployeeName(name);
		setAge(age);
		setSalary(sal);
		setdesignation("Engineer");
		this.role = role;
		this.ProjectName = ProjectName;
		
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Role : "+role+"   "+"ProjectNAme : "+ProjectName+"   ");
	}
}
