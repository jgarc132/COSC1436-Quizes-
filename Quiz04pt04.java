import java.util.Scanner;
public class Quiz04pt04                                   //Juan Garica
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);
    
    double a = 9.95, b = 13.95, c = 19.95;
    
    
    System.out.println("What letter of package have you purchased?(A,B,C)");
    String pck = userInput.nextLine();
    char pckChar = pck.charAt(0);
    
    switch(pckChar)
    {
      case 'a':
      case 'A':
        System.out.println("How many hourse have you used?");
        double hrs = intScanner.nextDouble();
        double total = ((hrs - 10.0)*2) + a;
        System.out.printf("Your total will be $%.2f.\n",total);
        break;
      case 'b':
      case 'B':
        System.out.println("How many hourse have you used?");
        double hrsB = intScanner.nextDouble();
        double totalB = ((hrsB - 20.0)*1) + b;
        System.out.printf("Your total will be $%.2f.\n",totalB);
      case 'c':
      case 'C':
        System.out.printf("Your total will be $%.2f.\n",c);
    }  
  }
}