package DigitalClock;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyFrame extends JFrame {
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	public MyFrame() {
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My clock program");
		this.setLayout(new FlowLayout());
		this.setSize(302,215);
		timeFormat = new SimpleDateFormat("hh:mm:ss ");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM.dd.YYYY");
		
		timeLabel = new JLabel();
	    timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
	    timeLabel.setForeground(new Color(0x00ff00));
	    timeLabel.setBackground(Color.black);
	    
	    dayLabel = new JLabel();
	    dayLabel.setFont(new Font("Ink Free",Font.PLAIN,30));
	    
	    dateLabel = new JLabel();
	    dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
	    
	    timeLabel.setOpaque(true);
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		
		this.setVisible(true);
		setTime();
	}

	public void setTime() {
		while (true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}public static void main(String[] args) {
		new MyFrame();
	}
	
}

	


