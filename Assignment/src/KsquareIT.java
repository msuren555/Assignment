import java.util.Scanner;

class KsquareIT {
	public static void main(String[] args) {

		System.out.println("Test 1");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String string_input = sc.nextLine();
		String[] input_split = string_input.split(" ");
		int n = Integer.valueOf(input_split[input_split.length - 1]);

		String string_reverse = new StringBuffer(input_split[n - 1]).reverse().toString();
		String blank_space = "";
		for (int i = 0; i < input_split.length - 1; i++) {
			if (i == n - 1) {
				blank_space = blank_space + string_reverse + " ";
			} else {
				blank_space = blank_space + input_split[i] + " ";
			}
		}
		System.out.println(blank_space.trim());
	}
}