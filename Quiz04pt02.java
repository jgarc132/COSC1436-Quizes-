import java.util.Scanner;                                            //Juan Garica
public class Quiz04pt02
{
  public static void main(String[] args)
  {
  Scanner userInput = new Scanner(System.in);
    
  //System.out.println("'A' Brazil Vs Mexico \n"+"'B' Belgium Vs Algeria \n"+"'F' Russia Vs Korea Rep.");
  System.out.println("What group match would you like to watch?(A,H,F)");
  String group = userInput.nextLine();
  char groupChar = group.charAt(0);
  
  switch(groupChar)
  {
    case 'a':
    case 'A':
      System.out.println("Brazil Vs Mexico");
      break;
    case 'h':
    case 'H':
      System.out.println("Belgium Vs Algeria");
      break;
    case 'f':
    case 'F':
      System.out.println("Russia Vs Korea Rep.");
      break;
    default:
      System.out.println("No match from that Group Today");
      break;
  
  }
  }
}