package quizeapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener{
    Score(String name,int score){

        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setLayout(null);

        ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=I1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        add(image);
        image.setBounds(0,200,300,250);

        JLabel heading=new JLabel("Thank you "+name+" for playing Simple minds");
        add(heading);
        heading.setBounds(45,30,500,30);
        heading.setFont(new Font("Tobma",Font.PLAIN,28));

        JLabel score1=new JLabel("your score is "+score);
        add(score1);
        score1.setBounds(350,200,300,30);
        score1.setFont(new Font("Tobma",Font.PLAIN,28));

        JButton play = new JButton("play Again");
        play.setLayout(null);
        add(play);
        play.setBackground(new Color(100,90,200));
        play.setBounds(340, 330, 200, 60);
        play.setFont(new Font("Vainer Hand ITC", Font.ITALIC, 18));
        play.setForeground(new Color(30, 144, 254));
        play.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae12){

            setVisible(false);
            new Login();
        }
    public static void main(String[] args) {
    new Score("user",0);
    }
}
