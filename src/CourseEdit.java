import java.util.*;
import java.io.*;

public class CourseEdit{

  protected ArrayList<Course> courseList;
  protected ArrayList<StudentCourse> studCourseList;
  protected StudentDetails studDet;

  public boolean check(String file){
    String filename="../files/"+file;
    File f = new File(filename);
    if(f.exists()){
      return true;
    }
    return false;
  }

  public boolean getCourses(){
    if(StudentDetails.check(studDet)==true){
      if(check(studDet.getRollno())==true){
        studCourseList = StudentCourse.get(studDet.getRollno());
        return true;
      }
      else{
        studCourseList=new ArrayList<StudentCourse>();
        return true;
      }
    }
    else{
      System.out.println("No Such Student ! Add this student first !");
      return false;
    }
  }
}
