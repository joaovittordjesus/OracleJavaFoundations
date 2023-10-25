import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Ainnnnnn, zé da manga",
                "Não é Virus Confia :p",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Eu sou o melhor?",
                "SIUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU",
                2,
                null,
                null,
                "CR7");
        
        
        String[] acceptableValues = {"11", "2", "3"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Quantué 1 mais 1?",
                "Rei da matemática o miserávi v1.0",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
