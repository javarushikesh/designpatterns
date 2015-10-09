package abstractfactory;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		return null;
	}

	@Override
	public Color getColor(String color) {
		if("RED".equals(color)){
			return new Red();
		} else if("BLUE".equals(color)){
			return new Blue();
		} else if("GREEN".equals(color)){
			return new Green();
		} else {
			return null;
		}
	}
	
}
