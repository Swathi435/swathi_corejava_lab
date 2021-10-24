package swathiproject.day5.polymorphism;

public class PolyDemo {
	

		public static void main(String[] args) {

			Cal calc = new Cal();
			System.out.println(calc.addNumbers(10, 20));
			System.out.println(calc.addNumbers(10, 20, 30));
			System.out.println(calc.addNumbers(10, 20, 30, 40));

			Child child = new Child();
			child.someMethod();
		}

}
