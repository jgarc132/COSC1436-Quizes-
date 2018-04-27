//Juan Garcia

import java.util.Scanner;
public class Quiz02Part01
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("What is your First test score?");
    int testScore01 = userInput.nextInt();
    System.out.println("What is you Second test score?");
    int testScore02 = userInput.nextInt();
    System.out.println("What is your Third test score?");
    int testScore03 = userInput.nextInt();
    
    int averageScore = (testScore01 + testScore02 + testScore03)/3;
    
    System.out.println("Your three scores were "+testScore01+", "+testScore02+", "+testScore03+",and the average of these scores is "+averageScore);
    
  }
}