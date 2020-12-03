import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Panel;

public class searchProduct extends JPanel {
	
	JTextField idField;
	JButton btnSearch;
	private JLabel error;
	String id,err="Enter product id!";
	/**
	 * Create the panel.
	 */
	public searchProduct() {
		setLayout(null);
		setBounds(100, 100, 840, 619);
		JLabel lblSearchProduct = new JLabel("SEARCH PRODUCT");
		lblSearchProduct.setBounds(319, 84, 232, 21);
		lblSearchProduct.setFont(new Font("Tahoma", Font.BOLD, 17));
		add(lblSearchProduct);
		
		JLabel lblProductName = new JLabel("Product ID");
		lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProductName.setBounds(253, 156, 124, 21);
		add(lblProductName);
		
		idField = new JTextField();
		idField.setBounds(449, 158, 136, 20);
		add(idField);
		idField.setColumns(10);
		
		btnSearch = new JButton("Search");
		btnSearch.setForeground(new Color(0, 128, 0));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(idField.getText().equals(""))
				{
					error.setText(err);
				}
				else
				{
					error.setText("");
					id=idField.getText().trim();
					DB.searchProduct(id);
					idField.setText("");
				}
			}
		});
		btnSearch.setBounds(449, 219, 136, 23);
		add(btnSearch);
		
		error = new JLabel("");
		error.setForeground(Color.RED);
		error.setBounds(349, 277, 217, 14);
		add(error);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBounds(10, 97, 225, 469);
		add(panel);
		
	}
}
