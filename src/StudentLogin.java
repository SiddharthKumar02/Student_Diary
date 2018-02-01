public class StudentLogin extends StudentEdit{
  StudentLogin(){
    super();
  }

  public void login(){
    studDet.setRollno();
    stud.Det.setPass();
    if(!studDet.map()){
      System.out.println(" #### ERROR ! No Such Student !! ####");
      return;
    }
    Functions.currentStudent=studDet;
    Functions.clrscr();
    Functions.getStudent();
    DisplayCourses dc = new DisplayCourses(studDet.getRollno());
    dc.run();
  }
}
