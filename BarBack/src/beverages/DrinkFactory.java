package beverages;

public class DrinkFactory {
    public static Drink drinkMaker(int drinkID) {
        Drink product = null;
 
        switch (drinkID) {
        case 0:
            product = new CorpseReviver();
            break;
        case 1:
            product = new LemonDrop();
            break;
        case 2:
            product = new TomCollins();
            break;
        default:
            product = new LemonDrop();
            break;	
        }
        
        return product;
    }

}
