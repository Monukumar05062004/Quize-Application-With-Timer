package quizeapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton JB1,back;
    JTextField tFE_name;
    Login() {
        // here it is given are declare to purpose to display frame
        setSize(1200, 500);
        setLocation(200, 150);
        setTitle("quiz in java program");
        setVisible(true);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // Here fetch image from directory and to frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpeg"));
        JLabel image = new JLabel(i1);
        add(image);
        image.setBounds(0, 0, 600, 500);
        // we add another component in fame such as JLabel it is called as heading
        JLabel heading = new JLabel("unique and fabulous quiz in java");
        heading.setLayout(null);
        add(heading);
        heading.setBounds(700, 50, 400, 60);
        heading.setFont(new Font("Vainer Hand ITC", Font.BOLD, 20));
        heading.setForeground(new Color(30, 144, 254));

        JLabel name = new JLabel("Enter your name");
        name.setLayout(null);
        add(name);
        name.setBounds(760, 130, 400, 60);
        name.setFont(new Font("Vainer Hand ITC", Font.ITALIC, 18));
        name.setForeground(new Color(30, 144, 254));

        tFE_name = new JTextField();
        add(tFE_name);
        tFE_name.setBounds(700, 200, 300, 40);
        tFE_name.setFont(new Font("Times New Roman", Font.BOLD, 40));

        JB1 = new JButton("Rules");
        add(JB1);
        JB1.setBounds(700, 260, 100, 30);
        JB1.setBackground(new Color(50, 0, 0));
        JB1.setForeground(new Color(20, 200, 20));
        JB1.addActionListener(this);

        back = new JButton("Use to back");
        add(back);
        back.setBounds(900, 260, 100, 30);
        back.setBackground(new Color(50, 0, 0));
        back.setForeground(new Color(20, 200, 20));
        back.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==JB1){
        String name= tFE_name.getText();
        setVisible(false);
            new JB1(name);
        }
        else if(e.getSource()==back){
            setVisible(false);
        }
    }
    public static void main(String [] args){
        new Login();
    }
}
