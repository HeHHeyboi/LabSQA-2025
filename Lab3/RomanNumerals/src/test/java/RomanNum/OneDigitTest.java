package RomanNum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OneDigitTest {
	RomanNumerals rn = new RomanNumerals();

	@Test
	void singleDigit() {
		// System.out.println("-- singleDigit --");
		String[] romanDigit = { "I", "V", "X", "L", "C", "D", "M" };
		int[] expect_result = { 1, 5, 10, 50, 100, 500, 1000 };

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			// System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i],
			// expect_result[i], result);
			assertEquals(expect_result[i], result);
		}
	}
}
