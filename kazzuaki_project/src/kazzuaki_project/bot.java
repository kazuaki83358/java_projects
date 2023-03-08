package kazzuaki_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class bot extends JFrame{
	private JTextArea ChatArea = new JTextArea();
	private JTextField ChatBox = new JTextField();
	public bot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600,600);
		frame.setTitle("ChatBot");
		frame.add(ChatArea);
		frame.add(ChatBox);
		//For text area 
		ChatArea.setSize(500,400);
		ChatArea.setLocation(2,2);
		//for text box
		ChatBox.setSize(540,30);
		ChatBox.setLocation(2,500);
		ChatBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String gtext = ChatBox.getText().toLowerCase();
				ChatArea.append("you :- "+gtext+"\n");
				ChatBox.setText("");
				if (gtext.contains("hi")||gtext.contains("hii")||gtext.contains("hello")||gtext.contains("hlo")||gtext.contains("hey")) {
					bot("yo");
				}
				else if (gtext.contains("how are you")||gtext.contains("how are u")||gtext.contains("how r u")) {
					bot("i'm fine what about you");
				}
				else if (gtext.contains("i am fine")||gtext.contains("i'm fine")) {
					bot("good, Aab dafa kr khud ko");
				}
				else {
					bot("bsdk k aukat me puch na ");
				}
				
			}
		});
	}
	private void bot(String str) {
		ChatArea.append("ChatBot :- "+str+"\n");
		
	}
public static void main(String[] args) {
	new bot();
}
}
