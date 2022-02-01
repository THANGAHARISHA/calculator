package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.rmi.server.Operation;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Cal {

	private JFrame frame;
	private JTextField textField_1;
double first;//take first num from user
double second;
double result;
String opration;//hold the which operation to be done
String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(25, 25, 112));
		frame.setBackground(Color.GRAY);
		frame.setBounds(100, 100, 410, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Wide Latin", Font.BOLD, 30));
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setForeground(new Color(0, 0, 0));
		textField_1.setBounds(21, 10, 339, 76);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton buttonbackspace = new JButton("\uF0E7");
		buttonbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;				
				if(textField_1.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField_1.getText());
					str.deleteCharAt(textField_1.getText().length()-1);
					backspace=str.toString();
					textField_1.setText(backspace);
				}
			}
		});
		buttonbackspace.setForeground(Color.BLACK);
		buttonbackspace.setFont(new Font("Wingdings", Font.BOLD, 20));
		buttonbackspace.setBackground(Color.LIGHT_GRAY);
		buttonbackspace.setBounds(10, 153, 85, 42);
		frame.getContentPane().add(buttonbackspace);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button7.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button7.setForeground(Color.BLACK);
		button7.setFont(new Font("Tahoma", Font.BOLD, 16));
		button7.setBackground(Color.LIGHT_GRAY);
		button7.setBounds(10, 205, 85, 55);
		frame.getContentPane().add(button7);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button4.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button4.setForeground(Color.BLACK);
		button4.setFont(new Font("Tahoma", Font.BOLD, 16));
		button4.setBackground(Color.LIGHT_GRAY);
		button4.setBounds(10, 270, 85, 55);
		frame.getContentPane().add(button4);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button1.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button1.setForeground(Color.BLACK);
		button1.setFont(new Font("Tahoma", Font.BOLD, 16));
		button1.setBackground(Color.LIGHT_GRAY);
		button1.setBounds(10, 336, 85, 55);
		frame.getContentPane().add(button1);
		
		JButton buttonzero = new JButton("0");
		buttonzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+buttonzero.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		buttonzero.setForeground(Color.BLACK);
		buttonzero.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonzero.setBackground(Color.LIGHT_GRAY);
		buttonzero.setBounds(10, 403, 85, 55);
		frame.getContentPane().add(buttonzero);
		
		JButton buttonclear = new JButton("C");
		buttonclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(null);
			}
		});
		buttonclear.setForeground(Color.BLACK);
		buttonclear.setFont(new Font("Tahoma", Font.BOLD, 16));
		buttonclear.setBackground(Color.LIGHT_GRAY);
		buttonclear.setBounds(102, 153, 85, 42);
		frame.getContentPane().add(buttonclear);
		
		JButton button00 = new JButton("00");
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button00.getText();
				textField_1.setText(number);
			}
		});
		button00.setForeground(Color.BLACK);
		button00.setFont(new Font("Tahoma", Font.BOLD, 16));
		button00.setBackground(Color.LIGHT_GRAY);
		button00.setBounds(195, 153, 85, 42);
		frame.getContentPane().add(button00);
		
		JButton buttonadd = new JButton("+");
		buttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText(" ");
				opration="+";
			}
		});
		buttonadd.setForeground(Color.BLACK);
		buttonadd.setFont(new Font("Wide Latin", Font.BOLD, 20));
		buttonadd.setBackground(Color.LIGHT_GRAY);
		buttonadd.setBounds(287, 153, 85, 42);
		frame.getContentPane().add(buttonadd);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button8.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button8.setForeground(Color.BLACK);
		button8.setFont(new Font("Tahoma", Font.BOLD, 16));
		button8.setBackground(Color.LIGHT_GRAY);
		button8.setBounds(102, 205, 85, 55);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button9.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button9.setForeground(Color.BLACK);
		button9.setFont(new Font("Tahoma", Font.BOLD, 16));
		button9.setBackground(Color.LIGHT_GRAY);
		button9.setBounds(195, 205, 85, 55);
		frame.getContentPane().add(button9);
		
		JButton buttonsub = new JButton("-");
		buttonsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText(" ");
				opration="-";

			}
		});
		buttonsub.setForeground(Color.BLACK);
		buttonsub.setFont(new Font("Wide Latin", Font.BOLD, 20));
		buttonsub.setBackground(Color.LIGHT_GRAY);
		buttonsub.setBounds(287, 205, 85, 55);
		frame.getContentPane().add(buttonsub);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button5.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button5.setForeground(Color.BLACK);
		button5.setFont(new Font("Tahoma", Font.BOLD, 16));
		button5.setBackground(Color.LIGHT_GRAY);
		button5.setBounds(102, 270, 85, 55);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button6.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button6.setForeground(Color.BLACK);
		button6.setFont(new Font("Tahoma", Font.BOLD, 16));
		button6.setBackground(Color.LIGHT_GRAY);
		button6.setBounds(195, 270, 85, 55);
		frame.getContentPane().add(button6);
		
		JButton buttonmul = new JButton("*");
		buttonmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText(" ");
				opration="*";

			}
		});
		buttonmul.setForeground(Color.BLACK);
		buttonmul.setFont(new Font("Wide Latin", Font.BOLD, 20));
		buttonmul.setBackground(Color.LIGHT_GRAY);
		buttonmul.setBounds(287, 270, 85, 55);
		frame.getContentPane().add(buttonmul);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button2.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button2.setForeground(Color.BLACK);
		button2.setFont(new Font("Tahoma", Font.BOLD, 16));
		button2.setBackground(Color.LIGHT_GRAY);
		button2.setBounds(102, 336, 85, 55);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField_1.getText()+button3.getText();//get text from the user
				textField_1.setText(number);
			}
		});
		button3.setForeground(Color.BLACK);
		button3.setFont(new Font("Tahoma", Font.BOLD, 16));
		button3.setBackground(Color.LIGHT_GRAY);
		button3.setBounds(195, 336, 85, 55);
		frame.getContentPane().add(button3);
		
		JButton buttondiv = new JButton("/");
		buttondiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText(" ");
				opration="/";

			}
		});
		buttondiv.setForeground(Color.BLACK);
		buttondiv.setFont(new Font("Wide Latin", Font.BOLD, 20));
		buttondiv.setBackground(Color.LIGHT_GRAY);
		buttondiv.setBounds(287, 336, 85, 55);
		frame.getContentPane().add(buttondiv);
		
		JButton buttonpoint = new JButton(".");
		buttonpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number=textField_1.getText()+buttonpoint.getText();
			textField_1.setText(number);
			}
		});
		buttonpoint.setForeground(Color.BLACK);
		buttonpoint.setFont(new Font("Wide Latin", Font.BOLD, 21));
		buttonpoint.setBackground(Color.LIGHT_GRAY);
		buttonpoint.setBounds(102, 403, 85, 55);
		frame.getContentPane().add(buttonpoint);
		
		JButton buttonpercent = new JButton("%");
		buttonpercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField_1.getText());
				textField_1.setText(" ");
				opration="%";

			}
		});
		buttonpercent.setForeground(Color.BLACK);
		buttonpercent.setFont(new Font("Wide Latin", Font.BOLD, 20));
		buttonpercent.setBackground(Color.LIGHT_GRAY);
		buttonpercent.setBounds(195, 403, 85, 55);
		frame.getContentPane().add(buttonpercent);
		
		JButton buttonequal = new JButton("=");
		buttonequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField_1.getText());//code for geting sec numb
				if(opration=="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);//covert float to loop
					textField_1.setText(answer);
				}
				else if(opration=="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
				else if(opration=="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
				else if(opration=="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
				if(opration=="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField_1.setText(answer);
				}
            }
		});
		buttonequal.setForeground(Color.BLACK);
		buttonequal.setFont(new Font("Wide Latin", Font.BOLD, 20));
		buttonequal.setBackground(Color.LIGHT_GRAY);
		buttonequal.setBounds(287, 403, 85, 55);
		frame.getContentPane().add(buttonequal);
	}
}
