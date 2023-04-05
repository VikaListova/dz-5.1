public class Main {
	public static void main(String[] args) {
		test();
	}

	public static void test() {
		int a = 4;
		int b = 5;
		int c = 8;
		int d = 2;

		int sum1 = a + b;
		int sum2 = c + d;

		System.out.println(sum1 > sum2);

		sum1 += 1;
		sum2 -= 2;

		System.out.println(sum1 > sum2);

		if (sum1 % 2 == 0 || sum2 % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);

		}
	}
}