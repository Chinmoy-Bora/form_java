import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    private JLabel heading;
    Font font= new Font("",Font.BOLD,20);

    private JPanel mainPanel;
    private JLabel nameLabel,passwordLabel;
    private JTextField nameField;
    private JPasswordField passwordField;
    private JButton button1,button2;


    public MyWindow() {
        super.setTitle("This is my first form");
        super.setSize(500, 500);
        super.setLocation(100, 100);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        System.out.println("Constructor");
    }
    public void createGUI()
    {
        this.setLayout(new BorderLayout());
        heading=new JLabel("This my 1st form... ");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading,BorderLayout.NORTH);

        //working with JPanel//
        mainPanel=new JPanel();
        mainPanel.setLayout(new GridLayout(3,2));

        nameLabel=new JLabel("Enter your name");
        nameLabel.setFont(font);
        passwordLabel=new JLabel("Enter your password");
        passwordLabel.setFont(font);
        nameField=new JTextField();
        nameField.setFont(font);
        passwordField=new JPasswordField();
        passwordField.setFont(font);
        button1=new JButton("Submit");
        button1.setFont(font);


        button2=new JButton("Reset");
        button2.setFont(font);

        mainPanel.add(nameLabel);
        mainPanel.add(nameField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordField);
        mainPanel.add(button1);
        mainPanel.add(button2);

        this.add(mainPanel,BorderLayout.CENTER);

    }
}