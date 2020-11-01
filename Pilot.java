package JavaEmployee.com;

import java.util.Scanner;

public class Pilot extends employeeDetails {
	
	/*
	String PlacesVisited;
	int NumOfPlacesVisited;
	public void places() {
		System.out.println("Enter number of places visited and Place name ");
		Scanner sc = new Scanner(System.in);
		NumOfPlacesVisited = sc.nextInt();
		PlacesVisited = sc.next();

		System.out.println("Places Visited "+  PlacesVisited);
	}
	public void NumOfPlaces() {
		System.out.println("Number of Places Visited" +  NumOfPlacesVisited);
	}*/
	
	
	String noOfFlights;
	String level;
	
	Pilot(String name, int age, String noOfFlights, String level, long sal){
		setEmployeeName(name);
		setAge(age);
		setSalary(sal);
		setdesignation("Pilot");
		this.level = level;
		this.noOfFlights = noOfFlights;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("NoOfFilights : "+noOfFlights+ "    Level : "+level );
	}
	

}
