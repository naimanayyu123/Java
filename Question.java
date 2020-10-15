package com.Quizapplication;

import java.util.Scanner;

public class Question {
	Scanner sc = new Scanner(System.in);
	String question ;String option1;String option2;String option3; String option4;
	int CorrectAnswer;int UserAnswer;
public boolean askQuestion() {
	System.out.println(question);
	System.out.println("1. "+ option1);
	System.out.println("2. " +  option2);
	System.out.println("3. "+  option3);
	System.out.println("4. "+ option4);
	System.out.println("Please enter an option");
	UserAnswer =sc.nextInt();
	if (UserAnswer == CorrectAnswer) {
		return true;
	}
	
		return false;
}

}
