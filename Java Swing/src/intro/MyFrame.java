package intro;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame extends JFrame {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/*
 * way to wrinte code  code in an class do encapsulation , and
 * run on another class so runing dont include too much code
 * 
 * 2. we extends JFrame class and make parent class for it
 * 3. i create an class that inherit JFrame class
 * 4. so i can create my frame 
 */
	
	public MyFrame() {
//		Jthis this = new Jthis();// by default not visible (false)
		
		// 2 // do  this  visible
	     this.setVisible(true);
	    
	     // 3 //  this size define
	     this.setSize(420,420);
	     
	     
	    // 4// this title set
	     
	     this.setTitle("Hello Java Swing");
	     
	     // 5. Exit  action define
	     // tell what my exit button do currently in this
	     // this all variable are static so call by class name 
	     // class WindowConstants
	     // Jthis inherits WindowConstants
	     this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	     // 0 do nothing, exit will do nothing and  it like operation not working (not responding) and
	     // appliction also not stop runing
	     
	     this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // 1 this ek button (-)
	     // application window close but application run in background
	     
	     
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//  == 3 
	    // application entirely close this argument;// terminate
	      
//	    this.setDefaultCloseOperation(Jthis.DISPOSE_ON_CLOSE); //  == 2
	    
	    
	    // 6 // resize off(user can stretch it)
	    
	    this.setResizable(false);
	    // minimize  not  happen now , resizing ,streching this(window) not possible
	    
	    
	    // 7 // change icon of this, currently java icon is there.
	    // first copy image to project. as file
	    // ImageIcon is an class that create logo for us;
	    
	    ImageIcon image = new ImageIcon("logo.png");// logo is created
	    // image reference of that object taht have that logo image
	    image = new ImageIcon("2021-08-16.jpg");
	    this.setIconImage(image.getImage());
	    
	    
	    
	    
	    // 8 //  set colour to this
	    
	    this.getContentPane().setBackground(Color.DARK_GRAY);
	    
	    // just think about RGB colour and contrast it usin no 0 to 255.
	    // make combining colour by mixing no. of RGB
	    // Colour c = new color (R,G,B) combination
	    Color c = new Color(200,200,200);
	    new Color (255,0,0);
	    new Color (0,255,0);
	    new Color (0,0,255);
	    new Color (0,0,100); // navy blue
	    this.getContentPane().setBackground(new Color (0,0,100));// new color (red,gern,blue) combination
	    
	    
	    //hexadecimal 
	    new Color (0x000000);// black
	    new Color (0xffffff);// white
	    new Color (0xFFFFFF);// white
	    this.getContentPane().setBackground(new Color (0x123456));// new color (R,G,B) combination
	    
		
	}
	
	
}
