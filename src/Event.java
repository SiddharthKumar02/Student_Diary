import java.util.*;
import java.io.*;
public class Event {
	static User eventUser;

	Event(String user, String pass){
		this.init();
		for(ArrayList<User> arr: User.totalUsers){
			if(arr != null){
				for(User n: arr){
					if(n.username.equals(user) && n.password.equals(pass)){
						Event.eventUser = n;
						System.out.println("---------------------------------");
						System.out.println("");
						System.out.println("Hi " + n.name + "!");
						System.out.println(" ");
						return;
					}
				}
			}
		}
		System.out.println("Session Creation failed, Invalid Login!");
		System.exit(0);
	}

	public static void main(String[] args){
		System.out.println("          Amrita Student Diary         ");
		Scanner input = new Scanner(System.in);
		System.out.println("Username: ");
		String username = input.next();
		System.out.println("Password: ");
		String password = input.next();
		Administrator admin = new Administrator("Siddharth","Blackfyre","root");
		Counsellor s = new Counsellor("Sid","sk02","root");
		new Student("SK","u4cse16157",null);
		Event currentEvent = new Event(username,password);

		Event.eventUser.displayMenu();
	}

	public static void init(){
		User.totalUsers.add(Student.get());
		User.totalUsers.add(Counsellor.get());
		User.totalUsers.add(Administrator.get());
		Branch.get();
		Subject.get();
	}

	public static void clrscr(){
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}


}
