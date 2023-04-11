package com.a064;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Project1 implements ItemListener
{
	JFrame frame;
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JTextField t1,t2,t3,t4;
	JRadioButton r1,r2;
	JPasswordField p1,p2;
	JButton b1;
	String courses[]= {"ME/M Tect","B Tect","BBA"};
	JComboBox<String> combo;
	String branch[]= {"Computer Science Engineering","Chemical Engineering","Electrical Engineering"};
	JComboBox<String> combo1;
	String semester[]= {"1","2","3","4","5","6","7","8"};
	JComboBox<String> combo2;
	String gender;
	String course;
	String Branch;
	String Semester;
	
	public Project1()
	{
		frame = new JFrame();
		
		l = new JLabel("REGISTER A NEW STUDENT");
		l.setBounds(170, 21, 348, 13);
		l.setForeground(new Color(255, 128, 128));
		l.setFont(new Font("Tahoma",Font.BOLD, 15));
		
		l1 = new JLabel("Name");
		l1.setBounds(71, 74, 45, 13);
		l1.setFont(new Font("Tahoma",Font.BOLD, 15));
		t1 = new  JTextField();
		t1.setBounds(182, 73, 268, 19);
		
		l2 = new JLabel("DOB");
		l2.setBounds(71, 122, 45, 13);
		l2.setFont(new Font("Tahoma",Font.BOLD, 15));
		t2 = new JTextField();
		t2.setBounds(182, 121, 268, 19);
		
		l3 = new JLabel("Gender");
		l3.setBounds(71, 169, 63, 13);
		l3.setFont(new Font("Tahoma",Font.BOLD, 15));
		r1 =new JRadioButton("Male");
		r1.setBounds(182, 167, 103, 21);
		r2 =new JRadioButton("Female");
		r2.setBounds(298, 165, 103, 21);
		
		l4 = new JLabel("Mail id");
		l4.setBounds(71, 215, 63, 13);
		l4.setFont(new Font("Tahoma",Font.BOLD, 15));
		t3 = new JTextField();
		t3.setBounds(182, 214, 268, 19);
		
		l5 = new JLabel("Mobile no");
		l5.setBounds(71, 269, 75, 13);
		l5.setFont(new Font("Tahoma",Font.BOLD, 15));
		t4 = new JTextField();
		t4.setBounds(182, 268, 268, 19);
		
		l6 = new JLabel("Password");
		l6.setBounds(71, 313, 84, 13);
		l6.setFont(new Font("Tahoma",Font.BOLD, 15));
		p1 = new JPasswordField("");
		p1.setBounds(182, 312, 268, 19);
		
		l7 = new JLabel("Re-Password");
		l7.setBounds(71, 362, 103, 13);
		l7.setFont(new Font("Tahoma",Font.BOLD, 15));
		p2 = new JPasswordField("");
		p2.setBounds(182, 361, 268, 19);
		
		l8 = new JLabel("Courses");
		l8.setBounds(71, 409, 70, 13);
		l8.setFont(new Font("Tahoma",Font.BOLD, 15));
		combo =new JComboBox<String>(courses);
		combo.setBounds(182, 407, 219, 21);
		
		l9 = new JLabel("Branch");
		l9.setBounds(71, 454, 63, 13);
		l9.setFont(new Font("Tahoma",Font.BOLD, 15));
		combo1=new JComboBox<String>(branch);
		combo1.setBounds(182, 452, 219, 21);
		
		l10 = new JLabel("Semester");
		l10.setBounds(71, 497, 84, 13);
		l10.setFont(new Font("Tahoma",Font.BOLD, 15));
		combo2 =new JComboBox<String>(semester);
		combo2.setBounds(182, 495, 219, 21);
		
		b1 = new JButton("Register");
		b1.setBounds(182, 541, 140, 21);
		b1.setFont(new Font("Tahoma",Font.BOLD, 14));
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		r1.addItemListener(this);
		r2.addItemListener(this);
		
		combo.addItemListener(this);
		
		
		combo1.addItemListener(this);
		
		
		combo2.addItemListener(this);
		
		
		frame.add(l);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(l7);
		frame.add(l8);
		frame.add(l9);
		frame.add(l10);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(p1);
		frame.add(p2);
		frame.add(b1);
		frame.add(r1);
		frame.add(r2);
		frame.add(combo);
		frame.add(combo1);
		frame.add(combo2);
		
		frame.setSize(800, 800);
		frame.setLayout(null);
		frame.setVisible(true);
	
		b1.addActionListener(new ActionListener() 
		{

	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		try 
		{
			String name=t1.getText().toString();
			String dob=t2.getText().toString();
			String mail=t3.getText().toString();
			String mob=t4.getText().toString();
			String pass=p1.getText().toString();
			String repass=p2.getText().toString();
			
			String name1="\n Your Name is :";
			String dob1="\n Your DOB is :";
			String gender1 ="\n Your Gender is: ";
			String mail1="\n Your Mail Id is :";
			String mob1="\n Your Mobile is: ";
			String pass1="\n Your Pass is : ";
			String repass1="\n Your Repass is: ";
			String course1="\n Your Course is:";
			String Branch1="\n Your Branch is:";
			String Semester1="\n Your Semester is:";
			
			
			if(pass.equals(repass))
			{
				FileOutputStream fout =new FileOutputStream("E://Deep.txt");
				
				fout.write(name1.getBytes());
				fout.write(name.getBytes());
				fout.write(dob1.getBytes());
				fout.write(dob.getBytes());
				fout.write(gender1.getBytes());
				fout.write(gender.getBytes());
				fout.write(mail1.getBytes());
				fout.write(mail.getBytes());
				fout.write(mob1.getBytes());
				fout.write(mob.getBytes());
				fout.write(pass1.getBytes());
				fout.write(pass.getBytes());
				fout.write(repass1.getBytes());
				fout.write(repass.getBytes());
				fout.write(course1.getBytes());
				fout.write(course.getBytes());
				fout.write(Branch1.getBytes());
				fout.write(Branch.getBytes());
				fout.write(Semester1.getBytes());
				fout.write(Semester.getBytes());
				
				System.out.println("Success");
			}
			else
			{
				System.out.println("Password and repassword are not same");
			}
			 
			
		}
		catch (Exception e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
	}

});
}
public static void main(String[] args) 
{
	new Project1();
}
@Override
public void itemStateChanged(ItemEvent e) 
{
	// TODO Auto-generated method stub
	if(e.getSource() == r1)
	{
		//JOptionPane.showMessageDialog(frame, "Male");
		gender = "Male";
	}
	
	if(e.getSource() == r2)
	{
		//JOptionPane.showMessageDialog(frame, "Female");
		gender = "Female";
	}
	if(e.getSource()==combo)
	{
		
		course=combo.getItemAt(combo.getSelectedIndex());
		
	}
	if(e.getSource()==combo1)
	{
		
		Branch=combo1.getItemAt(combo1.getSelectedIndex());
		
	}
	if(e.getSource()==combo2)
	{
		
		Semester=combo2.getItemAt(combo2.getSelectedIndex());
		
	}
	
}
}


