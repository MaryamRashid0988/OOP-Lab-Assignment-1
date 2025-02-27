package users;
import util.PasswordValidator;

public class UserManager{

 static final String storedUsername = "maryam.098";
 static final String storedPassword = "kysibrahimsaif";

 public static class LoginProcessor{

    public static Boolean authenticate(String username, String password){
      if(username.equals(storedUsername) && password.equals(storedPassword)){
          return true; }
      else{
      return false;}
     
      
        
  }
}
}
