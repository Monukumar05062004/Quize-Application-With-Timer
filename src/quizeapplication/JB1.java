package quizeapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class JB1 extends JFrame implements ActionListener{
    String name,name1;
    JButton JB1,back;
    JB1(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(900,700);
        setVisible(true);
        setLocation(400,20);

        JLabel heading = new JLabel("Welcome coder "+name+" ,code for interview to Monu site");
        heading.setLayout(null);
        add(heading);
        heading.setBounds(100, 20, 800, 50);
        heading.setFont(new Font("Vainer Hand ITC", Font.BOLD, 25));
        heading.setForeground(new Color(30, 144, 254));

        JLabel heading1 = new JLabel();
        heading1.setLayout(null);
        add(heading1);
        heading1.setBounds(100, 100, 600, 450);
        heading1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        heading1.setForeground(new Color(30, 144, 254));
        heading1.setText(
                "<html>"+
                        "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                        "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
                        "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                        "4. Crying is allowed but please do so quietly." + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
                        back = new JButton("Use to back");
                        add(back);
                        back.setBounds(100, 590, 100, 30);
                        back.setBackground(new Color(253, 91, 0));
                        back.setForeground(new Color(31, 0, 253));
                        back.addActionListener(this);

                        JB1 = new JButton("Start quiz");
                        add(JB1);
                        JB1.setBounds(400, 590, 100, 30);
                        JB1.setBackground(new Color(253, 91, 0));
                        JB1.setForeground(new Color(31, 0, 253));
                        JB1.addActionListener(this);

//        heading.addActionListener(this);
        JLabel heading2=new JLabel();
        heading2.setLayout(null);
        add(heading2);

    }
    public void actionPerformed(ActionEvent e1){
        if(e1.getSource()==JB1){
            setVisible(false);
          new Quiz("User");
        }
        else{
            setVisible(false);
            new Login();
        }
    }
//    public static void main(String[] args) {
//        new JB1("user");
//    }
}
