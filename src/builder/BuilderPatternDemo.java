package builder;

public class BuilderPatternDemo {
	
	public static void main(String ...a) {
		MealBuilder mb = new MealBuilder();
		
		Meal vegMeal = mb.prepareVegMeal();
		System.out.println("Vegeterian Meal");
		vegMeal.showItems();
		
		System.out.println("Non-Vegeterian Meal");
		Meal nonvegMeal = mb.prepareNonVegMeal();
		nonvegMeal.showItems();
		
		System.out.println("Combo Meal");
		Meal comboMeal = mb.prepareFamilyComboMeal();
		comboMeal.showItems();
		
		
	}

}
