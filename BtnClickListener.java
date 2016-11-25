import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BtnClickListener implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		JComponent comp = (JComponent)event.getSource();
		if(event.getSource()==comp)
		setBackground(new Color(Color.GREEN));
		System.out.println("Button " + comp.getName() + " has been Clicked...!!!");
		JOptionPane.showMessageDialog(null,comp.getName() + " has been Clicked...!!!");
	}
}