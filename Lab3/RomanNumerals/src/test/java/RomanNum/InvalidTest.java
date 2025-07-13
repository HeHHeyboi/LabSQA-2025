package RomanNum;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class InvalidTest {

	RomanNumerals rn = new RomanNumerals();

	@Test
	void invalid_digits() {
		// assertNull(rn.convertRomanNumToInt("J"));
		assertThrows(NullPointerException.class, () -> {
			rn.convertRomanNumToInt("J");
		});
	}

	@Test
	void wrong_repeating_digits() {
		assertNotEquals(10, rn.convertRomanNumToInt("VV"));
		assertNotEquals(100, rn.convertRomanNumToInt("LL"));
		assertNotEquals(1000, rn.convertRomanNumToInt("DD"));
	}

	@Test
	void three_repeat_digits() {
		assertNotEquals(4, rn.convertRomanNumToInt("IIII"));
		assertNotEquals(40, rn.convertRomanNumToInt("XXXX"));
		assertNotEquals(400, rn.convertRomanNumToInt("CCCC"));
	}
}
