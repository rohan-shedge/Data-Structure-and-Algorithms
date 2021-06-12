package algorithms.string;

public class CheckPrime {
	public static void main(String[] args) {
		int num = 87;
		System.out.println(checkPrime(num));
	}

	private static String checkPrime(int num) {
		if (num < 1) {
			return num  + " is Invalid number";
		}
		if (num == 1) {
			return num  + " is neither prime nor composite";
		}
		
		for (int i=2 ; i<=num/2 ; i++) {
			if (num % i == 0) {
				return num  + " is composite";
			}
		}
		return num  + " is Prime";
	}

}
