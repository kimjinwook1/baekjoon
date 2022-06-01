package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Baek5622 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();
		int result = 0;
		String[] split = s.split("");
		ArrayList<String> abc = new ArrayList<>();
		ArrayList<String> def = new ArrayList<>();
		ArrayList<String> ghi = new ArrayList<>();
		ArrayList<String> jkl = new ArrayList<>();
		ArrayList<String> mno = new ArrayList<>();
		ArrayList<String> pqrs = new ArrayList<>();
		ArrayList<String> tuv = new ArrayList<>();
		ArrayList<String> wxyz = new ArrayList<>();
		abc.add("A");
		abc.add("B");
		abc.add("C");
		def.add("D");
		def.add("E");
		def.add("F");
		ghi.add("G");
		ghi.add("H");
		ghi.add("I");
		jkl.add("J");
		jkl.add("K");
		jkl.add("L");
		mno.add("M");
		mno.add("N");
		mno.add("O");
		pqrs.add("P");
		pqrs.add("Q");
		pqrs.add("R");
		pqrs.add("S");
		tuv.add("T");
		tuv.add("U");
		tuv.add("V");
		wxyz.add("W");
		wxyz.add("Y");
		wxyz.add("X");
		wxyz.add("Z");
		for (String s1 : split) {
			if (abc.contains(s1)) {
				result += 3;
			}
			if (def.contains(s1)) {
				result += 4;
			}
			if (ghi.contains(s1)) {
				result += 5;
			}
			if (jkl.contains(s1)) {
				result += 6;
			}
			if (mno.contains(s1)) {
				result += 7;
			}
			if (pqrs.contains(s1)) {
				result += 8;
			}
			if (tuv.contains(s1)) {
				result += 9;
			}
			if (wxyz.contains(s1)) {
				result += 10;
			}
		}
		bw.write(result+"");
		bw.flush();
	}
}
