package factory;

public class FactoryDemo {

	public static void main(String ...a){
		
		ShapeFactory sf = new ShapeFactory();
		
		Shape shape1 = sf.getShape("TRIANGLE");
		shape1.draw();
		
		Shape shape2 = sf.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = sf.getShape("CIRCLE");
		shape3.draw();
	}
	
}
