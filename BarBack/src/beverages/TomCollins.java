package beverages;

import com.hackrice.Barback.R;

public class TomCollins extends Drink {

	public TomCollins(){
	this.setName("Tom Collins");
	this.setIngredients(new String[]{"Gin", "Lemon Juice", "Simple Syrup", "Club Soda", "Lemon Wedge", "Orange Wedge", "Cherry"});
	this.setHistory("The Tom Collins came about in 1987 when a rumor spread through New York City that a man by this name had insulted the city and several of its inhabitants and had been seen at various bars in town.  When people sought him out, bartenders would serve them \"his\" drink.");
	this.setOccassion((short) 4); //4 = night time
	this.setTimeNeeded(3.0f);
	this.setOunces(5.25f);
	this.setPrice(8.00f);
	this.setCal(161);
	this.setIDNumber(R.drawable.tom_collins);
	}
	
}
