package abstractfactory;

public class AbstractFactoryPatternDemo {

	public static void main(String ...a){

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		
		Shape shape1 = shapeFactory.getShape("TRIANGLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("CIRCLE");
		shape3.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		
		Color color2 = colorFactory.getColor("BLUE");
		color2.fill();
		
		Color color3 = colorFactory.getColor("GREEN");
		color3.fill();
	}
}
