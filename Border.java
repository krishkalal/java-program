import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Border implements ActionListener
{
	public static int top, bottom, right, left, center;
	public static JPanel Top, Left, Center, pRight, Bottom;
	public static JFrame jf;
	
	
	
	
	public static void main(String args[])
	{
		Border obj = new Border();
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");    
		}
		catch(Exception e)
		{
			System.err.println("Look and feel not set.");
		}
		
		jf = new JFrame("Krish Panel");
		
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        obj.addComponents(jf.getContentPane());
		
        jf.pack();
        jf.setVisible(true);
	}
	
	
	public static void addComponents(Container container)
	{
		Top = new JPanel(new FlowLayout());
		Top.setSize(new Dimension(30, 50));
		Top.setBorder(BorderFactory.createLineBorder(Color.black));
		container.add(Top, BorderLayout.NORTH);
	
		JPanel subTop = new JPanel(new FlowLayout());
		subTop.setSize(new Dimension(300, 500));
		subTop.setBorder(BorderFactory.createLineBorder(Color.RED));
		Top.add(subTop, BorderLayout.NORTH);
		
		JCheckBox Top_Chek = new JCheckBox(" Top     ");
		Top_Chek.setBounds(10, 10, 20, 20);
		Top_Chek.setName("Top_Chek");
		Top_Chek.addActionListener(new Border());   //  new BtnClickListener()
		subTop.add(Top_Chek);
		
		
		
	
		JButton btn1 = new JButton("RED");
        btn1.setName("RED");
		btn1.addActionListener(new Border());
		//btn1.addActionListener(this);
		Top.add(btn1);
		
        JButton btn2 = new JButton("YELLOW");
		btn2.setName("YELLOW");
		btn2.addActionListener(new Border());
		//btn2.addActionListener(this);
        Top.add(btn2);
        
        JButton btn3 = new JButton("BLUE");
		btn3.setName("BLUE");
		btn3.addActionListener(new Border());
		//btn3.addActionListener(this);
        Top.add(btn3);
    
	
	

			
        JButton btn4 = new JButton("GREEN");
		btn4.setName("GREEN");
		btn4.addActionListener(new Border());
		//btn4.addActionListener(this);
        Top.add(btn4);
		
        JButton btn5 = new JButton("ORANGE");
		btn5.setName("ORANGE");
		btn5.addActionListener(new Border());
		//btn5.addActionListener(this);
        Top.add(btn5);
		
		Left = new JPanel(new FlowLayout());
		Left.setSize(new Dimension(250, 600));
		Left.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		container.add(Left, BorderLayout.LINE_START);
		
		
		JCheckBox Left_Chek = new JCheckBox(" Left ");
		Left_Chek.setBounds(10, 10, 20, 20);
		Left_Chek.setName("Left_Chek");
		Left_Chek.addActionListener(new Border());
		//Left_Chek.addActionListener(this);
		Left.add(Left_Chek);
		
		
		
		
		Center = new JPanel(new FlowLayout());
		Center.setSize(new Dimension(250, 600));
		Center.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		container.add(Center, BorderLayout.CENTER);
		
		
		JCheckBox Center_Chek = new JCheckBox(" Center ");
		Center_Chek.setBounds(10, 10, 20, 20);
		Center_Chek.setName("Center_Chek");
		Center_Chek.addActionListener(new Border());
		//Center_Chek.addActionListener(this);
		Center.add(Center_Chek);
		
		
		
		
		pRight = new JPanel(new FlowLayout());
		pRight.setSize(new Dimension(250, 600));
		pRight.setBorder(BorderFactory.createLineBorder(Color.PINK));
		container.add(pRight, BorderLayout.LINE_END);
		
		
		JCheckBox Right_Chek = new JCheckBox(" Right ");
		Right_Chek.setBounds(10, 10, 20, 20);
		Right_Chek.setName("Right_Chek");
		Right_Chek.addActionListener(new Border());
		//Right_Chek.addActionListener(this);
		pRight.add(Right_Chek, BorderLayout.LINE_END);
		
		
		Bottom = new JPanel(new FlowLayout());
		Bottom.setSize(new Dimension(250, 600));
		Bottom.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		container.add(Bottom, BorderLayout.PAGE_END);
		
		
		JCheckBox Bottom_Chek = new JCheckBox(" Bottom ");
		Bottom_Chek.setBounds(10, 10, 20, 20);
		Bottom_Chek.setName("Bottom_Chek");
		Bottom_Chek.addActionListener(new Border());
		//Bottom_Chek.addActionListener(this);
		Bottom.add(Bottom_Chek, BorderLayout.CENTER);
		
    }
	
	
	public void actionPerformed(ActionEvent event)
	{
		JComponent comp = (JComponent)event.getSource();
		System.out.println(comp.getName() + " has been Clicked...!!!");
		//JOptionPane.showMessageDialog(null,comp.getName() + " has been Clicked...!!!");
		 
		if(event.getSource() instanceof JButton)
		{
			JButton b = (JButton)event.getSource();
			Color selectedColor = Color.WHITE;
		
			if(b.getText().equals("RED"))
				selectedColor = Color.RED;
			else if(b.getText().equals("YELLOW"))
				selectedColor = Color.YELLOW;
			else if(b.getText().equals("BLUE"))
				selectedColor = Color.BLUE;
			else if(b.getText().equals("GREEN"))
				selectedColor = Color.GREEN;
			else if(b.getText().equals("ORANGE"))
				selectedColor = Color.ORANGE;
			
			
			if(top == 1)
			 	Top.setBackground(selectedColor);
			
			if(left == 1)
			 	Left.setBackground(selectedColor);
			
			if(center == 1)
			 	Center.setBackground(selectedColor);
			
			if(right == 1)
			 	pRight.setBackground(selectedColor);
			
			if(bottom == 1)
			 	Bottom.setBackground(selectedColor);
		
		}
		
		else if(event.getSource() instanceof JCheckBox)
		{
			JCheckBox chk = (JCheckBox)event.getSource();
			
			if(chk.getName().equals("Top_Chek"))
			{
				if(chk.isSelected())
					top = 1;
				else
					top = 0;
			}
			
			else if(chk.getName().equals("Left_Chek"))
			{
				if(chk.isSelected())
					left = 1;
				else
					left = 0;
			}
			
			else if(chk.getName().equals("Center_Chek"))
			{
				if(chk.isSelected())
					center = 1;
				else
					center = 0;
			}
			
			else if(chk.getName().equals("Right_Chek"))
			{
				if(chk.isSelected())
					right = 1;
				else
					right = 0;
			}
			
			else if(chk.getName().equals("Bottom_Chek"))
			{
				if(chk.isSelected())
					bottom = 1;
				else
					bottom = 0;
			}
		}	
	} 

	
}
