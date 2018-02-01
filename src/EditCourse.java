import java.util.*;

public class EditCourse extends CourseEdit{
  EditCourse(){
    courseList=Course.get();
  }

  public int search(Course toSearch){
    for(Course obj:courseList){
      if(toSearch.equals(obj)){
        return courseList.indexOf(obj);
      }
    }
    return -1;
  }

  public void delete(){
    Course sc=new Course();
    sc.setCourseCode();
    int idx=search(sc);
    if(idx!=-1){
      courseList.remove(idx);
      Course.put(courseList);
    }
    else{
      System.out.println("No such entry !!");
    }
  }
}
