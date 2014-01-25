package com.hackrice.Barback;

import android.net.Uri;

public class Drink {

	private String _name;
	private String[] _ingredients;
	private Uri _image;
	private float _ounces;
	private String _history;
	private float _cal;
	private float _timeNeeded;
	private short _occassion;
	private int _idNumber;
	
	public Drink(){}
	
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}

	public String[] getIngredients() {
		return _ingredients;
	}

	public void setIngredients(String[] ingredients) {
		this._ingredients = ingredients;
	}

	public Uri getImage() {
		return _image;
	}

	public void setImage(Uri image) {
		this._image = image;
	}

	public float getOunces() {
		return _ounces;
	}

	public void setOunces(float ounces) {
		this._ounces = ounces;
	}

	public String getHistory() {
		return _history;
	}

	public void setHistory(String history) {
		this._history = history;
	}

	public float getCal() {
		return _cal;
	}

	public void setCal(float cal) {
		this._cal = cal;
	}

	public float getTimeNeeded() {
		return _timeNeeded;
	}

	public void setTimeNeeded(float timeNeeded) {
		this._timeNeeded = timeNeeded;
	}

	public short getOccassion() {
		return _occassion;
	}

	public void setOccassion(short occassion) {
		this._occassion = occassion;
	}

	public int getIDNumber() {
		return _idNumber;
	}

	public void setIDNumber(int idNumber) {
		this._idNumber = idNumber;
	}
	
	
}
