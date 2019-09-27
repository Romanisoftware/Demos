import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo{

public int edd = 0,holder,bob,conm,id,opp;
public Demo{
JFrame app = new JFrame ("Demo");
JTextfeld label = new JTextfeld ("You collected"+edd+"dollars");
JButton button = new JButton ("Earn money");
button.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){ 
              edd += 1; 
            label.setText("You collected"+edd+"dollars");  
        }  
    });
label.setBounds(50,50, 150,20);    
app.add(label);    
button.setBounds(100,100,100, 40);    
app.add(button);    
app.setSize(300,400);    
app.setLayout(null);    
app.setVisible(true);    
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}
    public static void main(String[] args) {
        new Demo();
    }
}

