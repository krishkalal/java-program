import javax.swing.*;
import java.awt.*;

public class Border
{
	public static void addComponentsToPane(Container container)
	{
		JPanel p = new JPanel(new BorderLayout());
		//p.setSize(new Dimension(30,30));
		p.setBorder(BorderFactory.createLineBorder(Color.RED));
		container.add(p, BorderLayout.LINE_START);
		
		JPanel d = new JPanel(new FlowLayout());
		//d.setSize(new Dimension(250,250));
		d.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		container.add(d, BorderLayout.PAGE_START);
		
		
		JPanel e = new JPanel(new FlowLayout());
		//e.setSize(new Dimension(250,250));
		e.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		container.add(e, BorderLayout.LINE_END);
		
		
		JPanel z = new JPanel(new FlowLayout());
		//z.setSize(new Dimension(250,250));
		z.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
		container.add(z, BorderLayout.PAGE_END);
		
		
		JPanel k = new JPanel(new FlowLayout());
		//k.setSize(new Dimension(250,250));
		k.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
		//k.setPreferredSize(new Dimension(100,100));
		container.add(k, BorderLayout.CENTER);
	
		
		JButton btnTop = new JButton("RED");
        btnTop.setName("RED");
		btnTop.addActionListener(new BtnClickListener());
		if(e.getSource()==btn1)
		setBackground(new Color(Color.RED));
		p.add(btnTop,BorderLayout.NORTH);
		p.setBackground(Color.RED);
		
        JButton btnLeft = new JButton("YELLOW");
		btnLeft.setName("YELLOW");
		btnLeft.addActionListener(new BtnClickListener());
        p.add(btnLeft,BorderLayout.SOUTH);
        
        JButton btnCenter = new JButton("BLUE");
       // btnCenter.setPreferredSize(new Dimension(10,10));
		btnCenter.setName("BLUE");
		btnCenter.addActionListener(new BtnClickListener());
        p.add(btnCenter,BorderLayout.CENTER);
        
        JButton btnRight = new JButton("GREEN");
		btnRight.setName("GREEN");
		btnRight.addActionListener(new BtnClickListener());
        p.add(btnRight,BorderLayout.WEST);
		
        JButton btnBottom = new JButton("ORANGE");
		btnBottom.setName("ORANGE");
		btnBottom.addActionListener(new BtnClickListener());
        p.add(btnBottom, BorderLayout.EAST);
		
		
		
		
		
    }
	
	public static void main(String args[])
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");    //It Can be Multiple Look & Fill eg.Classic, etc.
		}
		catch(Exception e)
		{
			System.err.println("Look and feel not set.");
		}
		
		JFrame jf = new JFrame("MyPanel");
		
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        addComponentsToPane(jf.getContentPane());
		
        jf.pack();
        jf.setVisible(true);
	}	
}