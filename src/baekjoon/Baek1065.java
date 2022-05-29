package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baek1065 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		List<String> arrNum = new ArrayList<>();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			arrNum.add(String.valueOf(i));
		}

		for (int i = 0; i < num; i++) {
			if (Integer.parseInt(arrNum.get(i)) < 100) {
				count++;
			}
			List<Integer> arrayList = new ArrayList<>();
			if (Integer.parseInt(arrNum.get(i)) > 100) {
				String[] split = arrNum.get(i).split("");
				for (int j = 0; j < split.length - 1; j++) {
					arrayList.add(Integer.parseInt(split[j]) - Integer.parseInt(split[j + 1]));
				}
				for (int j = 0; j < arrayList.size() - 1; j++) {
					if (arrayList.size() == 2) {
						if (arrayList.get(j) == arrayList.get(j + 1)) {
							count++;
						}
					}
					if (arrayList.size() == 3) {
						if (arrayList.get(j) == arrayList.get(j + 1)
							&& arrayList.get(j + 1) == arrayList.get(j + 2)) {
							count++;
						}
						j = arrayList.size();
					}
				}
			}
		}
		System.out.println(count);
	}
}
