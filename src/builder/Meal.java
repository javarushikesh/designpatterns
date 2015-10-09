package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<Item>();
	
	public void addItems(Item item){
		items.add(item);
	}
	
	public float getMealCost(){
		float totalCost = 0.0f;
		for(Item item: items){
			totalCost+=item.price();
		}
		return totalCost;
	}
	
	public void showItems(){
		for(Item item: items){
			System.out.println("Item : " + item.name() + " having Price : " + item.price() + " is " + item.packing().pack());
		}
		System.out.println("Total Cost of Meal is : " + getMealCost());
		System.out.println();
	}
}
