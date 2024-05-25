import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClassWorkJframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfCounter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassWorkJframe frame = new ClassWorkJframe();
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
	public ClassWorkJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Counter");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(59, 54, 128, 43);
		contentPane.add(lblNewLabel);
		
		tfCounter = new JTextField();
		tfCounter.setBounds(180, 63, 139, 31);
		contentPane.add(tfCounter);
		tfCounter.setColumns(10);
		
		JButton btnCount = new JButton("Count");
		btnCount.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ss=tfCounter.getText();
				int x=Integer.parseInt(ss);
				x++;
				tfCounter.setText(""+x);
				
			}
		});
		btnCount.setBounds(188, 138, 139, 31);
		contentPane.add(btnCount);
	}
}
