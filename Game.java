package com.Quizapplication;

public class Game {
Question[] questions  = new Question[5];
Player player = new Player();
public void initGame() {
	// create 5 objects
	for(int i = 0; i<5; i++) {
		questions[i] = new Question();
	}
    questions[0].question = " How many rings there in olympic flag";
	questions[0].option1= "6";
    questions[0].option2= "2";
    questions[0].option3= "5";
    questions[0].option4= "7";
    questions[0].CorrectAnswer =3;
    questions[1].question = " Who invinted Television";
   	questions[1].option1= "Jhon Logie Bird";
    questions[1].option2= "Jhon Lenon";
    questions[1].option3= "Jhon LOuis Bleriot";
    questions[1].option4= "Jhon David Jason";
    questions[1].CorrectAnswer =1;
    questions[2].question = "Java was developed ?";
   	questions[2].option1= "Guido Van Rossum";
    questions[2].option2= "JetBrains";
    questions[2].option3= "Andy Rubin";
    questions[2].option4= "James Gosling";
    questions[2].CorrectAnswer =4;
    questions[3].question = " Java is not Pure object Oriented language";
   	questions[3].option1= "True, because it doesn't supports primitive data types";
    questions[3].option2= "True, because it supports primitive data types" ;
    questions[3].option3= "Question is not appropriate";
    questions[3].option4= "false";
    questions[3].CorrectAnswer =2;
    questions[4].question = "Static is keyword used for memory management";
   	questions[4].option1= "No, it is used for sharing variables or methd of a given class";
    questions[4].option2= "Yes,and also Static is used for constant variable";
    questions[4].option3= "No";
    questions[4].option4= "yes,and also used for sharing variables or method of a given class, constant variables ";
    questions[4].CorrectAnswer =4;
    
}
 public void play()   {     
    player.getDetails();
    for(int i = 0; i<5; i++) {
    	boolean status = questions[i].askQuestion();
    	if(status == true) {
    		System.out.println("hip hip hurray you are correct");
    		player.Score = player.Score+1;
    		
    	}
    	else {
    		System.out.println("sorry better luck next time bubby");
    		player.Score = player.Score-1;
    		
    	}
    	System.out.println(player.name + " your score is " + player.Score);
    }
    System.out.println(player.name + " your score is " + player.Score);
}
}