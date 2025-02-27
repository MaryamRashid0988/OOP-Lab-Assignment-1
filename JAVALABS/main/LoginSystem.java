package main;
import users.UserManager;
import java.io.Console;

public class LoginSystem{
 
public static void main(String[]args){
    

   Console console = System.console();
   System.out.println("Enter username:");
   String user = console.readLine();
   System.out.println("Enter password:");
   char[] pass = console.readPassword();

   String Pass = String.valueOf(pass);

   if(UserManager.LoginProcessor.authenticate(user,Pass)==true){
      System.out.println("Access Granted!");   }
    else{
    System.out.println("Incorrect Credentials");   }



   
   

}
}

