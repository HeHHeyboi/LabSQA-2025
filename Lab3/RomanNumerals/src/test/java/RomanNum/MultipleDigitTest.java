package RomanNum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultipleDigitTest {

	RomanNumerals rn = new RomanNumerals();

	@Test
	void multipleDigits_same() {
		// System.out.println("-- multipleDigits_same --");
		String[] romanDigit = { "III", "XXX", "CCC", "MMM" };
		int[] expect_result = { 3, 30, 300, 3000 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			// System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i],
			// expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}

	@Test
	void multipleDigits_larger() {
		// System.out.println("-- multipleDigits_larger --");
		String[] romanDigit = { "XVI", "XXVI", "LXVI", "CLVI", "MDCCLI" };
		int[] expect_result = { 16, 26, 66, 156, 1751 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			// System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i],
			// expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}

	@Test
	void multipleDigits_combi() {
		// System.out.println("-- multipleDigits_larger --");
		String[] romanDigit = { "XIV", "XXIV", "XLVI", "CCLIV", "MMCCXL" };
		int[] expect_result = { 14, 24, 66, 254, 2240 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			// System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i],
			// expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}
}
