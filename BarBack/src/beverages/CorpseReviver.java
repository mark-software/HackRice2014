package beverages;

import com.hackrice.Barback.R;

public class CorpseReviver extends Drink {
	
	public CorpseReviver()
	{
		this.setName("Corpse Reviver");
		this.setIngredients(new String[]{"Brandy", "Apple Brandy", "Sweet Vermouth", "Green Apple Wedge"});
		this.setHistory("While a few variations of Corpse Reviver exist, according to several drink historians, the original was created by Frank Meier at the Ritz Bar in Paris.  The Corpse Reviver is taken \"before 11 AM or whenever steam and energy are needed,\" according to Henry Craddock in The Savoy Cocktail Book.  This drink is particularly popular at Halloween parties in the U.S.");
		this.setOccassion((short) 0); //0 = morning
		this.setTimeNeeded(3.0f);
		this.setOunces(3.0f);
		this.setPrice(13.0f);
		this.setPrice(178);
		this.setIDNumber(R.drawable.corpse_reviver);
	}

}
