import javax.swing.JOptionPane;                       //Juan Garcia
public class Q1Part01
{
  public static void main(String[] args)
  {
    String num = JOptionPane.showInputDialog("Please enter a number");
    int number = Integer.parseInt(num);
    char firstLetter = num.charAt(0);
    
    switch(firstLetter){
    case '-':
      JOptionPane.showMessageDialog(null,"This number is negative");
      break;
    case '0':
      JOptionPane.showMessageDialog(null,"This number is zero");
      break;
    default:
      JOptionPane.showMessageDialog(null,"This number is positive");
      break;
    }
  }
}