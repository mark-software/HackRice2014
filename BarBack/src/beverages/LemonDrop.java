package beverages;

import com.hackrice.Barback.R;

public class LemonDrop extends Drink {

	public LemonDrop(){
	this.setName("Lemon Drop");
	this.setIngredients(new String[]{"Vodka", "Lemon Juice", "Simple Syrup", "Lemon Wedge"});
	this.setHistory("The Lemon Drop is a great after-dinner drink and also makes for a popular shooter at parties.  Try adding a touch of sugar to the rim for an extra touch of sweetness!");
	this.setOccassion((short) 3); //3 = after-dinner
	this.setTimeNeeded(3.0f);
	this.setOunces(3.0f);
	this.setPrice(10.0f);
	this.setCal(176);
	this.setIDNumber(R.drawable.lemon_drop);
	}
	
}
