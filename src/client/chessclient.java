package client;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

import javax.swing.*;

import chessFace.*;


public class chessclient extends JFrame implements ActionListener,KeyListener{
	private static final long serialVersionUID = -4496737656486469834L;
	/**
	 * 
	 */
	userPad userpad;
	chatPad chatpad;
	controlPad controlpad;
	chessPad chesspad;
	inputPad inputpad;
	Socket socket;
	DataInputStream in;
	DataOutputStream out;
	String chessClientName,host;
	int port;
	boolean isOnChat,isOnChess,isGameConnected,isServer,isClient;
	
	chessclient(){
		
	}
	
	boolean connectServer(String ServerIP,int ServerPort) throws Exception{
		return isClient;
		
	}
	
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
