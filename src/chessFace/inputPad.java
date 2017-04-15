package chessFace;

import javax.swing.*;
import java.awt.*;

public class inputPad extends JPanel{
	private static final long serialVersionUID = 1163826608793642482L;
	/**
	 * 
	 */
	public JTextField inputWords=new JTextField("点击回车发送消息",20);
	public Choice userChoice=new Choice();
	public JLabel chatLabel=new JLabel("输入发送消息：");
	public inputPad(){
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(new Color(204,204,204));
		for(int i=0;i<30;i++){
			userChoice.addItem(i+"."+"当前暂无用户");
		}
		userChoice.setSize(60,24);
		add(userChoice);
		add(chatLabel);
		add(inputWords);
	}
}
