package RomanNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PositiveTest {
	RomanNumerals rn = new RomanNumerals();

	@Test
	void singleDigit() {
		System.out.println("-- singleDigit --");
		String[] romanDigit = { "I", "V", "X", "L", "C", "D", "M" };
		int[] expect_result = { 1, 5, 10, 50, 100, 500, 1000 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}

	@Test
	void twoDigits_smaller() {
		System.out.println("-- twoDigits_smaller --");
		String[] romanDigit = { "IV", "IX", "XL", "XC", "CD", "CM" };
		int[] expect_result = { 4, 9, 40, 90, 400, 900 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}

	@Test
	void twoDigits_larger() {
		System.out.println("-- twoDigits_larger --");
		String[] romanDigit = { "VI", "XI", "LI", "CI", "DI", "MI", "XV", "LV", "CV", "DV", "MV", "LX", "CX", "DX",
				"MX", "CL", "DL", "ML", "DC", "MC", "MD" };
		int[] expect_result = { 6, 11, 51, 101, 501, 1001, 15, 55, 105, 505, 1005, 60, 110, 510, 1010, 150, 550, 1050,
				600, 1100, 1500 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}

	@Test
	void twoDigits_same() {
		System.out.println("-- twoDigits_larger --");
		String[] romanDigit = { "II", "XX", "CC", "MM" };
		int[] expect_result = { 2, 20, 200, 2000 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}

	@Test
	void multipleDigits_same() {
		System.out.println("-- multipleDigits_same --");
		String[] romanDigit = { "III", "XXX", "CCC", "MMM" };
		int[] expect_result = { 3, 30, 300, 3000 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}

	@Test
	void multipleDigits_larger() {
		System.out.println("-- multipleDigits_larger --");
		String[] romanDigit = { "XVI", "XXVI", "LXVI", "CLVI", "MDCCLI" };
		int[] expect_result = { 16, 26, 66, 156, 1751 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}

	@Test
	void multipleDigits_combi() {
		System.out.println("-- multipleDigits_larger --");
		String[] romanDigit = { "XIV", "XXIV", "XLVI", "CCLIV", "MMCCXL" };
		int[] expect_result = { 14, 24, 66, 254, 2240 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}
}
