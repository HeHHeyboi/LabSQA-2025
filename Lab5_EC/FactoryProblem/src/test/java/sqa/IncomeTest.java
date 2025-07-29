// นายธนทัต ภู่แก้ว 663380211-0
package sqa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class IncomeTest {
	Income i = new Income();

	@ParameterizedTest
	@CsvFileSource(resources = "/IncomeTestData.csv", numLinesToSkip = 1)
	void TestIncome(int num_impeller, int num_motor, int num_cover, int expectedIncome) {
		assertEquals(expectedIncome, i.calculateIncome(num_impeller, num_motor, num_cover));
	}
}
