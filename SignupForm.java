import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupForm extends JFrame implements ActionListener{
    
    private JLabel signup;
    private JLabel name;
    private JLabel username;
    private JLabel password;
    private JLabel Confirmpassword;

    private JTextField textFieldname;
    private JTextField textFieldusername;
    private JPasswordField passwordtextFieldpassword;
    private JPasswordField passwordFieldConfirmpassword;


    private JButton buttonSignup;
    private JButton buttonback;

    public SignupForm(){
        
        setTitle("Sign up");
        setSize(510,650); 
        setLocationRelativeTo(null);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        



        signup = new JLabel("Create an Account");
        signup.setBounds(120, 25, 500, 100);
        signup.setFont(new Font("ARIAL", Font.BOLD, 28));
        signup.setForeground(Color.BLUE);
        
        name = new JLabel("Username");
        name.setFont(new Font("ARIAL", Font.PLAIN, 15));
        name.setForeground(Color.BLACK);
        name.setBounds(120, 120, 280, 30);

        textFieldname = new JTextField(15); 
        textFieldname.setBounds(120, 150, 250, 40);
        textFieldname.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        textFieldname.setBackground(Color.LIGHT_GRAY);
        

        username = new JLabel("Email");
        username.setFont(new Font("ARIAL", Font.PLAIN, 15));
        username.setForeground(Color.BLACK);
        username.setBounds(120, 195, 280, 30);
        

        textFieldusername = new JTextField(15); 
        textFieldusername.setBounds(120, 230, 250, 40);
        textFieldusername.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        textFieldusername.setBackground(Color.LIGHT_GRAY);
       

        password = new JLabel("Password");
        password.setFont(new Font("ARIAL", Font.PLAIN, 15));
        password.setForeground(Color.BLACK);
        password.setBounds(120,270, 280, 40);

        passwordtextFieldpassword = new JPasswordField(15);
        passwordtextFieldpassword.setBounds(120, 305, 250, 40);
        passwordtextFieldpassword.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        passwordtextFieldpassword.setBackground(Color.LIGHT_GRAY);

        Confirmpassword = new JLabel("Confirm password");
        Confirmpassword.setFont(new Font("ARIAL", Font.PLAIN, 15));
        Confirmpassword.setForeground(Color.BLACK);
        Confirmpassword.setBounds(120, 345, 280, 40);
        
        passwordFieldConfirmpassword  = new JPasswordField(15);
        passwordFieldConfirmpassword.setBounds(120, 380, 250, 40);
        passwordFieldConfirmpassword.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        passwordFieldConfirmpassword.setBackground(Color.LIGHT_GRAY);


        buttonSignup = new JButton("Sign up");
        buttonSignup.setBounds(120, 450, 250, 40);
        buttonSignup.setFont(new Font("ARIAL", Font.PLAIN, 10));
        buttonSignup.setForeground(Color.WHITE);
        buttonSignup.setBackground(Color.BLUE);
        buttonSignup.setBorder(BorderFactory.createEmptyBorder());
        buttonSignup.setBorder(null);

        buttonback = new JButton("Already have an account? Login");
        buttonback.setBounds(150, 500, 200, 30);
        buttonback.setFont(new Font("ARIAL", Font.BOLD, 10));
        buttonback.setForeground(Color.BLUE);
        buttonback.setBackground(Color.WHITE);
        buttonback.setBorder(BorderFactory.createEmptyBorder());
        buttonback.setBorder(null);

      




        Container container = getContentPane();
        container.setBackground(Color.WHITE);
        container.setLayout(null);

        container.add(signup);
        container.add(name);
        container.add(textFieldname);
        container.add(username);
        container.add(textFieldusername);
        container.add(password);
        container.add(passwordtextFieldpassword);
        container.add(Confirmpassword);
        container.add(passwordFieldConfirmpassword);

        container.add(buttonSignup);
        container.add(buttonback);
  

        buttonback.addActionListener(this);
        buttonSignup.addActionListener(this);
    
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String name = textFieldname.getText();
        String username = textFieldusername.getText();
        String password = new String(passwordtextFieldpassword.getPassword());
        String Confirmpassword = new String(passwordFieldConfirmpassword.getPassword());
       
        if(e.getSource().equals(buttonback)){

            new LoginForm();    
            dispose();

        }else if (name.isEmpty() || username.isEmpty() || password.isEmpty() || Confirmpassword.isEmpty()) { 

            JOptionPane.showMessageDialog(this, "Textfield empty");
        
        }else if(password.equals(Confirmpassword)){
            
     
            JOptionPane.showMessageDialog(this,"Signup successful!");

            
        }else{
            JOptionPane.showMessageDialog(this,"Different password!");
        }


    }  


    public static void main(String[] args){
        new SignupForm();
    }
}
