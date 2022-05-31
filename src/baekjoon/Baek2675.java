package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek2675 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int number = Integer.parseInt(br.readLine());
		for (int i = 0; i < number; i++) {
			String input = br.readLine();
			String[] inputArr = input.split(" ");
			int count = Integer.parseInt(inputArr[0]);
			String s = inputArr[1];
			String[] letter = s.split("");
			for (String s1 : letter) {
				for (int j = 0; j < count; j++) {
					bw.write(s1);
				}
			}
			bw.newLine();
		}
		bw.flush();
	}
}
