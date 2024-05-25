package assignment6.assignment6_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class AddressFormNew extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    JTextField tfName, tfStreet, tfCity, tfState, tfZip;
    JButton submit;

    public AddressFormNew() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Address Form");
        setSize(600, 250);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray);
        setLayout(null);

        // Adding panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 250);
        panel.setLayout(null);

        add(panel);

        // Adding labels
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(50, 20, 100, 20);
        panel.add(lblName);

        JLabel lblStreet = new JLabel("Street");
        lblStreet.setBounds(250, 20, 100, 20);
        panel.add(lblStreet);

        JLabel lblCity = new JLabel("City");
        lblCity.setBounds(450, 20, 100, 20);
        panel.add(lblCity);

        JLabel lblState = new JLabel("State");
        lblState.setBounds(100, 80, 100, 20);
        panel.add(lblState);

        JLabel lblZip = new JLabel("Zip");
        lblZip.setBounds(400, 80, 100, 20);
        panel.add(lblZip);

        // Text boxes
        tfName = new JTextField();
        tfName.setBounds(50, 40, 100, 20);
        panel.add(tfName);

        tfStreet = new JTextField();
        tfStreet.setBounds(250, 40, 100, 20);
        panel.add(tfStreet);

        tfCity = new JTextField();
        tfCity.setBounds(450, 40, 100, 20);
        panel.add(tfCity);

        tfState = new JTextField();
        tfState.setBounds(100, 100, 100, 20);
        panel.add(tfState);

        tfZip = new JTextField();  // Initialize tfZip
        tfZip.setBounds(400, 100, 100, 20);
        panel.add(tfZip);

        // Submit button
        submit = new JButton("Submit");
        submit.setBounds(250, 140, 100, 30);
        submit.setBorder(new EmptyBorder(0, 0, 0, 0));
        submit.setBackground(Color.gray);
        submit.addActionListener(this);
        panel.add(submit);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddressFormNew af = new AddressFormNew();
                af.setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            System.out.println(tfName.getText());
            System.out.println(tfStreet.getText());
            System.out.println(tfCity.getText());
            System.out.println(tfState.getText());
            System.out.println(tfZip.getText());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
