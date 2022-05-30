package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baek10809 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		Map<String, Integer> test = new HashMap<>();
		test.put("a", -1);
		test.put("b", -1);
		test.put("c", -1);
		test.put("d", -1);
		test.put("e", -1);
		test.put("f", -1);
		test.put("g", -1);
		test.put("h", -1);
		test.put("i", -1);
		test.put("j", -1);
		test.put("k", -1);
		test.put("l", -1);
		test.put("m", -1);
		test.put("n", -1);
		test.put("o", -1);
		test.put("p", -1);
		test.put("q", -1);
		test.put("r", -1);
		test.put("s", -1);
		test.put("t", -1);
		test.put("u", -1);
		test.put("v", -1);
		test.put("w", -1);
		test.put("x", -1);
		test.put("y", -1);
		test.put("z", -1);

		String word = scanner.nextLine();
		String[] split = word.split("");
		for (int j = 0; j < split.length; j++) {
			for (String s1 : test.keySet()) {
				if (s1.equals(split[j]) && test.get(split[j]) == -1) {
					test.replace(split[j], j);
				}
			}
		}

		for (Integer value : test.values()) {
			System.out.print(value+" ");
		}
	}
}
