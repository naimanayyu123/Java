package com.employee;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Subject1 = "English";
		String Subject2 = " Maths";
		String Subject3 = "Science";
		String Subject4= "Social";
		String Subject5 = "Physics";
		System.out.println("Enter Subject marks");
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	num4 = sc.nextInt();
	num5 = sc.nextInt();
//	calculation
	int TotalScore = 500;
	int studentScore = (num1 + num2 + num3+ num4 +num5);
	int Percentage = (studentScore * 100)/TotalScore;
	System.out.println("The percentage of Student is " + Percentage +"%");
	
	if (Percentage <=100 && Percentage >=70)
	{
	  System.out.println("The Student got A grade with " + Percentage + "%");
	}
	else if (Percentage < 70 && Percentage >=50)
	{ System.out.println("The Student got B grade with " + Percentage + "%");

	}

	else if (Percentage < 50 && Percentage >=35)
	{ System.out.println("The Student got c grade with " + Percentage + "%");

	}

	if (Percentage < 35)
	{ System.out.println("The Student Failed with" + Percentage + "%");

	}
	}
}
	


