package java1;

import java.util.Scanner;

public class Project2 {

	//loops
public static void main(String[]args){
 int i = 1;
 //while loop
 while (i<5){
	 System.out.println(i);
	 i++;
//do while loop
do{
	System.out.println(i);
	i++;
}
while(i<5);

//for loop 
	
for(int i =1 ; i<5;i++){ //comment it for running while loop and do while loop an switch case.
System.out.println(i);}
	

	int choice;
	System.out.println("pick one : 1. hii\t2 . hey\t2 . hello\t");
	Scanner s = new Scanner(System.in);
	choice = s.nextInt();
	switch(choice)
	{
	case 1: System.out.println("you said hii.");
	break;
	case 2: System.out.println("you said hey.");
	break;
	case 3: System.out.println("you said hello.");
	break;
	
	}
	
	
	}
	
 }
}
