package com.daytwojava;

class Shapeinherit {
	int sides;
	public Shapeinherit(int sides) {
		this.sides = sides;
	}
	public int getSides() {
		return sides;
	}
}
class Squareinherit extends Shapeinherit {
	public Squareinherit() {
		super(4);
	}
}

class Inheritance 
{
	public static void main(String[] args) 
	{
		Squareinherit square = new Squareinherit();
		System.out.println("A square has " + square.getSides() + " sides.");
	}
}