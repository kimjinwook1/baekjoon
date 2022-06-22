package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek1978 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer input = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int result = 0;
		for (int i = 0; i < count; i++) {
			list.add(Integer.parseInt(input.nextToken()));
		}
		for (Integer integer : list) {
			boolean prime = is_Prime(integer);
			if (prime) {
				result++;
			}
		}
		System.out.print(result);
	}

	public static boolean is_Prime(int Number) {

		if(Number == 1){
			return false;
		}

		for(int i = 2; i < Number; i++) {
			if(Number % i == 0) return false;
		}
		return true;
	}
}
