package Codsoft_internship_projects.codsoft_task_2;
import java.util.*;
public class Student_Grade_Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator....!");
        System.out.println("Enter number of subjects ");
        int numberOfSubject=sc.nextInt();
        int total=0;
        for(int i=1;i<=numberOfSubject;i++){
            System.out.print("Enter the marks Obtained in subject "+i+"-> ");
            int marks=sc.nextInt();
            total+=marks;
        }
        double averagePercentage=(double)(total/numberOfSubject);
        char grade;
        if(averagePercentage>=90){
            grade='O';
        }
        else if(averagePercentage>=80){
            grade='A';
        }
        else if(averagePercentage>=70){
            grade='B';
        }
        else if(averagePercentage>=60){
            grade='C';
        }
        else if(averagePercentage>=50){
            grade='D';
        }
        else if(averagePercentage>=40){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Total Marks Scored is "+total);
        System.out.println("Average Percentage Gained is "+averagePercentage+"%");
        System.out.println("Grade: "+grade);
    }
}
