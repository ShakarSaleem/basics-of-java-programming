

public class Employee {

	double salary;
	double bonus;

	// this method is not returning anything just printing this method out here
	void CalculateTotalPay() {
		double totalpay = salary + bonus;
		System.out.println("the total pay : " + totalpay);
	}
}
