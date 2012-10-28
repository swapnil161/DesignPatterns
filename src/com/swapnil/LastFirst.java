package com.swapnil;

class LastFirst extends Namer {
	// split last, first
	public LastFirst(String s) {
		int i = s.indexOf(",");
		// find comma
		if (i > 0) {
			// left is last name
			mLastName = s.substring(0, i).trim();
			// right is first name
			mFirstName = s.substring(i + 1).trim();
		} else {
			mLastName = s;
			// put all in last name
			mFirstName = "";
			// if no comma
		}
	}
}
