
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberbuttons = new JButton[10];
    JButton[] functionbuttons = new JButton[8];
    JButton addbutton,subbutton,mulbutton,divbutton;
    JButton decbutton, eqlbutton ,delbutton  ,clrbutton ;
    JPanel panel;
    JPanel panel1;

    Font myfont = new Font("ink free",Font.BOLD,30);

    double num1=0, num2=0,result=0;
    char operator;

    Calculator(){

        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setResizable(true);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setFont(myfont);
        textField.setEditable(true);

        addbutton = new JButton("+");
        subbutton = new JButton("-");
        mulbutton = new JButton("*");
        divbutton = new JButton("/");
        decbutton = new JButton(".");
        eqlbutton = new JButton("=");
        delbutton = new JButton("delete");
        clrbutton = new JButton("clear");

        functionbuttons[0] = addbutton;
        functionbuttons[1] = subbutton;
        functionbuttons[2] = mulbutton;
        functionbuttons[3] = divbutton;
        functionbuttons[4] = decbutton;
        functionbuttons[5] = eqlbutton;
        functionbuttons[6] = delbutton;
        functionbuttons[7] = clrbutton;

        for(int i= 0; i<8;i++){
            functionbuttons[i].addActionListener(this::actionPerformed);
            functionbuttons[i].setFont(myfont);
            functionbuttons[i].setFocusable(false);
        }
        for (int i=0; i<10;i++){
            numberbuttons[i] = new JButton(String.valueOf(i));
            numberbuttons[i].addActionListener(this::actionPerformed);
            numberbuttons[i].setFont(myfont);
            numberbuttons[i].setFocusable(false);
        }
        delbutton.setBounds(50,400,145,40);
        clrbutton.setBounds(210,400,145,40);

       panel = new JPanel();
       panel.setBounds(50,100,210,210);
       panel.setLayout(new GridLayout(4,3,10,10));
       panel.setBackground(Color.gray);
       for (int i=0;i<10;i++) {
           panel.add(numberbuttons[i]);
       }
        panel.add(functionbuttons[4]);
        panel.add(functionbuttons[5]);


        panel1 = new JPanel();
        panel1.setBounds(270,100,70,210);
        panel1.setLayout(new GridLayout(4,1,10,10));
        panel1.setBackground(Color.gray);
        for (int i=0;i<4;i++){
            panel1.add(functionbuttons[i]);
        }

        frame.add(panel1);
        frame.add(panel);
        frame.add(numberbuttons[0]);
        frame.add(delbutton);
        frame.add(clrbutton);
        frame.add(textField);
        frame.setVisible(true);
    }
  public static void main(String[] args){

     Calculator calc = new Calculator();
}
public void actionPerformed(ActionEvent e) {
    for(int i=0;i<10;i++){
        if (e.getSource()== numberbuttons[i]){
            textField.setText(textField.getText().concat(String.valueOf(i)));
        }}
        if (e.getSource()== decbutton){
            textField.setText(textField.getText().concat(String.valueOf('.')));
        if (e.getSource()== addbutton){
            num1=Double.parseDouble(textField.getText());
            operator='+';
            textField.setText("");
        }
        if(e.getSource()==delbutton){
            String temp=textField.getText();
            textField.setText("");
            for (int i=0;i<temp.length()-1;i++){
            textField.setText(textField.getText()+temp.charAt(i));}
        }
        if (e.getSource()== subbutton){
            num1=Double.parseDouble(textField.getText());
            operator='-';
            textField.setText("");
        }
        if (e.getSource()== mulbutton){
            num1=Double.parseDouble(textField.getText());
            operator='*';
            textField.setText("");
        }
        if (e.getSource()== divbutton){
            num1=Double.parseDouble(textField.getText());
            operator='/';
            textField.setText("");
        }
        if(e.getSource()==eqlbutton){
            num2=Double.parseDouble(textField.getText());
            switch (operator){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                    case '/':
                    result=num1/num2;
                        break;}
       textField.setText(String.valueOf(result));
            num1=result;
            }
        }
    }
}


