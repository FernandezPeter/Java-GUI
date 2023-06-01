import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener{
    
    private JLabel login;
    private JLabel password;
    private JLabel username;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    private JButton buttonLogin,buttonSignup,exit;

    public LoginForm(){
        
        
        setSize(510,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        login = new JLabel("Login now.");
        login.setBounds(120, 25, 300, 100);
        login.setFont(new Font("ARIAL", Font.BOLD, 30));
        login.setForeground(Color.BLUE);



    
        username = new JLabel("Username");
        username.setFont(new Font("ARIAL", Font.PLAIN, 15));
        username.setForeground(Color.BLACK);
        username.setBounds(120, 120, 280, 30);
    
        password = new JLabel("Password");
        password.setFont(new Font("ARIAL", Font.PLAIN, 15));
        password.setForeground(Color.BLACK);
        password.setBounds(120, 200, 280, 30);



        textFieldUsername = new JTextField(15); 
        textFieldUsername.setBounds(120, 155, 250, 40);
        textFieldUsername.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        textFieldUsername.setBackground(Color.LIGHT_GRAY);

        

        passwordField = new JPasswordField(15);
        passwordField.setBounds(120, 240, 250, 40);
        passwordField.setBorder(BorderFactory.createEmptyBorder(5,10,5,10));
        passwordField.setBackground(Color.LIGHT_GRAY);

        
      



        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(120, 310, 250, 40);
        buttonLogin.setFont(new Font("ARIAL", Font.PLAIN, 10));
        buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setBackground(Color.BLUE);
        buttonLogin.setBorder(BorderFactory.createEmptyBorder());
        buttonLogin.setBorder(null);
        
   

        buttonSignup = new JButton("Create an account here");
        buttonSignup.setBounds(145, 360, 200, 30);
        buttonSignup.setFont(new Font("ARIAL", Font.PLAIN, 10));
        buttonSignup.setForeground(Color.BLUE);
        buttonSignup.setBackground(Color.WHITE);
        buttonSignup.setBorder(BorderFactory.createEmptyBorder());

   
       
     


        Container container = getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(null);

        container.add(login);
        container.add(username);
        container.add(password);
        container.add(textFieldUsername);
        container.add(passwordField);
        container.add(buttonLogin);
        container.add(buttonSignup);
 
       
        
        buttonLogin.addActionListener(this);
        buttonSignup.addActionListener(this);
  
        setVisible(true);

       

    }

    public void actionPerformed(ActionEvent e){
        String username = textFieldUsername.getText();
        String password = new String(passwordField.getPassword());
        
        if(e.getSource().equals(exit)){

          
            dispose();

        }else if (username.equals("admin") && password.equals("password")) {

            JOptionPane.showMessageDialog(this, "Login succesful");
            

        }else if (e.getSource().equals(buttonSignup)) {

            new SignupForm();
            dispose(); 

        }else if (username.isEmpty() || password.isEmpty()) { 

            JOptionPane.showMessageDialog(this, "Textfield empty");
        
        }
        else{

            JOptionPane.showMessageDialog(this, "Incorrect username or password");

        }
    }

    public static void main(String[] args){
        new LoginForm();
        
    }
}
