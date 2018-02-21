

public class Example_Tax {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		double salary = 78965.36;
		double tax = 0.0;
		if (salary <= 15000) {
			tax = salary * .1;
		} else if (salary <= 40000) {
			tax = salary * 0.2;

		} else {
			tax = salary * 0.3;
		}
		System.out.println("the tax is: " + tax);
	}

}
