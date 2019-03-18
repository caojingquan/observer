package observer.guava;

public class Police {

	public static void main(String[] args) {
		EventBus bus = new EventBus();
		Steave steave = new Steave();
		bus.register(steave);
		bus.post("黄金");
	}
}
