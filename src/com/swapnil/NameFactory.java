package com.swapnil;

public class NameFactory {
	public Namer getName(String s){
		int i = s.indexOf(",");
		
		if(i > 0)
			return new LastFirst(s);
		else
			return new FirstFirst(s);
		
	}
}
