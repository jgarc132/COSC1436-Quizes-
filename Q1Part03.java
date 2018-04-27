import java.util.Scanner;                       //Juan Garcia
public class Q1Part03
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Please enter tree strings below");
    String s01 = userInput.nextLine();
    String s02 = userInput.nextLine();
    String s03 = userInput.nextLine();
    
    if(s01.equals(s02) && s02.equals(s03))
    {
      System.out.println(s01 + " " + s02 + " " + s03);
    }
    else if(!s01.equals(s02) && s02.equals(s03))
    {
      System.out.println(s01 + " " + s02+ " " + s03);
    }else if(s01.equals(s02) && !s02.equals(s03))
    {
      System.out.println(s03 + " " + s02+ " " + s01);
      
    }
  }
}