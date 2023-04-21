
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSet;

import java.sql.PreparedStatement;

public class Reg {
	JFrame frame;
	JLabel l1, l2, l3, l4, l5, l6;
	JButton b1, b2, b3, b4, b5;
	JTextField t1, t2, t3, t4;
	JRadioButton r1, r2;
	ButtonGroup bg;
	JPanel jp, jp2;
	private JScrollPane scrollPane_1;
	private JScrollPane scrollPane;
	private JTable table;

	public Reg() throws ClassNotFoundException, SQLException {
		frame = new JFrame();

		l1 = new JLabel("Registration Form");
		l1.setBounds(21, 10, 207, 23);
		l1.setFont(new Font("Tahoma", Font.BOLD, 21));

		l2 = new JLabel("ID");
		l2.setBounds(10, 55, 84, 23);
		l2.setFont(new Font("Tahoma", Font.BOLD, 17));
		t1 = new JTextField();
		t1.setBounds(89, 55, 126, 24);

		l3 = new JLabel("Name");
		l3.setBounds(10, 95, 84, 23);
		l3.setFont(new Font("Tahoma", Font.BOLD, 17));
		t2 = new JTextField();
		t2.setBounds(89, 100, 126, 24);

		l4 = new JLabel("Gender");
		l4.setBounds(10, 135, 84, 23);
		l4.setFont(new Font("Tahoma", Font.BOLD, 17));
		r1 = new JRadioButton("Male");
		r1.setBounds(89, 139, 59, 21);
		r1.setFont(new Font("Tahoma", Font.BOLD, 14));
		r2 = new JRadioButton("Female");
		r2.setBounds(150, 139, 103, 21);
		r2.setFont(new Font("Tahoma", Font.BOLD, 14));

		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		l5 = new JLabel("Address");
		l5.setBounds(10, 175, 84, 23);
		l5.setFont(new Font("Tahoma", Font.BOLD, 17));
		t3 = new JTextField();
		t3.setBounds(89, 180, 126, 24);

		l6 = new JLabel("Contact");
		l6.setBounds(10, 215, 84, 23);
		l6.setFont(new Font("Tahoma", Font.BOLD, 17));
		t4 = new JTextField();
		t4.setBounds(89, 220, 126, 24);

		b1 = new JButton("Exit");
		b1.setBounds(10, 272, 99, 25);

		b2 = new JButton("Register");
		b2.setBounds(119, 272, 126, 25);

		b3 = new JButton("Delete");
		b3.setBounds(10, 307, 99, 25);

		b4 = new JButton("Update");
		b4.setBounds(119, 307, 126, 25);

		b5 = new JButton("Reset");
		b5.setBounds(74, 341, 99, 21);

		/*
		 * jp =new JPanel(); jp.setBounds(500, 500, 100, 100); jp.setBorder(new
		 * LineBorder(new Color(0, 0, 0))); jp.add(b1); jp.setVisible(true);
		 */
		
		
		
		
		/*
		 * //frame = new JFrame(); frame.setBounds(100, 100, 840, 507);
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * 
		 * jp = new JPanel(); //jp.setBorder(new LineBorder(new Color(0, 0, 0)));
		 * //frame.getContentPane().add(panel, BorderLayout.CENTER);
		 * 
		 * scrollPane_1 = new JScrollPane(); jp.add(scrollPane_1);
		 * 
		 * 
		 * scrollPane = new JScrollPane(); panel.add(scrollPane);
		 * scrollPane.setEnabled(false);
		 * 
		 * 
		 * table = new JTable(); scrollPane.setViewportView(table);
		 * table.setForeground(Color.WHITE); table.setEnabled(false); table.setModel(new
		 * DefaultTableModel( new Object[][] { }, new String[] { "S.No", "ID", "Name",
		 * "Gender", "Address", "Contact" } ) { Class[] columnTypes = new Class[] {
		 * Integer.class, Integer.class, String.class, String.class, String.class,
		 * Integer.class }; public Class getColumnClass(int columnIndex) { return
		 * columnTypes[columnIndex]; } });
		 */

		frame.add(jp);
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(r1);
		frame.add(r2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.setSize(913, 478);
		frame.setLayout(null);
		frame.setVisible(true);
		table.getColumnModel().getColumn(0).setMinWidth(36);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setToolTipText("");
		table.setBackground(Color.WHITE);
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Reg();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					data_table window = new data_table();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
