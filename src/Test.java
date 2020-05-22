import javax.swing.*;

public class Test{
    public static void main(String[] args) {
      int day;
      double amount;
      double total = 0.0;

      String input = JOptionPane.showInputDialog(null ,
              "Enter the total day that you got money :");
      day = Integer.parseInt(input);

      for( int x = 1 ; x <= day ; x ++){

          input = JOptionPane.showInputDialog(null,
                  "Enter the amount for day"+x);

          amount = Double.parseDouble(input);

          total = total + amount;


      }
      JOptionPane.showMessageDialog(null ,
              "Total Amount is " + total);

      System.exit(0);
    }
}