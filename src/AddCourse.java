import java.util.*;

public class AddCourse extends CourseEdit{
  Course newcourse;

  AddCourse(){
    newcourse=new Course();
    newcourse.setDetails();
    courseList=new  ArrayList<Course>();
  }

  AddCourse(Course c){
    newcourse=c;
  }

  public void Add(){
    if(check("Courses")==true){
      courseList=Course.get();
      for(Course obj:courseList){
        if(newcourse.equals(obj)){
          System.out.println("Course Exists !");
          return;
        }
      }
    }
    courseList.add(newcourse);
    Course.put(courseList);
  }
}
