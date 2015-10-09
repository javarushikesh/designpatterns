package singleton;

public class SingletonPatternDemo {

	public static void main (String ...a){
		//SingleObject singleton = new SingleObject();
	
		SingleObject singleton = SingleObject.getInstance();
		singleton.showMessage();
	}
}
