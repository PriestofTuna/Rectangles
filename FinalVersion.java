import java.util.Scanner;
public class FinalVersion {
public static void main(String[] args) {
String Username, username, Password, password;
System.out.println("Enter your Username in the line below");
Scanner keyboard = new Scanner(System.in);
Username = ("Finality");
Password = ("Finished");
username = keyboard.nextLine();
System.out.println("Please enter your Password in the line below");
password = keyboard.nextLine();
if (username.equals(Username) && (password.equals(Password))) {
System.out.print("Welcome " + Username);
}else{
System.out.println("Wrong Username or Password!"); }
	}
	}

