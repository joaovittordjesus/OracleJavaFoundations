
import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        String wryFrom = JOptionPane.showInputDialog("Where are you from?:");
        //Store the input as a String and print it.
        System.out.println(wryFrom);
        //Parse the input as an int.
        int parsedWryFrom = Integer.parseInt(wryFrom);
        //Print its value +1
        System.out.println(parsedWryFrom + 1);
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        
        int newIntDialogBox = Integer.parseInt(JOptionPane.showInputDialog("Type a number:"));

        
    }
}
