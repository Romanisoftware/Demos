import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo2{

public int edd = 0,holder=100,bob= 50,conm = 50,id = 10,opp = 0;
public Demo2{
JFrame app = new JFrame ("Demo2");
JTextfeld label = new JTextfeld ("You have "+edd+" dollars");
JTextfeld label2 = new JTextfeld ("You gotten "+holder+" people");
JButton button = new JButton ("Earn money");
button.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){ 
              edd += 1; 
              holder -= 1;
              opp += 1;
            label.setText("You collected "+edd+" dollars");  
            label2.setText("You have helped "+opp+" people");
             
        }  
    });
label.setBounds(50,50, 150,20);    
app.add(label);    
label2.setBounds(50,50, 90,20);    
app.add(label2);    
button.setBounds(100,100,100, 40);    
app.add(button);    
app.setSize(300,400);    
app.setLayout(null);    
app.setVisible(true);    
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
    public static void main(String[] args) {
        new Demo2();
    }
}

