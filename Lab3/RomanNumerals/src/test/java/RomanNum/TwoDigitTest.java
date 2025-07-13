package RomanNum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName(value = "hello")
public class TwoDigitTest {
	RomanNumerals rn = new RomanNumerals();

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

		boolean testPass = true;

		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			// if (expect_result[i] != result) {
			// testPass = false;
			// // break;
			// }
			assertEquals(expect_result[i], result);
		}

		// assertTrue(testPass);
	}

	@Test
	void twoDigits_same() {
		System.out.println("-- twoDigits_larger --");
		String[] romanDigit = { "II", "XX", "CC", "MM" };
		int[] expect_result = { 2, 20, 200, 2000 };

		boolean testPass = true;
		for (int i = 0; i < romanDigit.length; i++) {
			int result = rn.convertRomanNumToInt(romanDigit[i]);
			System.out.printf("Input: %s\nExpected: %d\nGet: %d\n\n", romanDigit[i], expect_result[i], result);
			// if (expect_result[i] != result) {
			// testPass = false;
			// // break;
			// }
			assertEquals(expect_result[i], result);
		}

		// assertTrue(testPass);
	}
}
