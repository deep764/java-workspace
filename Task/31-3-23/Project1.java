package com.a313;
import java.io.FileNotFoundException;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

public class Project1 implements ActionListener
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField tf1,tf2,tf3;
	JPasswordField P1,P2;
	JButton btn1;
	public static void main(String[] args) throws IOException 
	{ 
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Project1 window = new Project1();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	public Project1() throws FileNotFoundException 
	{
		frame = new JFrame();
		l1 = new JLabel("Name");
		l1.setFont(new Font("Tahoma", Font.BOLD, 15));
		l1.setBounds(36, 51, 48, 59);
		tf1=new JTextField();
		tf1.setBounds(189, 73, 186, 20);
		
		l2 =new JLabel("Mail Id");
		l2.setFont(new Font("Tahoma", Font.BOLD, 15));
		l2.setBounds(36, 158, 64, 59);
		tf2=new JTextField();
		tf2.setBounds(189, 125, 186, 20);
		
		l3 =new JLabel("Mobile No");
		l3.setFont(new Font("Tahoma", Font.BOLD, 15));
		l3.setBounds(36, 103, 78, 59);
		tf3=new JTextField();
		tf3.setBounds(189, 180, 186, 20);
		
		P1= new JPasswordField();
		l4 =new JLabel("Password");
		l4.setFont(new Font("Tahoma", Font.BOLD, 15));
		l4.setBounds(36, 217, 78, 59);
		P1 = new JPasswordField();
		P1.setBounds(189, 293, 186, 20);
		
		P2= new JPasswordField();
		l5 =new JLabel("Re password");
		l5.setFont(new Font("Tahoma", Font.BOLD, 15));
		l5.setBounds(36, 271, 98, 59);
		P2 = new JPasswordField();
		P2.setBounds(189, 239, 186, 20);
		
		btn1 =new JButton("Register");
		btn1.setBounds(145, 367, 138, 39);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		l6 = new JLabel("Register a new Student");
		l6.setForeground(new Color(255, 128, 128));
		l6.setFont(new Font("Tahoma", Font.BOLD, 25));
		l6.setBounds(72, 0, 405, 59);
		
		frame.getContentPane().add(tf1);
		frame.getContentPane().add(tf2);
		frame.getContentPane().add(tf3);
		frame.getContentPane().add(l1);
		frame.getContentPane().add(l2);
		frame.getContentPane().add(l3);
		frame.getContentPane().add(l4);
		frame.getContentPane().add(l5);
		frame.getContentPane().add(P1);
		frame.getContentPane().add(P2);
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(l6);
		frame.setSize(522,556);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				char[] password1 = P1.getPassword();
                String passwordString1 = new String(password1);
                char[] password2 = P2.getPassword();
                String passwordString2 = new String(password2);
                if(passwordString1.equals(passwordString2)) 
                {
                	String filepath = "D:\\Deep.txt";
                	String f1 = tf1.getText();
                	String f2 = tf3.getText();
                	String f3 = tf2.getText();
                	String textToSave = "\nName: "+f1+"\nMobile No: "+f2+"\nMail Id: "+f3;
    			try 
    			{
    				FileWriter writer = new FileWriter(filepath, true);
    			    writer.write(textToSave);
			        writer.close();
			        System.out.println("Text saved to Notepad file successfully!");
    			}
    			catch(IOException e1) 
    			{
    				System.out.println("An error occurred: "+e1.getMessage());
    			}
    				tf1.setText("");
    				tf2.setText("");
    				tf3.setText("");
    				P1.setText("");
    				P2.setText("");
                }
                else 
                {
                	System.out.println("try Again...!!");
                }
			}
		});
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//// TODO Auto-generated method stub
		
	}
}