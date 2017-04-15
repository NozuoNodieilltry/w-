package server;

import java.awt.event.ActionEvent;
import java.net.ServerSocket;
import java.util.Hashtable;

import javax.swing.*;
public class chessServer {
	JButton messageClearButton,
			serverStatusButton,
			serverOffButton;
	MessageServerPanel server;
//	JPanel buttonPanel;
	ServerSocket serverSocket;
	Hashtable clientDataHash,
			  clientNameHash,
			  clientPeerHash;
	chessServer(){
		
	}
	
	void makeMessageServer(int port,MessageServerPanel server){
		
	}
	
	void actionPerformed(ActionEvent e){
		
	}
	
	public static void main(String[] args) {
		
	}
}
