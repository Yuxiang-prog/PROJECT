import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

import org.graalvm.compiler.replacements.SnippetTemplate.UsageReplacer;

public class start
{

	public static void main(String[]args)
	{
			final JFrame window = new JFrame();

			JButton button = new JButton();
			button.setText("Click me to start having fun");
			window.add(button);  
			window.setVisible(true);
			button.addActionListener(new java.awt.event.ActionListener()
			{
				@Override
				public void actionPerformed(java.awt.event.ActionEvent evt)
				{
					String name = JOptionPane.showInpputDialog(window, "What is your definition of fun?", null);
					//ok Mikhail let me set up this github thing and then I have to go srry
				}
			});
      
      }
}
