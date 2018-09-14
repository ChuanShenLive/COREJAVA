package innerClasses;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * This program demonstrates the use of inner classes.
 * @version 1.00 2018-09-13
 * @author ChuanShen
 */
public class InnerClassTest {
	public static void main(String[] args) {
		int[] counter = new int[1];
		Date[] dates = new Date[100];
		for (int i = 0; i < dates.length; i++) {
			dates[i] = new Date() {
				public int compareTo(Date other) {
					counter[0]++; // Error
					return super.compareTo(other);
				}
			};
		}
		Arrays.sort(dates);
		System.out.println(counter[0] + " comparisons.");
		
		
		TalkingClock clock = new TalkingClock(1000, true);
		// ActionListener listener = clock.new TimePrinter();
		// clock.start(null);
		clock.start(1000, true);
		
		// keep program running until user selects "OK"
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}
}

/**
 * A clock that prints the time in regular intervals.
 */
@SuppressWarnings("unused")
class TalkingClock {
	private int interval;
	private boolean beep;
	
	/**
	 * Constructs a talking clock
	 * @param interval the interval between messages (in milliseconds)
	 * @param beep true if the clock should beep
	 */
	public TalkingClock(int interval, boolean beep) {
		this.interval = interval;
		this.beep = beep;
	}
	
	/**
	 * Starts the clock.
	 */
	// public void start(ActionListener listener) {
	public void start(int interval, boolean beep) {
		class TimePrinter implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				System.out.println("At the tone, the time is " + new Date());
				if(beep) {
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}
		// if(listener == null) {
			// listener = new TimePrinter();
		//	listener = new TimePrinter();
		//}
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	
	/*
	public class TimePrinter implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.out.println("At the tone, the time is " + new Date());
			if(beep) {
			// if(TalkingClock.this.beep) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
	}
	*/
}

// 内部类中声明的所有静态域都必须是final
