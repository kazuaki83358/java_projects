package kazzuaki_project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class prank {
public static void main(String[] args) throws AWTException, InterruptedException {
	int x=1;
	Robot robot = new Robot();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter You message");
	String msg = scanner.next();
	StringSelection stringselection = new StringSelection(msg);
	Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	clipboard.setContents(stringselection, null);
	
	System.out.println("spaming will start in 10 second");
	Thread.sleep(10000);
	while(x <= 10) {
		Thread.sleep(1000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
    x++;	
    }
}
}


