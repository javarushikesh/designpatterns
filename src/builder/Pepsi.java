package builder;

public class Pepsi extends ColdDrink{

	@Override
	public float price() {
		return 20.00f;
	}

	@Override
	public String name() {
		return "Pepsi";
	}

}
