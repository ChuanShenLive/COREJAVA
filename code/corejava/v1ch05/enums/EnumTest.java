package enums;

import java.util.Scanner;

/**
 * This program demonstrates enumerated types.
 * @version 1.0 2018-09-03
 * @author ChuanShen
 * 5-12
 */
public class EnumTest {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("abbreviation=" + size.getAttreviation());
		if(size == Size.EXTRA_LARGE) {
			System.out.println("Good job -- you paid attention to the _.");
		}
		in.close();
	}
}

enum Size {
	SMALL("S"),  MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	
	private Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getAttreviation() {
		return abbreviation;
	}
	private String abbreviation;
}
