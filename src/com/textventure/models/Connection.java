package com.textventure.models;

public class Connection {

	protected Room room_one, room_two;
	protected boolean can_pass = false;
	private long connectionId = getCurrGlobalId();
	protected String description;
	
	//
	// Algorithm for global id assignment
	//
	private static long globalConnectionId = 0;
	protected long getCurrGlobalId() {
		globalConnectionId ++;
		return globalConnectionId;
	}

	
	//
	// Constructors 
	//
	public Connection(Room room_one, Room room_two, boolean can_pass, String description) {
		super();
		this.room_one = room_one;
		this.room_two = room_two;
		this.can_pass = can_pass;
		this.description = description;
	}

	
	//
	// Getters and Setters
	//
	
	public Room getRoom_one() {
		return room_one;
	}


	public void setRoom_one(Room room_one) {
		this.room_one = room_one;
	}


	public Room getRoom_two() {
		return room_two;
	}


	public void setRoom_two(Room room_two) {
		this.room_two = room_two;
	}


	public boolean isCan_pass() {
		return can_pass;
	}


	public void setCan_pass(boolean can_pass) {
		this.can_pass = can_pass;
	}


	public long getConnectionId() {
		return connectionId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
}
