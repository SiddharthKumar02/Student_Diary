import java.util.*;

public class DisplayCourses extends CourseEdit{

  Scanner s;
  DisplayCourses(String roll){
    s = new Scanner(System.in);
    studDet=new StudentDetails(roll);
  }

  public int menu(){
      int opt=0;
      System.out.println();
      System.out.println("1. View Courses");
      System.out.println("2. Update Courses");
      System.out.println("3. View Current Student Courses");
      System.out.println("4. Update Students Courses");
      System.out.println("5. Logout");
      System.out.print(">> ");
      opt=s.nextInt();
      System.out.println();
      Functions.clrscr();
      Functions.getStudent();
      return opt;
  }

  public int run(){
    while(true){
      int opt=menu();
      switch(opt){
        case 1: PrintStudCourse obj1=new PrintStudCourse(studDet.getRollno());
                obj1.printCourses();
                break;
        case 2: updateCourses();
                break;
        case 3: PrintStudCourse obj2=new PrintStudCourse(studDet.getRollno());
                obj2.printStudentCourse();
                break;
        case 4: updateStudCourse();
                break;
        case 5: Functions.currentStudent=null;
                Functions.clrscr();
                return 1;
      }
    }
  }

  public void updateCourses(){
    switch(ucMenu()){
      case 1: AddCourse obj1 = new AddCourse();
              obj1.Add();
              break;
      case 2: EditCourse obj2 = new EditCourse();
              obj2.delete();
              break;
      case 3:
      case 4: return;
      default: System.out.println("No Such Option !!!");
    }
  }

  private int ucMenu(){
    System.out.println();
    System.out.println("1. Add Course");
    System.out.println("2. Delete Course");
    System.out.println("3. Edit Course");
    System.out.println("4. Back");
    System.out.print(">> ");
    int opt=s.nextInt();
    System.out.println();
    return opt;
  }

  private int uscMenu(){
    System.out.println("1. Add Course");
    System.out.println("2. Delete Course");
    System.out.println("3. Edit Course");
    System.out.println("4. Back");
    System.out.print(">> ");
    int opt=s.nextInt();
    System.out.println();
    return opt;
  }

  public void updateStudCourse(){
    switch(uscMenu()){
      case 1: AddStudCourse obj = new AddStudCourse(studDet.getRollno());
              obj.Add();
              break;
      case 2: EditStudent obj1 = new EditStudent(studDet.getRollno());
              obj1.delete();
              break;
      case 3: EditStudent obj2 = new EditStudent(studDet.getRollno());
              obj2.edit();
              break;
      case 4: return;
      default: System.out.println("Option not found");
    }
  }

}
