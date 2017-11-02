package goose;

import bird.Bird;

public class Goose extends Bird{
	void quack() {
		sayName();
		System.out.println(n1);
	}
	
	void createBird() {
		Bird b = new Bird();
		Goose g1 = new Goose();
		g1.sayName();
		// b.sayName(); // not visible
	}

	public static void main(String[] args) {
		Goose g = new Goose();
		g.quack();
	}

}
