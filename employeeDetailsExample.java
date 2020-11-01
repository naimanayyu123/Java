package JavaEmployee.com;
import java.io.*;


class employeeDetailsExample {

	
	public static void main(String[] args) throws Exception{
		
		employeeDetails naima = new employeeDetails("Naima", 23, 2345678, "Plumber");
		employeeDetails ben = new employeeDetails("Ben", 24, 456789,"Dentist");
		employeeDetails gwen = new employeeDetails("Gwen", 24, 123456, "Scientist");
		employeeDetails kevin = new employeeDetails("Kevin", 26, 345678765, "Driver");
		
		System.out.println("Employee Details");
		naima.displayDetails();
		ben.displayDetails();
		gwen.displayDetails();
		kevin.displayDetails();
		
	}

}