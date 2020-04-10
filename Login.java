package grocery;



import java.util.Scanner;

public class Login {

    String User;
    String Uid;
    public String Login1() {
   
    Scanner scan = new Scanner (System.in);
   System.out.println("Enter user id");
    Uid = scan.next();
    
    return Uid;
}

public String Login2() {
    Scanner scan = new Scanner (System.in);
    System.out.println("username");
    User = scan.next();
    
    return User;
  }
}