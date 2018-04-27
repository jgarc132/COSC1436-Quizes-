//Juan Garcia

import java.util.Scanner;

public class Quiz02Part04
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("What is your First Name?");
    String firstName = userInput.nextLine();
    System.out.println("What is your Last Name?");
    String lastName = userInput.nextLine();
    String initials = firstName.Char(0) + "."+lastName.Char(1);
    
    
  }
}