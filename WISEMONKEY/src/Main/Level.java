package Main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.font.ImageGraphicAttribute;
import java.awt.geom.Area;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;



		public class Level extends Area{
			
			
			
			
				int a = 0;
				int key;
			
				public final int GAME_WIDTH = 1300;
				public final int GAME_HEIGHT = 650;
				
				public final int PLAYER_WIDTH = 90;
				public final int PLAYER_HEIGHT = 85;
				
				
				
				ImageIcon image1 = new ImageIcon("dirt.png");
				ImageIcon image2 = new ImageIcon("floatingdirt.png");
				
				ImageIcon jframeLogo = new ImageIcon("wiseMonkey.png");
				
				
				ImageIcon forest = new ImageIcon("forest.png");
				ImageIcon forest2 = new ImageIcon("ground.jpg");
				
				JFrame frame = new JFrame();
				
				//Player
				JLabel Player = new JLabel();
				
				ImageIcon monkey = new ImageIcon("414027763_3304413229859207_8729864401131733094_n.png");
				
				ImageIcon monkeyAttack = new ImageIcon("monkeyAttack.png");
				
				ImageIcon monkeyLeft = new ImageIcon("monkeyLeft.png");
				
				ImageIcon monkeyAttackLeft = new ImageIcon("monkeyAttackLeft.png");
				
				
				//Enemies
				
				//Lion
				JLabel Lion = new JLabel();
				
				
				
				ImageIcon LionImage = new ImageIcon("lion.png");
				
				//bear
				JLabel bear = new JLabel();
				
				ImageIcon bearImage = new ImageIcon("bear.png");
				
			
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
				
				JLabel welcomeText = new JLabel("Welcome ");
				
				///////////////
				
				JMenuBar menuBar = new JMenuBar();
				
				JMenu settings = new JMenu("Settings");
				JMenu levels = new JMenu("Levels");
				
				JMenuItem level1 = new JMenuItem("Level 1");
				JMenuItem level2 = new JMenuItem("Level 2");
				
				JMenuItem exit = new JMenuItem("Exit");
				JMenuItem home = new JMenuItem("Home");
				
				
				////////////////////////
				
				JButton start = new JButton("Start");
				
				JLabel logoLabel = new JLabel();
				
				public Level(){
					
					
					frame.setSize(GAME_WIDTH,GAME_HEIGHT);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setResizable(true);
					frame.setTitle("Platformer 2D Game");
					frame.setLayout(null);
					frame.setIconImage(jframeLogo.getImage());
					
					homePanel.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
					homePanel.setBackground(Color.orange);
					
						
					panel1.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
					panel1.setBackground(Color.gray);
					panel1.setLayout(null);
					
					panel2.setBounds(0, 0, GAME_WIDTH, GAME_HEIGHT);
					panel2.setBackground(Color.pink);
					panel2.setLayout(null);
					
					Player.setIcon(monkey);
					Lion.setIcon(LionImage);
					bear.setIcon(bearImage);
					
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
							
							
							Player.setBackground(Color.red);
							Player.setBounds(5, 390, PLAYER_WIDTH, PLAYER_HEIGHT);
							
							
							
							Lion.setBounds(550, 315,100, 100);
							
							bear.setBounds(1000, 350, 110, 100);
							
							panel1.add(bear);
							panel1.add(Lion);
							panel1.add(label1);
							panel1.add(label2);
							panel1.add(label3);
							panel1.add(label3_1);
							panel1.add(Player);
							
							
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
							
						
							
							Player.setBackground(Color.red);
							Player.setBounds(15, 3, PLAYER_WIDTH, PLAYER_HEIGHT);
							

							Lion.setBounds(450, 180,100, 100);
							
							bear.setBounds(880, 80, 110, 100);
							
							
							
							panel2.add(Lion);
							panel2.add(bear);
							panel2.add(label4);
							panel2.add(label5);
							panel2.add(label6);
							panel2.add(label7);
							panel2.add(label8);
							panel2.add(label9);
						
			
							panel2.add(Player);
							
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
							case 'a': Player.setBounds(Player.getX()-20, Player.getY(), PLAYER_WIDTH, PLAYER_HEIGHT);
							key = 1;
							Player.setIcon(monkeyLeft);
							Player.repaint();
							break;
							case 'd': Player.setBounds(Player.getX()+20, Player.getY(), PLAYER_WIDTH, PLAYER_HEIGHT);
							key = 0;
							Player.setIcon(monkey);
							Player.repaint();
							break;
							case 'w': Player.setBounds(Player.getX(), Player.getY()-80, PLAYER_WIDTH, PLAYER_HEIGHT);
							
							
							while(Player.getY()>=Player.getY()+50) {
								
								Player.setBounds(Player.getX(), Player.getY()-10, PLAYER_WIDTH, PLAYER_HEIGHT);
								Player.repaint();
								
								
							}
							
							Player.setIcon(monkey);
							Player.repaint();
							break;
							case 's': Player.setBounds(Player.getX(), Player.getY()+20, PLAYER_WIDTH, PLAYER_HEIGHT);
							Player.setIcon(monkey);
							Player.repaint();
							break;
							case 'r': Player.setBounds(Player.getX(), Player.getY(), PLAYER_WIDTH, PLAYER_HEIGHT);
				
										 a = 1;
									
										 
										while(a>0) {
											Player.setIcon(monkeyAttack);
											Player.repaint();
											a--;
										}
										
										if(key==1) {
											Player.setIcon(monkeyAttackLeft);
											Player.repaint();
										}else {
											Player.setIcon(monkeyAttack);
											Player.repaint();
										}
								
									
							break;
							default:
								System.out.println("either a, w,s,d, and t are functional");
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
					
					
					welcomeText.setBounds(450,-200,500,500);
					welcomeText.setFont(new Font("MV Boli", Font.BOLD , 100));
					welcomeText.setForeground(Color.green);
					
					logoLabel.setBounds(500, -50, 500, 200);
					logoLabel.setBackground(Color.red);
					
					start.setBounds(450, 200, 400, 150);
					start.setFocusable(false);
					start.setFont(new Font("MV Boli", Font.BOLD, 50));
					start.setForeground(Color.red);
					start.setBackground(Color.gray);
					start.addActionListener(new ActionListener() {
						
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
								
								
								Player.setBackground(Color.red);
								Player.setBounds(5, 390, PLAYER_WIDTH, PLAYER_HEIGHT);
								
								
								Lion.setIcon(LionImage);
								Lion.setBounds(550, 315,100, 100);
								
								bear.setBounds(1000, 350, 110, 100);
								
								panel1.add(bear);
								panel1.add(Lion);
								panel1.add(label1);
								panel1.add(label2);
								panel1.add(label3);
								panel1.add(label3_1);
								panel1.add(Player);
								
								
								panel1.add(background1);
								
								
								
								homePanel.setVisible(false);
								panel2.setVisible(false);
								panel1.setVisible(true);
								frame.add(panel1);
								frame.repaint();
							
						}
					});
					
					homePanel.setBackground(Color.black);
					
					homePanel.add(start);
					homePanel.add(logoLabel);
					homePanel.setLayout(null);
					homePanel.add(welcomeText);
					
					
					settings.add(home);
					settings.add(exit);
					levels.add(level1);
					levels.add(level2);
					menuBar.add(settings);
					menuBar.add(levels);
					frame.setJMenuBar(menuBar);
					
					
					frame.add(homePanel);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				}
				
				
			
				
			
	}


