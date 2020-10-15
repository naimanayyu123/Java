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
	  System.out.println("name?");
	  name = sc.next();
	  System.out.println("age?");
	  age = sc.nextInt();
	  System.out.println("power?");
	  power = sc.next();
	  System.out.println("weapon?");
	  weapon = sc.next();
	  System.out.println("planet");
	  planet = sc.next();
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


