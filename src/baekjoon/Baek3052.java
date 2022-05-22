package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Baek3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Set<Integer> arr = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			int input = Integer.parseInt(br.readLine());
			arr.add(input % 42);
		}

		System.out.println(arr.size());
	}
}
