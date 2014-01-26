package cart;

import beverages.Drink;

public class ModelProducts {

	private String _product;
	private int _count;

	public ModelProducts(String string, int count) {
		this._product = string;
		this._count = count;
	}

	public String getProduct() {

		return _product;
	}

	public int getProductCount() {

		return _count;
	}

}
