package Levels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;



public class Level{
	
		public final int GAME_WIDTH = 1300;
		public final int GAME_HEIGHT = 650;
		
		public final int PLAYER_WIDTH = 85;
		public final int PLAYER_HEIGHT = 80;
		
		ImageIcon image1 = new ImageIcon("dirt.png");

		ImageIcon image2 = new ImageIcon("floatingdirt.png");
		
		ImageIcon monkeyImage = new ImageIcon("Monkey.png");
		
		
		ImageIcon forest = new ImageIcon("forest.png");
		ImageIcon forest2 = new ImageIcon("forest2.png");
		
		JFrame frame = new JFrame();
		
		//Player
		JPanel Player = new JPanel();
		
		JLabel monkeyLabel = new JLabel();
	
		//level 1
		JLabel background1 = new JLabel();
		
		
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		JLabel label3_1 = new JLabel();
		
		JPanel panel1 = new JPanel();
		//////////////
		
		//level 2
		JLabel background2 = new JLabel();
		
		JLabel label4 = new JLabel();
		JLabel label5 = new JLabel();
		JLabel label6 = new JLabel();
		JLabel label7 = new JLabel();
		JLabel label8 = new JLabel();
		JLabel label9 = new JLabel();
		
	
		
		JPanel panel2 = new JPanel();
		
		JPanel homePanel = new JPanel();
		
		JLabel welcomeText = new JLabel("Welcome");
		
		///////////////
		
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu settings = new JMenu("Settings");
		JMenu levels = new JMenu("Levels");
		
		JMenuItem level1 = new JMenuItem("Level 1");
		JMenuItem level2 = new JMenuItem("Level 2");
		
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem home = new JMenuItem("Home");
		
	
		public Level(){
			
			
			frame.setSize(GAME_WIDTH,GAME_HEIGHT);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setTitle("Platformer 2D Game");
			frame.setLayout(null);
			
			homePanel.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
			homePanel.setBackground(Color.orange);
			
				
			panel1.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
			panel1.setBackground(Color.gray);
			panel1.setLayout(null);
			
			panel2.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
			panel2.setBackground(Color.pink);
			panel2.setLayout(null);
			
			
			
			
			
			level1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					background1.setIcon(forest);
					background1.setBounds(0, -60, GAME_WIDTH, GAME_HEIGHT);
					
					label1.setIcon(image1);
					label1.setBounds(0, 470, image1.getIconWidth(), image1.getIconHeight());
					
					label2.setIcon(image1);
					label2.setBounds(360, 410,image1.getIconWidth(), image1.getIconHeight());
					
					label3.setIcon(image1);
					label3.setBounds(750, 450, image1.getIconWidth(), image1.getIconHeight());
					
					label3_1.setIcon(image1);
					label3_1.setBounds(1005, 450, image1.getIconWidth(), image1.getIconHeight());
					
					
					//Player.setBackground(Color.red);
					Player.setBounds(5, 390, PLAYER_WIDTH, PLAYER_HEIGHT);
					
					monkeyLabel.setIcon(monkeyImage);
					monkeyLabel.setBounds(5, 390, PLAYER_WIDTH, PLAYER_HEIGHT);
					
					panel1.add(monkeyLabel);
					
					
					panel1.add(label1);
					panel1.add(label2);
					panel1.add(label3);
					panel1.add(label3_1);
					
					//panel1.add(Player);
					
					panel1.add(background1);
					
					homePanel.setVisible(false);
					panel2.setVisible(false);
					panel1.setVisible(true);
					frame.add(panel1);
					frame.repaint();
				}
			});
			
			level2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					background2.setIcon(forest2);
					background2.setBounds(0, -30, GAME_WIDTH, GAME_HEIGHT);
					
					label4.setIcon(image2);
					label4.setBounds(0, 80, image2.getIconWidth(), image2.getIconHeight());
					
					label5.setIcon(image2);
					label5.setBounds(230, 310,image2.getIconWidth(), image2.getIconHeight());
					
					label6.setIcon(image2);
					label6.setBounds(450, 270, image2.getIconWidth(), image2.getIconHeight());
					
					label7.setIcon(image2);
					label7.setBounds(670, 230, image2.getIconWidth(), image2.getIconHeight());
					
					label8.setIcon(image2);
					label8.setBounds(880, 180, image2.getIconWidth(), image2.getIconHeight());
					
					label9.setIcon(image2);
					label9.setBounds(1100, 150, image2.getIconWidth(), image2.getIconHeight());
					
				
					
					//Player.setBackground(Color.red);
					Player.setBounds(15, 10, PLAYER_WIDTH, PLAYER_HEIGHT);
					
					monkeyLabel.setIcon(monkeyImage);
					monkeyLabel.setBounds(15, 4, PLAYER_WIDTH, PLAYER_HEIGHT);
					
					
					
					panel2.add(label4);
					panel2.add(label5);
					panel2.add(label6);
					panel2.add(label7);
					panel2.add(label8);
					panel2.add(label9);
				
					panel2.add(monkeyLabel);
					//panel2.add(Player);
					
					panel2.add(background2);
					
					
					homePanel.setVisible(false);
					panel1.setVisible(false);
					panel2.setVisible(true);
					frame.add(panel2);
					frame.repaint();
				}
			});
			
			
			
			
			
			
			frame.addKeyListener(new KeyListener() {
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					switch(e.getKeyChar()) {
					case 'a': monkeyLabel.setBounds(monkeyLabel.getX()-10, monkeyLabel.getY(), PLAYER_WIDTH, PLAYER_HEIGHT);
					break;
					case 'd': monkeyLabel.setBounds(monkeyLabel.getX()+10, monkeyLabel.getY(), PLAYER_WIDTH, PLAYER_HEIGHT);
					break;
					case 'w': monkeyLabel.setBounds(monkeyLabel.getX(), monkeyLabel.getY()-10, PLAYER_WIDTH, PLAYER_HEIGHT);
					break;
					case 's': monkeyLabel.setBounds(monkeyLabel.getX(), monkeyLabel.getY()+10, PLAYER_WIDTH, PLAYER_HEIGHT);
					break;
					default:
						System.out.println("Error");
					break;
				}
				}
			});
			
			exit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.exit(0);
				}
			});
			
			home.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					homePanel.setVisible(true);
				}
			});
			
			
			welcomeText.setFont(new Font("times new roman", Font.BOLD , 70));
			welcomeText.setVerticalAlignment(JLabel.CENTER);
			
			
			homePanel.add(welcomeText);
			
			settings.add(home);
			settings.add(exit);
			levels.add(level1);
			levels.add(level2);
			menuBar.add(settings);
			menuBar.add(levels);
			frame.setJMenuBar(menuBar);
			
			//Player.add(monkeyLabel);
			
			frame.add(homePanel);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
		}
		
		
	
		
		
		

		
}
























