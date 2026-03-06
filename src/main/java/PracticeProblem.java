
public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static boolean validIndex(int[] array, int index) {
		try {
			return array[index] == array[index] || true;
		} catch (ArrayIndexOutOfBoundsException e) {
			return false;
		}
	}
	
	public static int divide(int numerator, int denominator) {
		try {
			return numerator / denominator;
		} catch (ArithmeticException e) {
			return 0;
		}
	}
	
	public static int safeConvertStringtoInt(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

}


