//Juan Garcia

import java.util.Scanner;
public class Quiz02Part02
{
  public static void main(String[] args)
  {
  Scanner userInput = new Scanner(System.in);
  
  System.out.println("How many Miles have you driven?");
  int miles = userInput.nextInt();
  System.out.println("How many Gallons of gas have you used?");
  int gallons = userInput.nextInt();
  
  int MPG = miles/gallons;
  
  
  System.out.println("The MPG(Miles-Per-Gallons) used during your trip was "+MPG);
  
  
  }
}