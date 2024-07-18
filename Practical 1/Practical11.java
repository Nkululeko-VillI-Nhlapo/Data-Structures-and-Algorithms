/*
 * Name: Nhlapo Nkululeko Villicent
 * 4129962
 * Practical 1
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Practical11{

    public static boolean verifyPassword(String password){

      Pattern reg = Pattern.compile("^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,}$");

      Matcher validate = reg.matcher(password);

      Boolean result = validate.matches();

      if (password.length() >= 8){
        if (result != true){
          System.out.println("*Password must have atleast  1 Capital letter\n*Password must have atleast  1 small letter\n*Password must have atleast 1 Special Charecter\nTry Again!!");
        } else{
        System.out.println("Password Valid");}
        
      } else{
        System.err.println("*The Password must be 8 or more Charecters long");
        }

        return result;

      
    }

     public static void main(String[] args) { 
      Practical11 obj = new Practical11();
      
      verifyPassword("@@@@@@@@@@@@Ss1");

       
       
       
    }
  }
