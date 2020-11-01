package JavaEmployee.com;

import java.util.Scanner;

public class Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		employeeDetails(){
			System.out.println("Give Below Details");

		}

		public void getDetails() {
			System.out.println("Enter employee name, age, salary, designation");
			EmployeeName = Sc.next();
			age = Sc.nextInt();
			Salary = Sc.nextInt();
			Designation =Sc.next();

		}
		public void displayDetails(){
			System.out.println("Hereis the information : employee name "+ EmployeeName + ", age " + age + ", salary " + Salary + ", designation " + Designation);
			
		}
		
		e1.setAge(23);
		
		System.out.println(e1.getAge);



		employeeDetails e1 = new employeeDetails();
		e1.getDetails();
		e1.displayDetails();

		employeeDetails e2 = new employeeDetails();
		e2.getDetails();
		e2.displayDetails();


		employeeDetails e3 = new employeeDetails();
		e3.getDetails();
		e3.displayDetails();


	}

}
