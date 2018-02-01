import java.util.*;
public class Functions{

  static StudentDetails currentStudent;

  public static int getint(){
    Scanner s=new Scanner(System.in);
    String buf=s.nextLine();
    int num;
    try{
      num=Integer.parseInt(buf);
    }catch(NumberFormatException e){
      String tmp="0";
      for(int i=0;i<buf.length();i++){
        int ascii=(int)buf.charAt(i);
        if(ascii<48 || ascii>57)
          break;
        tmp=tmp+buf.charAt(i);
      }
      num=Integer.parseInt(tmp);
    }
    return num;
  }

  public static void clrscr(){
    System.out.print("\033[H\033[2J");
    
  }

  public static void getStudent(){
    Functions.currentStudent.print();
  }

}
