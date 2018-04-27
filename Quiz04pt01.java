import java.util.Scanner;                                    //Juan Garica
public class Quiz04pt01
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Please enter a number from 1 through 4");
    int choice = userInput.nextInt();
    
    switch(choice)
    {
      case 1:
        System.out.println("You select 1.");
        break;
      case 2:
      case 3:
        System.out.println("Yu select 2 OR 3.");
        break;
      case 4:
        System.out.println("You select 4.");
        break;
      default:
        System.out.println("Select again please");
        break;
    }
  }
}