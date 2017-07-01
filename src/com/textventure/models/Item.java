package com.textventure.models;

import com.textventure.world.World;

public abstract class Item {

	protected String name;
	protected String description;
	

	protected long item_id = getCurGlobalID();
	
	protected boolean pickable = false;
	protected boolean consumable = false;
	protected boolean clickable = false;
	protected boolean stateChangeable = false;
	protected boolean isKey = false;
	
	//
	//global item ID for initializing every item_id
	//
	private static long globalItemID = 0;
	//
	//method to get and increase the global item ID
	//
	private long getCurGlobalID(){
		globalItemID++;
		return globalItemID;
	}
	
	//
	//Constructor
	//
	public Item(String name, String description){
		this.name = name;
		this.description = description;
	}

	
	//
	//abstract methods
	//
	
	public abstract void processEffects(World world);
	
	
	//
	//Getters and Setters
	//
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getItem_id() {
		return item_id;
	}

	public void setItem_id(long item_id) {
		this.item_id = item_id;
	}

	public boolean isPickable() {
		return pickable;
	}

	public void setPickable(boolean pickable) {
		this.pickable = pickable;
	}

	public boolean isConsumable() {
		return consumable;
	}

	public void setConsumable(boolean consumable) {
		this.consumable = consumable;
	}

	public boolean isClickable() {
		return clickable;
	}

	public void setClickable(boolean clickable) {
		this.clickable = clickable;
	}

	public boolean isStateChangeable() {
		return stateChangeable;
	}

	public void setStateChangeable(boolean stateChangeable) {
		this.stateChangeable = stateChangeable;
	}

	public boolean isKey() {
		return isKey;
	}

	public void setKey(boolean isKey) {
		this.isKey = isKey;
	}
	
	
	
	
}
