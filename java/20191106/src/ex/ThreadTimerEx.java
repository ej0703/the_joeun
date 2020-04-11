package ex;

import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	JLabel timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	public void run() {
		int n=0;
		
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		setTitle("ThreadTimerEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC,80));
		
		TimerThread th = new TimerThread(timerLabel);
		c.add(timerLabel);
		
		setSize(300,150);
		setVisible(true);
		
		th.start();
	}
	public static void main(String[] args) {
		new ThreadTimerEx();
	}

}
