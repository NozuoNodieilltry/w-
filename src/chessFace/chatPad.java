package chessFace;

import java.awt.BorderLayout;
import java.awt.TextArea;

import javax.swing.*;

public class chatPad extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5415453210533575395L;
	public TextArea chatLineArea=new TextArea("",18,30,TextArea.SCROLLBARS_VERTICAL_ONLY);
	public chatPad(){
		setLayout(new BorderLayout());
		add(chatLineArea,BorderLayout.CENTER);
	}
}
