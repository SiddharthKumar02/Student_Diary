import java.io.*;
import java.util.*;

public class StudentDetailsSer{
  public static ArrayList<StudentDetails> get(){
    ArrayList<StudentDetails> list=new ArrayList<StudentDetails>();
    try{
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("../files/Students"));
      while(true){
        list.add((StudentDetails)in.readObject());
      }
    }
    catch(EOFException e){
      return list;
    }
    catch(IOException e){
      System.out.print("  #### An Error Occured While Reading the Students.####");
      System.out.println(" Please make sure to enter names first!");
      return list;
    }
    catch(ClassNotFoundException e){
      System.out.println("#### Error ! Course.java not found ! ####");
      return list;
    }
  }

  public static void put(ArrayList<StudentDetails> list){
    try{
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("../files/Students"));
      for(StudentDetails obj:list){
        out.writeObject(obj);
      }
    }
    catch(IOException e){
      System.out.print("#### An Error Occured While Reading the Students.####");
      System.out.println(" Please make sure to enter names first!");
    }
  }

  public static boolean check(StudentDetails s){
    ArrayList<StudentDetails> list;
    list=get();
    for(StudentDetails obj:list){
      //System.out.println(sd);
      if(obj.equals(s))
        return true;
    }
    return false;
  }
}
