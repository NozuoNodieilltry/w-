package chessFace;

import javax.swing.*;
import java.awt.*;

public class userPad extends JPanel{
	private static final long serialVersionUID = 2927686907352428282L;
	/**
	 * 
	 */
	public List userList=new List(10);
	public userPad(){
		setLayout(new BorderLayout());
		for(int i=0;i<30;i++){
			userList.add(i+"."+"当前暂无用户");
		}
		add(userList,BorderLayout.CENTER);
	}
}
