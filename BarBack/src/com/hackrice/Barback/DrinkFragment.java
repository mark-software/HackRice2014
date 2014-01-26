package com.hackrice.Barback;


import cart.Controller;
import cart.ModelProducts;
import beverages.Drink;
import beverages.DrinkFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DrinkFragment extends Fragment{

	
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.drink_fragment_layout, container,
				false);
		setHasOptionsMenu(true);

		final Controller cart = (Controller) this.getActivity().getApplicationContext();

		 Bundle bundle = this.getArguments();

		int drinkID = bundle.getInt("drink");
		final Drink drinkInstance = DrinkFactory.drinkMaker(drinkID);
		
		ImageView img = (ImageView) v.findViewById(R.id.drinkImage);
		img.setImageResource(drinkInstance.getIDNumber());
		
		TextView name = (TextView) v.findViewById(R.id.nameText);
		TextView calories = (TextView) v.findViewById(R.id.calText);
		TextView price = (TextView) v.findViewById(R.id.priceText);
		TextView ounces = (TextView) v.findViewById(R.id.ozText);
		TextView history = (TextView) v.findViewById(R.id.historyText);
		final EditText quantity = (EditText) v.findViewById(R.id.quantityEditText);

		name.setText(drinkInstance.getName());
		String priceString = price.getText() + String.valueOf(drinkInstance.getPrice());
		price.setText(priceString);
		calories.setText(calories.getText() + String.valueOf(drinkInstance.getCal()));
		ounces.setText(ounces.getText() + String.valueOf(drinkInstance.getOunces()));
		history.setText(drinkInstance.getHistory());
		
		Button cartButton = (Button) v.findViewById(R.id.addToCartButton);
		cartButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
        		String drinkName = drinkInstance.getName();
            	ModelProducts temp = new ModelProducts(drinkName, Integer.valueOf(quantity.getText().toString()));
            	cart.getCart().setProducts(temp);
            	
            	String toastText ;
            	
            	if (Integer.valueOf(quantity.getText().toString()) > 1)
            	{
            		toastText = quantity.getText().toString() + " " + drinkInstance.getName() + " added to cart!";
            	}
            	else
            	{
            		toastText = drinkInstance.getName() + " added to cart!";
            	}
            	
            	
            	Toast.makeText(v.getContext().getApplicationContext(), toastText, 
            	Toast.LENGTH_SHORT).show();

            }
		});

		
		
		return v;
    }
    
    @Override
    public void onCreateOptionsMenu(
          Menu menu, MenuInflater inflater) {
       inflater.inflate(R.menu.cart, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       // handle item selection
       switch (item.getItemId()) {
        //  case R.id.cart:
             // do s.th.
       //      return true;
          default:
             return super.onOptionsItemSelected(item);
       }
    }
}
