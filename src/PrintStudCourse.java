import java.util.*;
import java.io.*;

public class PrintStudCourse extends CourseEdit{

  PrintStudCourse(String roll){
    studDet=new StudentDetails(roll);
  }

  public void printCourses(){
    courseList=Course.get();
    System.out.println("Sl.No.\t\tCourse Code\tCourse Name");
    System.out.println("------\t\t-----------\t-----------");
    int i=1;
    for(Course obj:courseList){
      System.out.print(i+"\t");
      System.out.println(obj);
      i++;
    }
  }

  public void printStudentCourse(){
    getCourses();
    System.out.println("Sl.No.\t\tCourse Code\tCourse Name\tTotal Credits\tStatus\tCredits Gained\tGrade");
    System.out.println("------\t\t-----------\t-----------\t-------------\t------\t--------------\t-----");
    int i=1;
    for(StudentCourse obj:studCourseList){
      System.out.print(i+"\t");
      System.out.println(obj);
      i++;
    }
  }

}
