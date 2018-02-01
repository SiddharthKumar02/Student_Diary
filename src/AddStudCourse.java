import java.util.*;
import java.io.*;

public class AddStudCourse extends CourseEdit{
  StudentCourse sc;

  AddStudCourse(String roll){
    sc=new StudentCourse();
    studDet=new StudentDetails(roll);
  }

  public void Add(){
    if(getCourses()==false)
        return;
    if(sc.getDetails()){
      studCourseList.add(sc);
      StudentCourse.put(studCourseList,studDet.getRollno());
    }
  }

}
