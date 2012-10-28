package com.swapnil;

public class FirstFirst extends Namer {

	public FirstFirst(String s) {
		int i = s.lastIndexOf(" ");
		// find sep space
		if (i > 0) {
			// left is first name
			mFirstName = s.substring(0, i).trim();
			// right is last name
			mLastName = s.substring(i + 1).trim();
		} else {
			mFirstName = "";
			// put all in last name
			mLastName = s;
			// if no space
		}
	}
}
