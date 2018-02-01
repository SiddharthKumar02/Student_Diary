import java.util.*;

public class EditStudent extends CourseEdit{

  EditStudent(String roll){
    studDet=new StudentDetails(roll);
    getCourses();
  }

  public int search(StudentCourse toSearch){
    for(StudentCourse obj:studCourseList){
      if(toSearch.equals(obj)==true){
        return studCourseList.indexOf(obj);
      }
    }
    return -1;
  }

  public void delete(){
    StudentCourse toDel=new StudentCourse();
    toDel.setCourseCode();
    int x=search(toDel);
    if(x!=-1){
      studCourseList.remove(x);
      StudentCourse.put(studCourseList,studDet.getRollno());
    }
    else{
      System.out.println("No such entry !!");
    }
  }

  public void edit(){
    StudentCourse toEdit=new StudentCourse();
    toEdit.setCourseCode();
    int x=search(toEdit);
    if(x!=-1){
      editData(x);
    }
    else{
      System.out.println("No such entry !!");
    }
  }

  public void editData(int x){
    System.out.println("Enter new details. Press enter to keep old values :");
    StudentCourse toEdit=studCourseList.get(x);
    studCourseList.remove(x);
    toEdit.changeable();
    studCourseList.add(idx,toEdit);
    StudentCourse.put(studCourseList,studDet.getRollno());
  }



}
