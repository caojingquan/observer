package observer.jdkObserver;

import java.util.Observable;
import java.util.Observer;

public class WeChatComments extends Observable{
	String name = "微信朋友圈";
	private static WeChatComments weChat = null;
	
	private WeChatComments(){}
	
	public static WeChatComments getInstance(){
		if(weChat == null){
			synchronized(WeChatComments.class){
				if(weChat == null){
					weChat = new WeChatComments();
				}
			}
		}
		return weChat;
	}
	
	public String getName(){return this.name;}
	
	public void publishInformation(Information info){
		System.out.println(info.getName()+"发表了一条朋友圈，说了"+info.getWords());
		setChanged();
		notifyObservers(info);
	}

	
}
