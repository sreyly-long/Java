package Form;

import java.awt.*;
import java.applet.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm  extends Applet implements ActionListener {
    String name = " ";
    String gender = " ";
    int age;
    TextField n = new TextField(10);
    CheckboxGroup g = new CheckboxGroup();
    Checkbox m = new Checkbox("Male",g,true);
    Checkbox f = new Checkbox("Female",g,false);
    Choice c = new Choice();
    Label l1 = new Label("Enter Name: ");
    Label l2 = new Label("Select Gender: ");
    Label l3 = new Label("Enter your age: ");
    Button b1 = new Button("Submit");

    public void init(){
        super.init();
        add(l1);
        add(n);
        add(l2);
        add(m);
        add(f);
        add(l3);

        c.add("18");
        c.add("19");
        c.add("20");
        c.add("21");

        add(c);
        add(b1);
    }
    public void paint(Graphics g){
        super.paint(g);

        g.drawString("Name:"+name,20,120);
        g.drawString("Gender:"+gender,20,140);
        g.drawString("Age:"+age,20,160);

    }
    public void actionPerformed(ActionEvent arg0){
        name = n.getText();
        gender = g.getSelectedCheckbox().getLabel();
        age = Integer.parseInt(c.getSelectedItem());
        repaint();
    }


}
