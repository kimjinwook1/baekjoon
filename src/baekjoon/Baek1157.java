package baekjoon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Baek1157 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] split = s.split("");
		HashSet<String> setTest = new HashSet<>();
		for (int i = 0; i < split.length; i++) {
			String s2 = split[i].toLowerCase();
			split[i] = split[i].toLowerCase();
			setTest.add(s2);
		}
		HashMap<String, Integer> mapTest = new HashMap<>();
		for (String s1 : setTest) {
			mapTest.put(s1, 0);
		}
		for (String s1 : split) {
			for (String s2 : mapTest.keySet()) {
				if (s2.equals(s1)) {
					mapTest.put(s2, mapTest.get(s2) + 1);
				}
			}
		}
		int count = 0;
		String result = "?";
		if (setTest.size() == 1) {
			for (String s1 : mapTest.keySet()) {
				result = s1.toUpperCase();
			}
		}
		int max2 = 0;
		for (String s1 : setTest) {
			Integer integer = mapTest.get(s1);
			if (integer > max2) {
				max2 = integer;
			}
		}

		if (setTest.size() > 1) {
			for (String s1 : setTest) {
				Integer integer = mapTest.get(s1);
				if (max2 <= integer) {
					result = s1.toUpperCase();
					count++;
				}
			}
		}

		if (count <= 1) {
			System.out.print(result);
		}
		if (count > 1) {
			result = "?";
			System.out.print(result);
		}
	}
}
