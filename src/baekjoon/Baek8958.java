package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baek8958 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int totalCount = Integer.parseInt(br.readLine());
		for (int i = 0; i < totalCount; i++) {
			String inputScore = String.valueOf(br.readLine());
			String[] split = inputScore.split("");
			String answer = "O";
			int score = 0;
			int resultScore = 0;
			for (String s : split) {
				if (answer.equals(s)) {
					score++;
					resultScore += score;
				}
				if (!answer.equals(s)) {
					score = 0;
				}
			}
			bw.write(resultScore+"");
			bw.newLine();
		}
		bw.flush();
	}
}
