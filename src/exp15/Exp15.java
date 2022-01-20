// percentage and total of Subject marks using AWT components

package exp15;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp15 {
    Exp15(){
          Frame f = new Frame();
          f.setLayout(null);
          f.setSize(600,600);
          f.setVisible(true);

          Label ml = new Label("Maths");
          ml.setBounds(30, 50, 50, 30);
          f.add(ml);

          TextField maths = new TextField();
          maths.setBounds(130, 50, 150, 30);
          f.add(maths);

          Label pl = new Label("Physics");
          pl.setBounds(30, 90, 50, 30);
          f.add(pl);

          TextField physics = new TextField();
          physics.setBounds(130, 90, 150, 30);
          f.add(physics);

          Label cl = new Label("Chemistry");
          cl.setBounds(30, 140, 100, 30);
          f.add(cl);

          TextField chem = new TextField();
          chem.setBounds(130, 140, 150, 30);
          f.add(chem);

          Label l = new Label();
          l.setBounds(100, 180, 300, 50);
          f.add(l);

          Button total = new Button("Total");
          total.setBounds(50, 230, 100, 40);
          total.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                      int m = Integer.parseInt(maths.getText().toString());
                      int p = Integer.parseInt(physics.getText().toString());
                      int c = Integer.parseInt(chem.getText().toString());
                      l.setText("Total is " + String.valueOf(m + p + c));
                }
          });
          f.add(total);

          Button percent = new Button("Percent");
          percent.setBounds(170, 230, 100, 40);
          percent.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                      int m = Integer.parseInt(maths.getText().toString());
                      int p = Integer.parseInt(physics.getText().toString());
                      int c = Integer.parseInt(chem.getText().toString());
                      int per = (m + p + c) / 3;
                      l.setText("Percentage is " + String.valueOf(per));
                }
          });
          f.add(percent);
    }
    public static void main(String[] args) {
          Exp15 p = new Exp15();
    }
}