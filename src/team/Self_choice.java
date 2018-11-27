package team;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;

public class Self_choice extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Self_choice frame = new Self_choice();
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
	public Self_choice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(133, 96, 135, 33);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(320, 96, 135, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(133, 166, 135, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(320, 166, 135, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(320, 238, 135, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(133, 238, 135, 33);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("\uC2DC\uC791");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(106, 90, 205));
		btnNewButton.setFont(new Font("����ǹ��� ����", Font.PLAIN, 26));
		btnNewButton.setBounds(103, 361, 179, 36);
		contentPane.add(btnNewButton);
		
	
		JButton button = new JButton("\uC815\uC9C0");
		button.setBackground(new Color(255, 204, 255));
		button.setForeground(new Color(186, 85, 211));
		button.setFont(new Font("����ǹ��� ����", Font.PLAIN, 26));
		button.setBounds(330, 361, 179, 36);
		contentPane.add(button);
		
		JLabel label = new JLabel("\uACB0\uACFC\uAC12");
		label.setBackground(new Color(255, 255, 255));
		label.setForeground(new Color(0, 0, 139));
		label.setFont(new Font("����ǹ��� �־�", Font.PLAIN, 25));
		label.setBounds(265, 307, 80, 26);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 204, 51));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
		btnNewButton_1.setBounds(24, 23, 49, 47);
		//������ ���ֱ�
		btnNewButton_1.setFocusPainted( false );
		btnNewButton_1.setBorder(null);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
		
		
	}

}