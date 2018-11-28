import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class WIndow extends JFrame implements ActionListener {
	
	JTextField width,length;
	JButton button;
	JTextArea text;
	Rectangle r;
	
	 public WIndow() {
	
		 r = new Rectangle();

		 JPanel p=new JPanel();
		 
		 p.add(new JLabel("width"));
		 width=new JTextField(7);
		 p.add(width);
		 
		 p.add(new JLabel("length"));
		 length=new JTextField(7);
		 p.add(length);
		 
		 button=new JButton("calcu");
		 button.addActionListener(this);
		 p.add(button);
		 
		 this.getContentPane().add(p,"North");
		 text=new JTextArea(3,3);
		 this.getContentPane().add(text);
		 
		 this.setVisible(true);
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
	}


	public void actionPerformed(ActionEvent e) {
	
		try {
			int length0=Integer.parseInt(length.getText());
			int width0=Integer.parseInt(width.getText());
			
			r.setlength(length0);
			r.setwidth(width0);
			
			text.append(String.valueOf(r.area()));

		}catch(Exception ex) {
			text.append("can not calculate it");
		}
		
		
	}

	
	
	
}
