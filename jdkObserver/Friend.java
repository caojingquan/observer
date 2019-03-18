package observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

public class Friend implements Observer{
	@Override
	public void update(Observable o, Object arg) {
		WeChatComments weChat = (WeChatComments)o;
		Information info = (Information)arg;
		System.out.println("============================");
		System.out.println(name+"\n"+"您的朋友在"+weChat.getName()+"说了"+info.getWords());
	}
	private String name;
	public Friend(String name){this.name = name;}
	
	
}
