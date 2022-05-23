package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Baek1546 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int subjectCount = Integer.parseInt(br.readLine());
		String inputScore = String.valueOf(br.readLine());
		String[] scoreArr = inputScore.split(" ");

		int maxScore = 0;
		List<Double> scoreList = new ArrayList<>();

		for (String scoreStr : scoreArr) {
			int score = Integer.parseInt(scoreStr);
			if (score > maxScore) {
				maxScore = score;
			}
		}

		for (String scoreStr : scoreArr) {
			int score = Integer.parseInt(scoreStr);
			if (score <= maxScore) {
				double changeScore = (double) score / maxScore * 100;
				scoreList.add(changeScore);
			}
		}

		double total = scoreList.stream().mapToDouble(aDouble -> aDouble).sum();
		System.out.println(total / subjectCount);
	}
}
