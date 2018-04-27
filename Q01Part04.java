import java.util.Scanner;                       //Juan Garcia
public class Q01Part04
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please enter 3 numbers");
    
    int num01 = userInput.nextInt();
    int num02 = userInput.nextInt();
    int num03 = userInput.nextInt();
    
    if(num01 == num02 && num02 == num03)
    {
      System.out.println("The smalles value you entered was " + num03);
    }else if (num01 == num02 && num02 > num03)
    {
      System.out.println("The smalles value you entered was " + num02);
    }else if (num01 == num02 && num02 < num03)
    {
      System.out.println("The smalles value you entered was " + num01 + num02);
    }else if (num01 > num02 && num01 < num03)
    {
      System.out.println("The smalles value you entered was " + num02);
    }
    else if (num01 < num02 && num02 < num03)
    {
      System.out.println("The smalles value you entered was " + num01);
    }else if (num01 > num02 && num02 > num03 )
    {
      System.out.println("The smalles value you entered was " + num03);
    }
    else if (num01 > num02 && num02 < num03)
    {
      System.out.println(num01 + " " + num03 +" " + num02);
      
    }
  }
}