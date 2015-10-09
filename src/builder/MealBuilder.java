package builder;

public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal vegMeal = new Meal();
		vegMeal.addItems(new VegBurger());
		vegMeal.addItems(new Pepsi());
		return vegMeal;
	}

	public Meal prepareNonVegMeal(){
		Meal nonvegMeal = new Meal();
		nonvegMeal.addItems(new ChickenBurger());
		nonvegMeal.addItems(new Coke());
		return nonvegMeal;
	}
	
	public Meal prepareFamilyComboMeal(){
		Meal comboMeal = new Meal();
		comboMeal.addItems(new VegBurger());
		comboMeal.addItems(new ChickenBurger());
		comboMeal.addItems(new Pepsi());
		comboMeal.addItems(new Coke());
		return comboMeal;
	}
}
