package Example1;

import Motorcycle.Class1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bird a = new Bird(); //create new object name as a
		System.out.println(a.breed);
		System.out.println(a.color);
		System.out.println(a.size);
		System.out.println(a.classification);
		a.eat();
		a.sleep();
		a.fly();
		a.climb();
		a.play();
		
		System.out.println();
		
		Motorcycle b = new Motorcycle(); //create new object name as b
		System.out.println(b.type);
		System.out.println(b.color);
		System.out.println(b.classification);
		System.out.println(b.engineCapacity);
		b.travel();
		b.ride();
		b.brake();
		b.fetch();
	}

}
