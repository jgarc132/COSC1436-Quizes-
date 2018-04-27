import java.util.Scanner;
public class Quiz04pt03
{
  public static void main(String[] args)                                //Juan Garica
  {
    Scanner intScanner = new Scanner(System.in);
    
    System.out.println("Please enter three numbers");
    int num01 = intScanner.nextInt();
    int num02 = intScanner.nextInt();
    int num03 = intScanner.nextInt();
    //Ascending
    if(num01 < num02 && num02 < num03)
    {
      System.out.println(num01 + "\n" + num02 + "\n" + num03);
      
    }else if(num01 < num02 && num02 > num03)
    {
      System.out.println(num01 + "\n" + num03 + "\n" + num02);
      
    }else if(num01 < num02 && num02 > num03 && num01 > num03)
    {
      System.out.println(num03 + "\n" + num01 + "\n" + num02);
      
    }else if (num01 > num02 && num02 < num03 && num01 > num03)
    {
      System.out.println(num02 + "\n" + num03 + "\n" + num01);
      
    }else if (num01 > num02 && num02 > num03 && num01 > num03)
    {
      System.out.println(num03 + "\n" + num02 + "\n" + num01);
      
    }else if (num01 > num02 && num02 < num03)
    {
      System.out.println(num02 + "\n" + num01 + "\n" + num03);
    }
  }
}