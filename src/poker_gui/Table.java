/**
 * --Implement a GridLayout for the layout manage
 * 		>> set locations for each player and their cards 
 * 		>> set center location for table cards 
 */

package poker_gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Table extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private Color tableGreen = new Color(0, 75, 0, 255);
	
	public Table(String img, int width, int height){
		super("Poker");
		BufferedImage bg;	
		try{
			//retrieve image file, read and set to background of JFrame
			bg = ImageIO.read(new File(img));
			setContentPane(new JLabel(new ImageIcon(bg)));
			pack();
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setLayout(new GridLayout()); // still need to set number of rows and cols and spacing 
			setVisible(true);
		}	
		catch (IOException e){
			// create a green background instead
			e.printStackTrace();
			setSize(width, height);
			setResizable(false);
			getContentPane().setBackground(tableGreen);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		}		
	}
	
	
}
