package quizeapplication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Quiz extends JFrame  implements ActionListener{
    String [][]questions= new String[10][5];String [][]answers=new String[10][2];
    String[][] useranswers =new String[10][1];
    JRadioButton b1,b2,b3,b4;
    JLabel qno, question;
    ButtonGroup bg;
    JButton next1,LifeLine,Submit;
    public static int timer =15,answer_given=0,count=0,score;
    String name;
    Quiz(String name){
        this.name=name;
        setBounds(100,0,1400,850);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        setLayout(null);

        ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image =new JLabel(I1);
        add(image);
        image.setBounds(0,0,1400,392);

        qno=new JLabel();
        add(qno);
        qno.setBounds(100,430,50,30);
        qno.setFont(new Font("Tobma",Font.PLAIN,24));
        setLayout(null);

        question=new JLabel();
        add(question);
        question.setBounds(130,430,680,30);
        question.setFont(new Font("Tobma",Font.PLAIN,20));
        setLayout(null);
        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

         b1=new JRadioButton();
        add(b1);
        b1.setBounds(120,490,210,50);
        b1.setLayout(null);
        b1.setBackground(Color.WHITE);
        b1.setFont(new Font("Dialog",Font.PLAIN,18));

         b2=new JRadioButton();
        add(b2);
        b2.setBounds(340 ,490,160,50);
        b2.setLayout(null);
        b2.setBackground(Color.WHITE);
        b2.setFont(new Font("Dialog",Font.PLAIN,18));

         b3=new JRadioButton();
        add(b3);
        b3.setBounds(500 ,490,160,50);
        b3.setLayout(null);
        b3.setBackground(Color.WHITE);
        b3.setFont(new Font("Dialog",Font.PLAIN,18));

         b4=new JRadioButton();
        add(b4);
        b4.setBounds(750 ,490,150,50);
        b4.setLayout(null);
        b4.setBackground(Color.WHITE);
        b4.setFont(new Font("Dialog",Font.PLAIN,18));

        bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        bg.add(b4);

        next1=new JButton("Next");
        add(next1);
        next1.setLayout(null);
        next1.setBounds(120,620,150,70);
        next1.setBackground(new Color(117, 0, 253));
        next1.setForeground(Color.BLACK);
        next1.setFont(new Font("Tahoma",Font.ITALIC,18));
        next1.addActionListener(this);

         LifeLine=new JButton("50 50 LifeLine");
        add(LifeLine);
        LifeLine.setLayout(null);
        LifeLine.setBounds(310,620,150,70);
        LifeLine.setBackground(new Color(116, 0, 253));
        LifeLine.setForeground(Color.BLACK);
        LifeLine.setFont(new Font("Tahoma",Font.ITALIC,18));
        LifeLine.addActionListener(this);

        Submit=new JButton("Submit");
        add(Submit);
        Submit.setLayout(null);
        Submit.setBounds(499,620,150,70);
        Submit.setBackground(new Color(114, 0, 253));
        Submit.setForeground(Color.BLACK);
        Submit.setFont(new Font("Tahoma",Font.ITALIC,18));
        Submit.setEnabled(false);
        Submit.addActionListener(this);
            start(count);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next1) {
            if(count<=9)repaint();
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            answer_given=1;
            if(bg.getSelection()==null){
                useranswers[count][0]="";
            }
            else {
                    useranswers[count][0]=bg.getSelection().getActionCommand();
            }
            if(count==8){
                next1.setEnabled(false);
                Submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (ae.getSource() == LifeLine) {
            if(count==2||count==4||count==6||count==8||count==9){
                b2.setEnabled(false);
                b3.setEnabled(false);
            }
            else{
                b1.setEnabled(false);
                b4.setEnabled(false);
            }
            LifeLine.setEnabled(false);
        }else if(ae.getSource()==Submit){
           answer_given=1;
            if (bg.getSelection()==null){
                useranswers[count][0]="";
            }else {
                useranswers[count][0]=bg.getSelection().getActionCommand();
            }
            for(int i=0;i<useranswers.length;i++){
                if(useranswers[i][0].equals(answers[i][1])){
                    score += 10;
                }
            }
            setVisible(false);
            new Score(name,score);
        }

    }
    public void paint(Graphics g ){
        super.paint(g);
        String time="Time left "+timer+" seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("TOHMA",Font.BOLD,18));
        if(timer>0){
            g.drawString(time,1100,500);
            g.drawRect(1060,450,300,100);
        }
        else
            g.drawString("Times up!!",1100,500);
        timer--;
        try{
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e1){
            System.out.println(e1);      
        }
        if(answer_given==1){
            answer_given=0;
            timer=15;
        }
        else if(timer<0){
            timer=15;
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            if(count==8){
                next1.setEnabled(false);
                Submit.setEnabled(true);
            }

                if(count==9){ //submit button
                    if (bg.getSelection()==null){
                        useranswers[count][0]="";
                    }else {
                        useranswers[count][0]=bg.getSelection().getActionCommand();
                    }
                    for(int i=0;i<useranswers.length;i++){
                        if(useranswers[i][0].equals(answers[i][1])){
                            score+=10;
                        }
                    }
                    setVisible(false);
                    new Score(name,score);
                } else{ // next button
                    if (bg.getSelection()==null){
                        useranswers[count][0]="";
                    }else {
                        useranswers[count][0]=bg.getSelection().getActionCommand();
                    }
                }

                count++;
            start(count);
        }
    }
    public void start(int count){
      qno.setText(""+(count+1)+". ");
      question.setText(questions[count][0]);
      b1.setText(questions[count][1]);
        b1.setActionCommand(questions[count][1]);
      b2.setText(questions[count][2]);
        b2.setActionCommand(questions[count][2]);
      b3.setText(questions[count][3]);
        b3.setActionCommand(questions[count][3]);
      b4.setText(questions[count][4]);
        b4.setActionCommand(questions[count][4]);
        bg.clearSelection();
    }
    public static void main(String[] args) {
        String name;
       new Quiz("User");
    }
}
