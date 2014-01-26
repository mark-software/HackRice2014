package cart;

import java.util.ArrayList;
	 
	public class ModelCart{
	     
	   private  ArrayList<ModelProducts> cartProducts = new ArrayList<ModelProducts>();
	     
	 
	   public ModelProducts getProducts(int pPosition) {
	         
	        return cartProducts.get(pPosition);
	    }
	     
	    public void setProducts(ModelProducts Products) {
	        
	        cartProducts.add(Products);
	         
	    }
	     
	    public int getCartSize() {
	        return cartProducts.size();	         
	    }
	    
	    public int getTotalCartSize() {
	    	int total = 0;
	    	for (ModelProducts m : cartProducts)
	    	{
	    		total += m.getProductCount();
	    	}
	        return total;	         
	    }
	  
	    public boolean checkProductInCart(ModelProducts aProduct) {
	            
	        return cartProducts.contains(aProduct);
	         
	    }
	 
	
}
