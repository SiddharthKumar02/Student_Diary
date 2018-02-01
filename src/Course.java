import java.util.*;
import java.io.*;

public class Course extends CourseSer implements Serializable{
  String code;
  String name;

  Course(){
    code="";
    name="";
  }

  Course(String a,String b){
    code=a;
    name=b;
  }

  public void setDetails(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Course Code : ");
    code=s.nextLine();
    System.out.print("Enter Course Name : ");
    name=s.nextLine();
    System.out.println();
  }

  public void setCourseCode(){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Course Code : ");
    code=s.nextLine();
  }

  public String getCourseName(){
    return name;
  }

  public String getCourseCode(){
    return code;
  }

  public boolean map(){
    ArrayList<Course> al=Course.get();
    boolean flag=false;
    for(Course obj:al){
      if(this.equals(obj)==true){
        this.name=obj.getCourseName();
        flag=true;
        break;
      }
    }
    return flag;
  }

  public boolean equals(Course c){
    return this.code.trim().equals(c.code.trim());
  }

  public String toString(){
    return "\t"+code+"\t"+name;
  }

}
