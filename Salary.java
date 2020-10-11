package com.employee;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int date;
		int month;
		int year;
		System.out.println("Enter name");
		name = sc.nextLine();
		System.out.println("Enter date");
		date = sc.nextInt();
		System.out.println("Enter month");
		month = sc.nextInt();
		System.out.println("Enter year");
		year = sc.nextInt();
		LocalDate today = LocalDate.now();
		LocalDate Birthday = LocalDate.of(year, date, month);
		int age = Period.between(Birthday, today).getYears();
		System.out.println(age);
		int Salary;
		Salary = sc.nextInt();
		System.out.println("Employee name is " + name + " has " + age +" years old.Earns " + Salary + " per annum " );
		if (Salary <= 200000 )
		{
			System.out.println("No Income Tax");
		}
		else if (Salary<=300000 && Salary >200000)
		{
			double tax = 0.05 * Salary;
				System.out.println("Tax paid is " + tax);	
		}
		else if (Salary <=400000 && Salary >300000)
		{
		     double tax = 0.10 * Salary;
				System.out.println("Tax paid is " + tax);	
		}
		else if (Salary <=500000 && Salary >400000)
		{
			double tax = 0.15 * Salary;
				System.out.println("Tax paid is " + tax);	
		}
		else if (Salary >500000 )
		{
			double tax =  (0.20 * Salary);
				System.out.println("Tax paid is " + tax);	
		}
				
		
		
		 

	}

}
