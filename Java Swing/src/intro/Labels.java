package intro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

	public static void main(String[] args) {
		
	Border b = BorderFactory.createLineBorder(Color.cyan,5); // color , size
	
	
	JLabel label = new JLabel();// new JLabel("Hi Honeshwar");
	label.setText("Hi Honeshwar");
//	label.setIcon(new ImageIcon("logo.png"));//
	
//	label.setHorizontalTextPosition(JLabel.LEADING);// set text position right, left ,centre of image
	label.setHorizontalAlignment(JLabel.CENTER);// label ke position batayaga
//	label.setVerticalTextPosition(JLabel.BOTTOM); set text position top, bottom ,centre of image
	
	label.setFont(new Font("ITALIAN",0, 20));
	label.setForeground(new Color(255,255,255));// customize color
	
	label.setBackground(new Color(0x123456));// set color  upper of frame color
	label.setOpaque(true);
	
	label.setBorder(b);
	label.setBounds(100,100,250,250);// label ko set at particular x,y coordinate and size fixed (x,y,L,B)
	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(500,500);
	frame.setResizable(false);
	frame.setTitle("Labels");
	frame.setDefaultCloseOperation(3);// EXIT_ON_CLOSE
	frame.add(label);
    frame.setBackground(new Color(255,255,255));


      frame.setLayout(null); // null means no layout of frame so now we can create label with fixed size otherwise label take entire frame

      // another way to create enlarged strech label , first is set bound wala se upper walaS
      //	  frame.pack(); // our label fixed to frame size
	
	
	}
	
}
