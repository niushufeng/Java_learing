import java.awt.*;
import java.awt.event.* ;

     //*********Found********
public class Java_3 implements ActionListener
{
    public static void main(String args[ ])
    {
        Java_3 tb = new Java_3();
        Frame f = new Frame("Button Test");
        f.setSize(200,100);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        Button b = new Button("Press the Button!");
     //*********Found********
        b.addActionListener(tb); 

        f.add(b);
        f.setVisible(true) ;
    }

    public void actionPerformed(ActionEvent e)
    {
        Frame fr = new Frame("An Other");
        fr.setBackground(Color.green);
        fr.add(new Label("This frame shows when "+"pressing the button in Button Test"));
        fr.pack();
        fr.setVisible(true) ;
    } 
}
