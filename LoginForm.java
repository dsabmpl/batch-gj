import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    JLabel userLabel, passwordLabel;
    JTextField userTextField;
    JPasswordField passwordField;
    JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));

        userLabel = new JLabel("UserName");
        passwordLabel = new JLabel("Password");
        userTextField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        loginButton.addActionListener(this);

        add(userLabel);
        add(userTextField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(loginButton);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        String userName = userTextField.getText();
        String password = new String(passwordField.getPassword());
        if (userName.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login SuccessFull");
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }

}
