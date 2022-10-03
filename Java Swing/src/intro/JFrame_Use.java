package intro;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class JFrame_Use {
public static void main(String[] args) {
	/*
	 * 1. create frame (by defauly not visible and frame size zero but we an re size
	 * 2. do  frame visible 
	 * 3. frame size define
	 * 4. frame title set
	 * 5. Exit  action define
	 * 6. resize off(user can stretch it)
	 * 7. change icon of frame
	 * 8. set colour to frame
	 */
	// 1 // to create frame 
	JFrame frame = new JFrame();// by default not visible (false)
	
	// 2 // do  frame  visible
     frame.setVisible(true);
    
     // 3 //  frame size define
     frame.setSize(420,420);
     
     
    // 4// frame title set
     
     frame.setTitle("Hello Java Swing");
     
     // 5. Exit  action define
     // tell what my exit button do currently in frame
     // this all variable are static so call by class name 
     // class WindowConstants
     // JFrame inherits WindowConstants
     frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     // 0 do nothing, exit will do nothing and  it like operation not working (not responding) and
     // appliction also not stop runing
     
     frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // 1 frame ek button (-)
     // application window close but application run in background
     
     
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//  == 3 
    // application entirely close this argument;// terminate
      
//    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //  == 2
    
    
    // 6 // resize off(user can stretch it)
    
    frame.setResizable(false);
    // minimize  not  happen now , resizing ,streching frame(window) not possible
    
    
    // 7 // change icon of frame, currently java icon is there.
    // first copy image to project. as file
    // ImageIcon is an class that create logo for us;
    
    ImageIcon image = new ImageIcon("logo.png");// logo is created
    // image reference of that object taht have that logo image
    image = new ImageIcon("2021-08-16.jpg");
    frame.setIconImage(image.getImage());
    
    
    
    
    // 8 //  set colour to frame
    
    frame.getContentPane().setBackground(Color.DARK_GRAY);
    
    // just think about RGB colour and contrast it usin no 0 to 255.
    // make combining colour by mixing no. of RGB
    // Colour c = new color (R,G,B) combination
    Color c = new Color(200,200,200);
    new Color (255,0,0);
    new Color (0,255,0);
    new Color (0,0,255);
    new Color (0,0,100); // navy blue
    frame.getContentPane().setBackground(new Color (0,0,100));// new color (red,gern,blue) combination
    
    
    //hexadecimal 
    new Color (0x000000);// black
    new Color (0xffffff);// white
    new Color (0xFFFFFF);// white
    frame.getContentPane().setBackground(new Color (0x123456));// new color (R,G,B) combination
    
}

}














