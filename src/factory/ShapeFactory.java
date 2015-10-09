package factory;

public class ShapeFactory {

	public Shape getShape(String name){
		
		if("TRIANGLE".equals(name)){
			return new Tringle();
		} else if("RECTANGLE".equals(name)){
			return new Rectangle();
		} else if("CIRCLE".equals(name)){
			return new Circle();
		} else {
			return null;
		}
	}
	
}
