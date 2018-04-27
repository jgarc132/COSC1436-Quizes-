import java.lang.Math;                       //Juan Garcia
import java.util.Scanner;
public class Q1Part02
{
  public static void main(String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Welcome Today im going to be calculating your body mass index(BMI)\n "
                         +"What is your weight?(pounds-lbs)");
    double weight = userInput.nextDouble();
    System.out.println("Excellent now what is your height?(inches-in)");
    double height = userInput.nextDouble();
    
    double BMI = (weight*703.0)/(height*height);
    
    if(BMI > 25.0)
    {
      System.out.printf("You are overweight because your BIM is %.2f lbs/in^2",BMI);
    }else if(BMI < 18.5){
      System.out.printf("You are underweight because your BIM is %.2f lbs/in^2",BMI);
    }
    else{
      System.out.printf("Your BIM is optimal because it is %.2f lbs/in^2",BMI);
    }
  }
}