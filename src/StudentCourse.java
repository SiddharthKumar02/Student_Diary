import java.io.*;
import java.util.*;

public class StudentCourse extends StudentCourseSer implements Serializable{
  private Course course;
  private char grade;
  private char status;
  private int totcredits;
  private int credits;


  StudentCourse(){
    course = new Course();
    grade='-';
    status='-';
    credits=0;
    totcredits=0;
  }

  StudentCourse(Course c,char g,char st,int cred,int totcreds){
    course = c;
    grade=g;
    status=st;
    credits=cred;
    totcredits=totcreds;
  }

  public boolean getDetails(){
    course.setCourseCode();
    if(!course.map()){
      System.out.println("No such course. Add it first !");
      return false;
    }
    getTotcredits();
    getStatus();
    if(status!='T'){
      getCredits();
      getGrade();
    }
    return true;
  }

  public void changeable(){
    getStatus();
    if(status!='T'){
      getCredits();
      getGrade();
    }
  }
  public void setCourseCode(){
    this.course.setCourseCode();
  }

  public Course retCourse(){
    return course;
  }

  public char retGrade(){
    return grade;
  }

  public char retStatus(){
    return status;
  }

  public int retCredits(){
    return credits;
  }

  public int retTotCredits(){
    return totcredits;
  }

  public void getGrade(){
    Scanner s=new Scanner(System.in);
    while(true){
      System.out.print("Enter grade : ");
      String str = s.nextLine();
      str=str.toUpperCase();
      char tmp;
      if(str.length()==0)
        tmp='\n';
      else
        tmp=str.charAt(0);
      if(tmp=='A'||tmp=='B'||tmp=='C'||tmp=='D'||tmp=='P'||tmp=='F'){
        grade=tmp;
        break;
      }
      else if(tmp=='\n')
        break;
      else
        System.out.println("Grade must be in range A-D or P or F !");
    }
  }

  public void getStatus(){
    Scanner s=new Scanner(System.in);
    while(true){
      System.out.print("Enter Status of course : Passed(P),Failed(F),Taking(T) :");
      String str = s.nextLine();
      str=str.toUpperCase();
      char tmp;
      if(str.length()==0)
        tmp='\n';
      else
        tmp=str.charAt(0);
      if(tmp=='P'||tmp=='F'||tmp=='T'){
        status=tmp;
        break;
      }
      else if(tmp=='\n')
        break;
      else
        System.out.println("Invalid Status !");
    }
  }

  public void getTotcredits(){
    System.out.print("Enter the Total Credits of this course : ");
    int tmp=Functions.getint();
    if(tmp!=0)
      totcredits=tmp;
  }

  public void getCredits(){
    System.out.print("Enter the credits gained from this course : ");
    int tmp=Functions.getint();
    if(tmp!=0)
      credits=tmp;
  }

  public boolean equals(StudentCourse obj){
    return this.course.equals(obj.retCourse());
  }

  public String toString(){
    String st=null;
    switch(status){
      case 'T':st="Taking";
               break;
      case 'P':st="Passed";
               break;
      case 'F':st="Failed";
               break;
    }
    return course+"\t\t"+totcredits+"\t\t"+st+"\t"+credits+"\t\t"+grade;
  }
}
