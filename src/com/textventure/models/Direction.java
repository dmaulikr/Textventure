package com.textventure.models;

import java.util.ArrayList;

public enum Direction {

	
	North("n","north"),
	South("s","south"),
	West("w","west"),
	East("e","east"),
	
	Northwest("nw","northwest"),
	Northeast("ne","northeast"),
	Southwest("sw","southwest"),
	Southeast("se","southeast"),
	
	Up("u","up"),
	Down("d","down"),
	
	This("t","this"),
	
	
	;
	
	
	
	public String abbreviation;
	public String full;

	public static Direction[] dirs = {North,South,West,East,Northeast,Northwest,Southwest,Southeast,Up,Down,This};
	
	private Direction(String abbreviation, String full){
		this.abbreviation = abbreviation;
		this.full = full;
	}
	
	
	public Direction getReversedDirection(Direction direction){
		if(direction == North){
			return South;
		}else if(direction == South){
			return North;
		}else if(direction == West){
			return East;
		}else if(direction == East){
			return West;
		}else if(direction == Northwest){
			return Southeast;
		}else if(direction == Northeast){
			return Southwest;
		}else if(direction == Southwest){
			return Northeast;
		}else if(direction == Southeast){
			return Northwest;
		}else if(direction == Up){
			return Down;
		}else if(direction == Down){
			return Up;
		}else if(direction == This){
			return This;
		}
		
		
		return null;
	}
	
	public Direction getDirection(String direction){
		for(int i=0;i<dirs.length;i++){
			if(direction.equals(dirs[i].abbreviation) || direction.equals(dirs[i].full)){
				return dirs[i];
			}
		}
		return null;
	}
	
	
	
	
}
