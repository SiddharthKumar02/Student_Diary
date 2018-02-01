public class DisplayStudents extends StudentEdit{
  DisplayStudents(){
    super();
  }

  public int menu(){
    int opt=0;
    System.out.println();
    System.out.println("        Amrita Student Diary        ");
    System.out.println("1. Login");
    System.out.println("2. View Student List");
    System.out.println("3. Add a Student");
    System.out.println("4. Edit Student Data");
    System.out.println("5. Remove a Student");
    System.out.println("6. Exit");
    System.out.print(">> ");
    opt=Functions.getint();
    System.out.println();
    Functions.clrscr();
    return opt;
  }

  public void run(){
    while(true){
      int opt=menu();
      switch(opt){
        case 1: StudentLogin obj=new StudentLogin();
                obj.login();
                break;
        case 2: PrintStudents obj1=new PrintStudents();
                obj1.printAll();
                break;
        case 3: AddStudent obj2=new AddStudent();
                obj2.Add();
                break;
        case 4: EditStudentData obj3=new EditStudentData();
                obj3.edit();
                break;
        case 5: DeleteStudent obj4=new DeleteStudent();
                obj4.delete();
                break;
        case 6: return;
        default: System.out.println("Option not found");
      }
    }
  }
}
