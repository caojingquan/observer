package observer.jdkObserver;

public class ObeserverTest {
	public static void main(String[] args) {
		Information information = new Information();
		Friend friend = new Friend("小明");
		information.setWords("好像涨工资，换自己喜欢的工作");
		WeChatComments weChat = WeChatComments.getInstance();
		//要先将观察者加入进来才能在发布信息
		weChat.addObserver(friend);
		weChat.publishInformation(information);
	}

}
