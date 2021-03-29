package Bird;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 a = new Class1(); //create new object name as a
		System.out.println(a.breed);
		System.out.println(a.color);
		System.out.println(a.size);
		System.out.println(a.classification);
		a.eat();
		a.sleep();
		a.fly();
		a.climb();
		a.play();
	}

}
