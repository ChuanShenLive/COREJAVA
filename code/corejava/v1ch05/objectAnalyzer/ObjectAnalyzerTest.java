package objectAnalyzer;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects.
 * @version 1.00 2018-09-04
 * @author ChuanShen
 * 5-14
 */
public class ObjectAnalyzerTest {
	public static void main(String[] args) {
		ArrayList<Integer> squares = new ArrayList<> ();
		for (int i = 1; i <= 5; i++) {
			squares.add(i * i);
		}
		System.out.println(new objectAnalyzer().toString(squares));
	}
}
