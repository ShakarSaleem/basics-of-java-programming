
public class TwoDimentionalArray {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		int[][] x = new int[7][6];
		// x[5][1]=10;
		int tempval = 12;
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				x[i][j] = tempval;
				tempval += 12;
			}
		}
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("(-" + "|" + x[i][j] + "|" + "-)");
			}
			System.out.println();
		}
	}

}
