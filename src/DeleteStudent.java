public class DeleteStudent extends StudentEdit{

  DeleteStudent(){
    super();
  }

  public void delete(){
    studDet.setRollno();
    int x=search(studDet);
    if(x!=-1){
      studentList.remove(x);
      StudentDetails.put(studentList);
    }
    else{
      System.out.println("Entry not found !!");
    }
  }

}
