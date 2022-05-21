package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Baek2577 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int result =
			Integer.parseInt(br.readLine()) *
			Integer.parseInt(br.readLine()) *
			Integer.parseInt(br.readLine());

		String strResult = String.valueOf(result);
		int resultLength = strResult.length();

		int[] arr = new int[10];
		IntStream.range(0, resultLength).forEach(i -> arr[strResult.charAt(i) - 48]++);

		Arrays.stream(arr).forEach(System.out::println);
	}
}
