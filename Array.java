
public class Array {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a = 12; int b = 14; int c, d, e; c = 34; d = 54; e = 34;
		 */

		/*
		 * int a1 = 12; int a2 = 14;
		 */

		int[] a = { 15, 66, 54, 8, 46, 49, 656, 356 };
		System.out.println(a[2] + " " + a[6]);
		// enhanced for
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("---------------------------------");
		int[] x = new int[9];
		x[4] = 245;
		x[5] = 42;
		for (int q : x) {
			System.out.println(q);
		}
	}

}
