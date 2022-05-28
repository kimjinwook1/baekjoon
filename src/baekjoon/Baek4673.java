package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Baek4673 {

	public static final int GIVEN_NUMBER = 10000;

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		List<Integer> numberList = new LinkedList<>();
		List<Integer> selfNumberList = new LinkedList<>();

		int bigNumber = 10000;
		for (int i = 1; i < bigNumber; i++) {
			numberList.add(i);
			selfNumberList.add(i);
		}

		for (Integer number : numberList) {
			int[] arrNum = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
			int arrSum = Arrays.stream(arrNum).sum();

			Integer result = number + arrSum;

			if (result < GIVEN_NUMBER) {
				selfNumberList.remove(result);
			}
		}

		for (Integer integer : selfNumberList) {
			bw.write(String.valueOf(integer));
			bw.newLine();
		}
		bw.flush();
	}
}
