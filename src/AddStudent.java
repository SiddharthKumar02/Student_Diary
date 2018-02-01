public class AddStudent extends StudentEdit{

  AddStudent(String roll){
    super(roll);
  }

  AddStudent(){
    super();
  }

  public void Add(){
    studDet.setDetails();
    if(getStudents()){
      if(StudentDetails.check(studDet)){
        System.out.println("Student Exists !");
        return;
      }
    }
    studentList.add(studDet);
    StudentDetails.put(studentList);
  }
}
