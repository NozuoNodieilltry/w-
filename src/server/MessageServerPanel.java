package server;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MessageServerPanel extends JPanel{
	JTextArea messageBoard=new JTextArea("",20,50);
	JLabel statusLabel=new JLabel("当前连接数：",JLabel.LEFT);
	JPanel boardPanel=new JPanel(),statusPanel=new JPanel();
	MessageServerPanel(){
		setSize(350,300);
		setBackground(new Color(204,204,204));
		setLayout(new BorderLayout());
		messageBoard.add(new JScrollBar());
		boardPanel.setLayout(new FlowLayout());
		boardPanel.setSize(210,210);
		statusPanel.setSize(210,50);
		statusPanel.setLayout(new BorderLayout());
		boardPanel.add(messageBoard);
		statusPanel.add(statusLabel, BorderLayout.WEST);
		add(boardPanel,BorderLayout.CENTER);
		add(statusPanel,BorderLayout.NORTH);
	}
	
}
