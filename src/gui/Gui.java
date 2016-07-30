package gui;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class Gui {

	JFrame frame;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem;
	JRadioButtonMenuItem rbMenuItem;
	JPanel playerPanel;
	
	public Gui(){
		setUpMenu();
		setUpPlayerPanel();
		setUpFrame();
		
	}
	
	//Frame
	public void setUpFrame(){
		frame = new JFrame("CODEBREAKER");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setJMenuBar(menuBar);
		frame.add(playerPanel);
		frame.setVisible(true);
	}
	
	//Menu bar
	public void setUpMenu(){
		menuBar = new JMenuBar();
		
		menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_A);
		//menu.getAccessibleContext().setAccessibleDescription("");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("New Game");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("New Round");
		menu.add(menuItem);
		
		//Save and Load here
		
		menu.addSeparator();
		
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("Easy Difficulty");
		rbMenuItem.setSelected(true);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		
		rbMenuItem = new JRadioButtonMenuItem("Medium Difficulty");
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		
		rbMenuItem = new JRadioButtonMenuItem("Hard Difficulty");
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		
		menu.addSeparator();
		
		menuItem = new JMenuItem("Help");
		menu.add(menuItem);
		
	}
	
	//Player Panel
	public void setUpPlayerPanel(){
		
		playerPanel = new JPanel();
		playerPanel.setLayout(new BoxLayout(playerPanel, BoxLayout.PAGE_AXIS));
		JButton playerIcon = new JButton(new ImageIcon());
		JButton nameIcon = new JButton("Kandice");
		JButton totalScore = new JButton("0");
		JButton currentScore = new JButton("0");
		JButton gameName = new JButton("CODEBREAKER");
		
		playerPanel.add(playerIcon);
		playerPanel.add(nameIcon);
		playerPanel.add(totalScore);
		playerPanel.add(currentScore);
		playerPanel.add(gameName);
		
	}
	
	//Game Panel
	public void setUpGamePanel(){
		
	}
	
	//Previous Guesses
	public void setUpGuessPanel(){
		
		
	}
	
	//Opening popup
	public void openedGame(){
		
	}
	
	
}
