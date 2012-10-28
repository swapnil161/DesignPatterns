package com.swapnil;

public class FactoryPattern {

	private NameFactory nfactory = new NameFactory();

	public FactoryPattern() {
		// TODO Auto-generated constructor stub
		computeName("Swapnil Gadkari");
	}

	private void computeName(String s) {
		// send the text to the factory and get a class back
		Namer namer = nfactory.getName(s);
		// compute the first and last names
		// using the returned class
		System.out.println("First Name "+namer.getFirstName());
		System.out.println("Last Name "+namer.getLastName()); 
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FactoryPattern();
	}

}
