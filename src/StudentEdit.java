import java.util.*;
import java.io.*;

public class StudentEdit{
  ArrayList<StudentDetails> studentList;
  StudentDetails studDet;

  StudentEdit(String rollno){
    studDet=new StudentDetails(rollno);
  }

  StudentEdit(){
    studDet=new StudentDetails();
  }

  public boolean check(String file){
    String filename="../files/"+file;
    File f = new File(filename);
    if(f.exists()){
      return true;
    }
    else{
      return false;
    }
  }

  public boolean getStudents(){
    if(check("Students")){
      studentList=StudentDetails.get();
      return true;
    }
    else{
      studentList=new ArrayList<StudentDetails>();
      return false;
    }
  }

  public int search(StudentDetails s){
    getStudents();
    for(StudentDetails obj:studentList){
      if(obj.equals(s))
        return studentList.indexOf(obj);
    }
    return -1;
  }

}
