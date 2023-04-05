package com.d044;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Project implements ActionListener
{
	JFrame frame;
	JLabel l1;
	JButton b1;
	JCheckBox chb1,chb2,chb3,chb4,chb5,chb6,chb7,chb8,chb9;
	
	
	public Project()
	{
		frame = new JFrame ("Cafe Shop");
		
		l1 = new JLabel("Food Adda");
		l1.setBounds(199, 11, 146, 14);
		
		chb1 = new JCheckBox("Pizza @ Rs. 130");
		chb1.setBounds(64, 40, 197, 23);
		
		chb2 = new JCheckBox("Pasta @ Rs. 230");
		chb2.setBounds(64, 80, 197, 23);
		
		chb3 = new JCheckBox("Burger @ Rs. 100");
		chb3.setBounds(64, 120, 197, 23);
		
		chb4 = new JCheckBox("Cheese Sandwich @ Rs. 250");
		chb4.setBounds(64, 160, 197, 23);
		
		chb5 = new JCheckBox("Coco-Cola @ Rs. 20");
		chb5.setBounds(64, 200, 197, 23);
		
		chb6 = new JCheckBox("Pepsi @ Rs. 30");
		chb6.setBounds(64, 240, 197, 23);
		
		chb7 = new JCheckBox("Thumbs up @ Rs. 20");
		chb7.setBounds(64, 280, 197, 23);
		
		chb8 = new JCheckBox("7up @ Rs. 20");
		chb8.setBounds(64, 320, 197, 23);
		
		chb9 = new JCheckBox("Sprite @ Rs. 20");
		chb9.setBounds(64, 360, 197, 23);
		
		b1 = new JButton("Order");
		b1.setBounds(174, 399, 89, 23);
		
		b1.addActionListener(this);
		
		frame.add(l1);
		frame.add(chb1);
		frame.add(chb2);
		frame.add(chb3);
		frame.add(chb4);
		frame.add(chb5);
		frame.add(chb6);
		frame.add(chb7);
		frame.add(chb8);
		frame.add(chb9);
		frame.add(b1);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Project();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			StringBuffer b =new StringBuffer();
			b.append("\n selected Items");
			int total =0;
			
			if(chb1.isSelected())
			{
				b.append("\n Pizza - Rs.130");
				total+=130;
			}
			if(chb2.isSelected())
			{
				b.append("\n Pasta - Rs.230");
				total+=230;
			}
			if(chb3.isSelected())
			{
				b.append("\n Burger - Rs.100");
				total+=100;
			}
			if(chb4.isSelected())
			{
				b.append("\n Cheese Sandwich - Rs.250");
				total+=250;
			}
			if(chb5.isSelected())
			{
				b.append("\n Coco-Cola - Rs.20");
				total+=20;
			}
			if(chb6.isSelected())
			{
				b.append("\n Pepsi- Rs.30");
				total+=30;
			}
			if(chb7.isSelected())
			{
				b.append("\n Thumbs up - Rs.20");
				total+=20;
			}
			if(chb8.isSelected())
			{
				b.append("\n 7up - Rs.20");
				total+=20;
			}
			if(chb9.isSelected())
			{
				b.append("\n Sprite - Rs.20");
				total+=20;
			}
			StringBuffer total2 =new StringBuffer("");
			total2.append(b);
			total2.append("\n Total: "+total);
			JOptionPane.showMessageDialog(frame,total2.toString());
			
		}
		
	}

}