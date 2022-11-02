import java.util.Scanner;

public class UserLogIn {
    public static void main(String[] args){

        /*
        * Defines username and password.
        * To successful login user need to enter correct value for both.
        * If user entered invalid password and valid username.
        * Program asks to user about password changing, if user want to change
        * user enters new password.Lastly, check new password is different or not from old password.
        * */
        String answer,newPassword,enteredPassword,enteredUserName;
        Scanner input=new Scanner(System.in);
        String password="12345678";
        String userName="ozaydinecee";

        System.out.println("Enter username:");
        enteredUserName=input.nextLine();
        System.out.println("Enter password:");
        enteredPassword=input.nextLine();

        if(userName.equals(enteredUserName) && password.equals(enteredPassword)){
            System.out.println("Successful logın !");
        }
        else if (!enteredPassword.equals(password) && userName.equals(enteredUserName)){
            System.out.println("Invalid password.\n Do you want to change your password ?(y/n)");
            answer=input.nextLine();
            if(answer.equals("n")){
                System.out.println("Good day!");
            }
            else if(answer.equals("y")){
                System.out.println("Enter new password. Your new password should be different from old password.");
                newPassword=input.nextLine();
                if(newPassword.equals(password)){
                    System.out.println("Your new password should be different from old password.");
                }
                else{
                    System.out.println("Password saved.");
                }
            }

        }
        else if(!userName.equals(enteredUserName) && enteredPassword.equals(password)){
            System.out.println("Invalid username.");
        }
        else{
            System.out.println("Invalid username and password.");
        }
    }
}
