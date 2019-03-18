package observer.eventObserver;

import java.util.Timer;
import java.util.TimerTask;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Mouse mouse = new Mouse();
		MouseEventCallBack callback = new MouseEventCallBack();
        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				mouse.click();
				
			}
		}, 2000,1000);

	}
}
