package Form;

import javax.swing.*;

public class Form1 {
    private JFrame f;
    public Form1(){
        f = new JFrame("Employee Form");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println();
    }
}
