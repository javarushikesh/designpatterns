package abstractfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape){
		if("TRIANGLE".equals(shape)){
			return new Tringle();
		} else if("RECTANGLE".equals(shape)){
			return new Rectangle();
		} else if("CIRCLE".equals(shape)){
			return new Circle();
		} else {
			return null;
		}
	}
		
	@Override
	public Color getColor(String color) {
		return null;
	}

}
