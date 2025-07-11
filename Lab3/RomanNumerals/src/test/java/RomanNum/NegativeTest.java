package RomanNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NegativeTest {
	RomanNumerals rn = new RomanNumerals();

	@Test
	void invalid_digits() {
		assertNull(rn.convertRomanNumToInt("J"));
		// assertThrows(NullPointerException.class, () -> {
		// rn.convertRomanNumToInt("J");
		// });
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
