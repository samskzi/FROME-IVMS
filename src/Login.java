import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private String password,username;
	private JLabel error;
	private String errorText="Invalid user name or password!";
	private JLabel lblCaddeyLogin;
	JButton btnLogin;
	private JLabel label;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();					
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login()
	{
		GUI();
	}
	void GUI()
	{
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(154, 141, 91, 14);
		contentPane.add(lblUserName);
		
		usernameField = new JTextField();
		usernameField.setBounds(282, 140, 129, 20);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password\r\n");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(154, 174, 91, 14);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(282, 173, 129, 20);
		contentPane.add(passwordField);
		
		passwordField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					btnLogin.doClick();
				}
		});
		
		btnLogin = new JButton("Login");
	
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				password=passwordField.getText().toString().toLowerCase();
				username=usernameField.getText().toString().toLowerCase();
				passwordField.setText("");
				usernameField.setText("");
				if(password.equals("")||username.equals(""))
					error.setText(errorText);
				else
				{
					error.setText("");
					if(username.equals("swen") && password.equals("1234"))
					{
								error.setText("");
								AdminPanel p=new AdminPanel();
								p.setVisible(true);
							}
						else
							error.setText(errorText);
					}
					
					{
						if(username.equals("swen") && password.equals("1234")){
						{
							error.setText("");
							generateInvoice g=new generateInvoice();
							g.setVisible(true);
						}
				
						
						
						
						error.setText(errorText);
					}
					
				}
			}
		});
		btnLogin.setBounds(282, 227, 89, 23);
		contentPane.add(btnLogin);
		
		error = new JLabel("");
		error.setForeground(Color.RED);
		error.setBounds(104, 236, 220, 14);
		contentPane.add(error);
		
		lblCaddeyLogin = new JLabel("Tuck Shop User Inferface");
		lblCaddeyLogin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCaddeyLogin.setBounds(149, 26, 217, 28);
		contentPane.add(lblCaddeyLogin);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Frome IVMS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 495, 326);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(-12, -84, 111, 546);
		panel.add(panel_1);
		
		
		
	}

	
}
