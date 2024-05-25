package assignment6.assignment6_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StringUtilityForm extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField tfInput, tfOutput;
	JButton count, reverse, duplicate;

	public StringUtilityForm() {
		// TODO Auto-generated constructor stub

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("String Utility");
		setSize(500, 200);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);

		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 500, 200);
		p1.setLayout(null);
		add(p1);

		// adding button
		count = new JButton("Count Letters");
		count.setBounds(50, 20, 200, 30);
		count.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str=tfInput.getText();
				int len=str.length();
				str=String.valueOf(len);
				tfOutput.setText(str);
				
				
			}
		});
		p1.add(count);

		reverse = new JButton("Reverse Letters");
		reverse.setBounds(50, 60, 200, 30);
		p1.add(reverse);
		reverse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String str=tfInput.getText();
				String s="";
				for(int i=str.length()-1; i>=0; i--)
				{
					s+=str.charAt(i);
				}
				tfOutput.setText(s);
				
			}
		});

		duplicate = new JButton("Remove Duplicate");
		duplicate.setBounds(50, 100, 200, 30);
		p1.add(duplicate);
		duplicate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//lamda expression
				
				// Lambda expression
				FuncInterface fi = (str) -> {
				    boolean isDuplicate;
				    String newStr = "";

				    for (int i = 0; i < str.length(); i++) {
				        isDuplicate = false;

				        // Compare characters at different positions
				        for (int j = 0; j < newStr.length(); j++) {
				            if (str.charAt(i) == newStr.charAt(j)) {
				                isDuplicate = true;
				                break;
				            }
				        }

				        if (!isDuplicate) {
				            newStr += str.charAt(i);
				        }
				    }

				    return newStr;
				};
				// End of lambda expression

				tfOutput.setText(fi.removeDup(tfInput.getText()));
			
			}
			
			
		});
		

		// adding lablel
		JLabel lblinput = new JLabel("Input");
		lblinput.setBounds(280, 20, 200, 20);
		p1.add(lblinput);

		tfInput = new JTextField();
		tfInput.setBounds(280, 40, 150, 30);
		p1.add(tfInput);

		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(280, 70, 200, 20);
		p1.add(lblOutput);

		tfOutput = new JTextField();
		tfOutput.setBounds(280, 90, 150, 30);
		p1.add(tfOutput);

		// aading text field

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				StringUtilityForm suf = new StringUtilityForm();
				suf.setVisible(true);
			}
		});
					
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	


}
