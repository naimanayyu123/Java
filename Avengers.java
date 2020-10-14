package com.employee;
import java.util.Scanner;

public class Avengers {
 Scanner sc = new Scanner(System.in);
 public String name;
 public int age;
 public String power;
 public String weapon;
 public  String planet;
  public void getDetails() {
	  name = sc.next();
	  age = sc.nextInt();
	  power = sc.nextLine();
	  weapon = sc.nextLine();
	  planet = sc.nextLine();
}
  public void displayDetails() {
	  System.out.println("The name is "+ name);
	  System.out.println("the age is " + age);
	  System.out.println("the weapon is " + weapon);
	  System.out.println(" the power is " + power);
	  System.out.println("the planet is " + planet);
  }
	// TODO Auto-generated method stub
	
}


