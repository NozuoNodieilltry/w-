package chessFace;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import java.io.*;

public class chessPad {
	int[] chessBlack_x,chessBlack_y,
		  chessWhite_x,chessWhite_y;
	int chessBlackCount,chessWhiteCount;
	JLabel statusLabel;
	JTextField statusText;
	Socket chessSocket;
	DataInputStream inData;
	DataOutputStream outData;
	String chessSelfNmae,chessPeerName;
	String host;
	int port;
	chessThread chessThread;	//下棋面板线程主要负责监听端口，读取从服务器传来的消息
	
	void chessPad(){
		
	}
	
	public boolean connectServer(String ServerIP,int ServerPort) throws Exception{
		//由得定IP和端口号连接服务器
		try{
			chessSocket=new Socket(ServerIP,ServerPort);
			inData=new DataInputStream(chessSocket.getInputStream());
			outData=new DataOutputStream(chessSocket.getOutputStream());
			chessThread.start();
			return true;
		}catch(IOException ex){
			statusText.setText("chessPad:connectServer:无法连接\n");
		}
		return false;
	}
	
	void chessVictory(int chessColorWin){
		//一方胜出时处理棋盘，清空棋子，累计胜负数
		
	}
	
	void getLocation(int a,int b,int color){
		//将棋盘方格坐标转换为这个panel上的绝对坐标并保存在相应的数组中
		
	}
	
	boolean checkWin(int a,int b,int checkColor){
		for(step=1;step<=4;step++){
			for(chessCompare=0;chessCompare<=chessBlackCount;chessCompare++){
				if(((a+step)*20==))
			}
		}
		return false;
		//判断a,b点是否可分出胜负
		
	}
	
	void paint(Graphics g){
		//绘制棋盘
		for(int i=40;i<=380;i+=20){
			g.drawLine(40, i, 400, i);
		}
		g.drawLine(40, 400, 400, 400);
		for(int j=40;j<=380;j+=20){
			g.drawLine(j, 40, j, 400);
		}
		g.drawLine(400, 40, 400, 400);
		
		g.fillOval(97, 97, 6, 6);
		g.fillOval(337, 97, 6, 6);
		g.fillOval(97, 337, 6, 6);
		g.fillOval(337, 337, 6, 6);
		g.fillOval(217, 217, 6, 6);
		
	}
	
	void chessPaint(int chessPoint_a,int chessPoint_b,int colot){
		chessPoint_black chesspoint_black=new chessPoint_black(this);
		chessPoint_white chesspoint_white=new chessPoint_white(this);
		if(color==1 && isMouseEnabled){
			getLocation(chessPoint_a,chessPoint_b,color);
			isWin=checkWin(chessPoint_a,chessPoint_b,color);
			if(isWin==false){
				chessthread.sendMessage("/"+chessPeerName+"/chess "+chessPoint_a+" "+chessPoint_b+" "+color);
				this.add(chesspoint_black);
				chesspoint_black.setBounds(chessPoint_a*20-7,chessPoint_b*20-7,16,16);
				statusText.setText("黑（第"+chessBlackCount+"步）"+chessPoint_a+" "+chessPoint_b+",请白棋下子");
				isMouseEnabled=false;
			}
			else{
				chessthread.sendMessage("/"+chessPeerName+" /chess "+chessPoint_a+" "+chessPonint_b+" "+color);
				this.add(chesspoint_black);
				chesspoint_black.setBounds(chessPoint_a*20-7,chessPoint_b*20-7,16,16);
				chessVictory(1);
				isMouseEnabled=false;
			}
		}
		else if(color==-1 && isMouseEnabled){
			getLocation(chessPoint_a,chessPoint_b,color);
			isWin=checkWin(chessPoint_a,chessPoint_b,color);
			if(isWin==false){
				chessthread.sendMessage("/"+chessPeerName+
										"/chess "+chessPoint_a+" "
										+chessPoint_b+" "+color);
				this.add(chesspoint_black);
				chesspoint_black.setBounds(chessPoint_a*20-7,chessPoint_b*20-7,16,16);
				statusText.setText("白（第"+chessBlackCount+"步）"+chessPoint_a+" "+chessPoint_b+",请黑棋下子");
				isMouseEnabled=false;
			}
			else{
				chessthread.sendMessage("/"+chessPeerName+" /chess "+chessPoint_a+" "+chessPonint_b+" "+color);
				this.add(chesspoint_white);
				chesspoint_black.setBounds(chessPoint_a*20-7,chessPoint_b*20-7,16,16);
				chessVictory(-1);
				isMouseEnabled=false;
		}
	}
	
	void netChessPaint(int chessPoint_a,int chessPoint_b,int color){
		
	}
	
	void mousePressed(MouseEvent e){
		
	}
	
	class chessPoint_white extends Canvas{
		chessPad chesspad=null;
		chessPoint_white(chessPad p){
			setSize(20,20);
			chesspad=p;
		}
		public void paint(Graphics g){
			g.setColor(Color.white);
			g.fillOval(0, 0, 14, 14);
		}
	}
	
	class chessPoint_black extends Canvas{
		chessPad chesspad=null;
		chessPoint_black(chessPad p){
			setSize(20,20);
			chesspad=p;
		}
		public void paint(Graphics g){
			g.setColor(Color.black);
			g.fillOval(0, 0, 14, 14);
		}
	}
	
}
