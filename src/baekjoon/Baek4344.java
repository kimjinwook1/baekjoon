package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Baek4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCount; i++) {
			List<Integer> overList = new ArrayList<>();
			int total = 0;
			double average;
			String input = String.valueOf(br.readLine());
			List<String> score = List.of(input.split(" "));
			for (int j = 1; j < score.size(); j++) {
				total += Integer.parseInt(score.get(j));
			}
			average = total / Integer.parseInt(score.get(0));
			for (int j = 1; j < score.size(); j++) {
				if (Integer.parseInt(score.get(j)) > average) {
					overList.add(Integer.parseInt(score.get(j)));
				}
			}
			double i1 = (double) overList.size() / (score.size() - 1)*100;
			bw.write(String.format("%.3f%%", i1));
			if (i < testCount-1) {
				bw.newLine();
			}
		}
		bw.flush();
	}
}
