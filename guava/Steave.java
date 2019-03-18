package observer.guava;

public class Steave {

	@Subscribe
	public 	void subscribe(String str){
		System.out.println("正在窃取"+str);
	}
}
