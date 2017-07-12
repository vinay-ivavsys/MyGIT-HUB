import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class JavaRobotKeys {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		Robot rbt;
		try {
			rbt = new Robot();
			//JavaRobotKeys jrb = new JavaRobotKeys();
			Thread.sleep(10000);
			//rbt.keyPress(KeyEvent.VK_SHIFT);
			rbt.keyPress(KeyEvent.VK_C);
			rbt.keyRelease(KeyEvent.VK_C);
			rbt.keyPress(KeyEvent.VK_SHIFT);
			rbt.keyPress(KeyEvent.VK_SEMICOLON);
			rbt.keyRelease(KeyEvent.VK_SEMICOLON);
			rbt.keyRelease(KeyEvent.VK_SHIFT);
			rbt.keyPress(KeyEvent.VK_BACK_SLASH);
			rbt.keyRelease(KeyEvent.VK_BACK_SLASH);
			//rbt.keyRelease(KeyEvent.VK_SHIFT);
			//rbt.keyPress(KeyEvent.VK_SLASH);
			//rbt.keyPress(KeyEvent.VK_SLASH);
			rbt.keyPress(KeyEvent.VK_K);
			rbt.keyRelease(KeyEvent.VK_K);
			rbt.keyPress(KeyEvent.VK_E);
			rbt.keyRelease(KeyEvent.VK_E);
			rbt.keyPress(KeyEvent.VK_Y);
			rbt.keyRelease(KeyEvent.VK_Y);
			rbt.keyPress(KeyEvent.VK_S);
			rbt.keyRelease(KeyEvent.VK_S);
			rbt.keyPress(KeyEvent.VK_BACK_SLASH);
			rbt.keyRelease(KeyEvent.VK_BACK_SLASH);
			rbt.keyPress(KeyEvent.VK_SHIFT);
			rbt.keyPress(KeyEvent.VK_H);
			rbt.keyRelease(KeyEvent.VK_H);
			rbt.keyRelease(KeyEvent.VK_SHIFT);
			rbt.keyPress(KeyEvent.VK_U);
			rbt.keyRelease(KeyEvent.VK_U);
			rbt.keyPress(KeyEvent.VK_R);
			rbt.keyRelease(KeyEvent.VK_R);
			rbt.keyPress(KeyEvent.VK_I);
			rbt.keyRelease(KeyEvent.VK_I);
			rbt.keyPress(KeyEvent.VK_X);
			rbt.keyRelease(KeyEvent.VK_X);
			rbt.keyPress(KeyEvent.VK_SHIFT);
			rbt.keyPress(KeyEvent.VK_Q);
			rbt.keyRelease(KeyEvent.VK_Q);
			rbt.keyPress(KeyEvent.VK_A);
			rbt.keyRelease(KeyEvent.VK_A);
			rbt.keyRelease(KeyEvent.VK_SHIFT);
			rbt.keyPress(KeyEvent.VK_0);
			rbt.keyRelease(KeyEvent.VK_0);
			rbt.keyPress(KeyEvent.VK_0);
			rbt.keyRelease(KeyEvent.VK_0);
			rbt.keyPress(KeyEvent.VK_1);
			rbt.keyRelease(KeyEvent.VK_1);
			rbt.keyPress(KeyEvent.VK_PERIOD);
			rbt.keyRelease(KeyEvent.VK_PERIOD);
			rbt.keyPress(KeyEvent.VK_P);
			rbt.keyRelease(KeyEvent.VK_P);
			rbt.keyPress(KeyEvent.VK_E);
			rbt.keyRelease(KeyEvent.VK_E);
			rbt.keyPress(KeyEvent.VK_M);
			rbt.keyRelease(KeyEvent.VK_M);
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);


		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
