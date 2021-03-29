package Motorcycle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class1 b = new Class1(); //create new object name as b
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
