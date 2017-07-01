package com.textventure.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Room {

	protected String name;
	protected String description;
	protected long   room_id = getCurrGlobalId();
	
	protected ArrayList<Item> items;
	
	protected HashMap<Direction, Room> connections;

	//
	// Algorithm for global id assignment
	//
	private static long globalRoomId = 0;
	protected long getCurrGlobalId() {
		globalRoomId ++;
		return globalRoomId;
	}

	//
	// Constructors
	//
	public Room(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	//
	// non standard getters
	//
	Room getNeighborRooms(Direction where) {
		for(Map.Entry<Direction, Room> entry : connections.entrySet()) {
			if(entry.getKey() == where) {
				return entry.getValue();
			}
		}
		throw new IllegalArgumentException("This Room has no neighbor in that direction");
	}
	
	//
	// Getter and Setters
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
	public long getRoom_id() {
		return room_id;
	}
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public HashMap<Direction, Room> getConnections() {
		return connections;
	}
	public void setConnections(HashMap<Direction, Room> connections) {
		this.connections = connections;
	}

}
