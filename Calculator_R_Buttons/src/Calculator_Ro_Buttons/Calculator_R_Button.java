package Calculator_Ro_Buttons;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator_R_Button extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisplay;
	private JButton btnAdd;
	private JButton btnPercent;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnSub;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnMult;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnDiv;
	private JButton btnEquals;
	private JButton btnPM;
	private JButton btnDot;
	private JButton btn0;
	
	String operation;
	String answer;
	double firstnum;
	double secondnum;
	double result;
	protected Object frame;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		
		//========================================
		
		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
		} 
		catch (Exception e) {
			JOptionPane.showInternalMessageDialog(null, e.getMessage());
		}
		
		//========================================
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator_R_Button frame = new Calculator_R_Button();
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
	public Calculator_R_Button() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 283, 425 );
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 247, 68);
		contentPane.add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btnBS = new JButton("\uF0D5");
		btnBS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				if(txtDisplay.getText().length() > 0) {
					StringBuilder StrB=new StringBuilder(txtDisplay.getText());
					StrB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace=StrB.toString();
					txtDisplay.setText(backspace);
				}
			}
		});
		btnBS.setFont(new Font("Wingdings", Font.BOLD, 17));
		btnBS.setBackground(Color.WHITE);
		btnBS.setBounds(10, 89, 55, 55);
		contentPane.add(btnBS);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtDisplay.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnC.setBackground(Color.WHITE);
		btnC.setBounds(75, 89, 55, 55);
		contentPane.add(btnC);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String EnterNumber=txtDisplay.getText() + btn9.getText();
				String EnterString=txtDisplay.getText() + btnAdd.getText();
				txtDisplay.setText(EnterString);
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="+";
				
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(202, 89, 55, 55);
		contentPane.add(btnAdd);
		
		btnPercent = new JButton("%"); 
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="%";	
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPercent.setBackground(Color.WHITE);
		btnPercent.setBounds(138, 89, 55, 55);
		contentPane.add(btnPercent);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber=txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(10, 147, 55, 55);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(75, 147, 55, 55);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(138, 147, 55, 55);
		contentPane.add(btn9);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="-";
				
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSub.setBackground(Color.WHITE);
		btnSub.setBounds(202, 147, 55, 55);
		contentPane.add(btnSub);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(10, 205, 55, 55);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(75, 205, 55, 55);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(138, 205, 55, 55);
		contentPane.add(btn6);
		
		btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="*";
				
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnMult.setBackground(Color.WHITE);
		btnMult.setBounds(202, 205, 55, 55);
		contentPane.add(btnMult);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(10, 264, 55, 55);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(75, 264, 55, 55);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(138, 264, 55, 55);
		contentPane.add(btn3);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operation="/";
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDiv.setBackground(Color.WHITE);
		btnDiv.setBounds(202, 264, 55, 55);
		contentPane.add(btnDiv);
		
		btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum=Double.parseDouble(txtDisplay.getText());
				if(operation=="+") {
					result=firstnum + secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if(operation=="-") {
					result=firstnum - secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if(operation=="*") {
					result=firstnum * secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if(operation=="/") {
					result=firstnum / secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else if(operation=="%") {
					result=firstnum % secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnEquals.setBackground(Color.WHITE);
		btnEquals.setBounds(202, 322, 55, 55);
		contentPane.add(btnEquals);
		
		btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double ops=Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops=ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnPM.setBackground(Color.WHITE);
		btnPM.setBounds(138, 322, 55, 55);
		contentPane.add(btnPM);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(! txtDisplay.getText().contains(".")) {
					txtDisplay.setText(txtDisplay.getText() + btnDot.getText());
				}
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnDot.setBackground(Color.WHITE);
		btnDot.setBounds(75, 322, 55, 55);
		contentPane.add(btnDot);
		
		btn0 = new JButton("0");
		btn0.setForeground(Color.BLACK);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber=txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 17));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(10, 322, 55, 55);
		contentPane.add(btn0);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(37, 34, 89, 23);
		contentPane.add(btnNewButton);
	}
}
