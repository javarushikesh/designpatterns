package singleton;

public class SingleObject {

	public static SingleObject instance = new SingleObject();
	
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void showMessage(){
		System.out.println("Message from Singleton Class");
	}
}
