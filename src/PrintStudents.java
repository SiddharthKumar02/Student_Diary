public class PrintStudents extends StudentEdit{
  PrintStudents(){
    super();
  }

  public void printAll(){
    if(!getStudents()){
      System.out.println("Students Not Found !!!");
      System.out.println();
      return;
    }
    for(StudentDetails obj:studentList){
      obj.print();
    }
  }
}
