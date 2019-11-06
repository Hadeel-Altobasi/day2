package jo.secondstep.Student_Average;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

/*
 project will give you your average in this semester, 
  By taking some information from you which are : 
  your name, your class, number of your subjects, 
  name of your subjects and your mark in each subject.
  Then it will compute your average and give it to you.
   
  */
public class YourAverage {
    static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String studentName, studentClass;
		int numberOfSubjects , iteration;
		double Average ,sum=0;
	
		
		System.out.println("\nHello Student! What's your name ?");
		studentName=input.nextLine();
		if(studentName.isEmpty())
			{System.out.println("\nlooks like you have not enter correct name, please try again !");
			studentName=input.nextLine();
			}
			System.out.println("\nWellcome "+studentName +" :)");
		System.out.println("In which class you are?"); 
		studentClass=input.nextLine();
		System.out.println("\nNice, please tell me number of subjects which you have in this semester !!");
		numberOfSubjects=input.nextInt();
		if (numberOfSubjects<=0|| numberOfSubjects>9)
			{
			System.out.println(studentName+" looks like you have enter wrong value, please try again !");
			numberOfSubjects=input.nextInt();
			
			}
		String [] nameOFSubjects = new String[numberOfSubjects];
		Double [] marks = new Double[numberOfSubjects];
		System.out.println("\nGood, can you tell me the name of each subject with your mark in it ? ");
		
		 for ( iteration = 0 ; iteration<numberOfSubjects ; iteration++)
		 {
		String name = input.next();
		double mark= input.nextDouble();
		if (mark>=0 && mark<=100)
		{
		nameOFSubjects[iteration]=name;
		marks[iteration]=mark;
		}
		else 
		{ 
			System.out.println(studentName+" looks like you have enter wrong value, please try again ! ");
			name = input.next();
			mark= input.nextDouble();
			nameOFSubjects[iteration]=name;
			marks[iteration]=mark;
		}
		
		}
		   
		 for (iteration=0; iteration<numberOfSubjects; iteration++ )
			 sum=sum+marks[iteration];
		 Average=sum/numberOfSubjects;
		 System.out.println("\nhere are your certificate");
		 System.out.println("\nStudent Name: "+studentName+"\t Student Class: "+studentClass);
		 String Date = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		 System.out.println("Date: "+ Date+"\n");
		 System.out.println("Subject"+"\t Mark /100"+"\t State");
		 for(iteration=0; iteration<numberOfSubjects;iteration++)
		 {
			 String state;
			 if (marks[iteration]>=50)
			 System.out.println(nameOFSubjects[iteration]+"\t "+marks[iteration]+"\t         PASS");
			 else 
				 System.out.println(nameOFSubjects[iteration]+"\t "+marks[iteration]+"\t         Failed");	 
			 
		 }
		 String Avg=String.format("%.2f", Average);
		 System.out.print("\nYour Average is : "+Avg+"   \t ");
		System.out.println( (Average>=50) ?"PASS":"Failed");
	    System.out.println("\nThan You :)");
        
	}

}
