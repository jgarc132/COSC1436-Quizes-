/*
 * Programmer: J.Garcia
 * Date:04/02/2018
 * Quiz 06
 * */
import java.lang.Math;
public class Quiz06{
  public static void main(String[] args){
    //Q01
    fallingDistance(5.0);
    //Q02
    showChar("New York",2);
    //Q03
    checkForSign(5);
    //Q04
    double kg = 100.0;
    System.out.println("Kilograms     Pounds");
    for(double i = 0;i < kg+1;i++){
      double lbs = kgToLbs(i);
      System.out.printf("%.02f        %.02f\n",i,lbs);
    }
  }
  //Question 01
  public static void fallingDistance(double t){
    double g = 9.8;
    double d = 0;
    if(t >= 1 || t <= 10)
    {
      g = 9.8;
      d = (.5)*((g)*(Math.pow(t,2)));
    }
    System.out.printf("The distance of the faling object is %.02f \n",d);
  }
  //Question 02
  public static void showChar(String s,int p){
    char n = s.charAt(p);
    System.out.println("The word "+ s + " has a " + n +" in " + p + " position");
  }
  //Question 03
  public static String checkForSign(int n){
    if(n > 0){
      return "positive";
    }else if (n < 0){
      return "negative";
    }else if (n == 0)
      return "zero";
  }
  //Question 04
  public static double kgToLbs(double p){
    double k = p * 2.2;
    return k;
  }
}