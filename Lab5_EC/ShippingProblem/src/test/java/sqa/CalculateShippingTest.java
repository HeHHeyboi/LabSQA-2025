// นายธนทัต ภู่แก้ว 663380211-0
package sqa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculateShippingTest {
	ShippingVehicle sv = new ShippingVehicle();
	static int count = 0;

	@ParameterizedTest
	@MethodSource("provideShippingData")
	void TestCalculate(int smallBox, int mediumBox, int largeBox, Integer[] expectedResult) {
		count++;
		Integer[] result = (Integer[]) sv.calculate(smallBox, mediumBox, largeBox).toArray(new Integer[0]);
		assertArrayEquals(expectedResult, result,
				String.format("\nTest Case: %d\nExpect: %s\nGet: %s\n", count, Arrays.toString(expectedResult),
						Arrays.toString(result)));

	}

	private static Stream<Arguments> provideShippingData() {
		Integer[] tc01 = { 0, 0, 0 };
		Integer[] tc02 = { 0, 0, 250 };
		Integer[] tc03 = { 0, 100, 0 };
		Integer[] tc04 = { 50, 0, 0 };
		Integer[] tc05 = { 0, 0, 500 };
		Integer[] tc06 = { 0, 200, 0 };
		Integer[] tc07 = { 100, 0, 0 };
		Integer[] tc08 = { -1 };
		Integer[] tc09 = { -1 };
		Integer[] tc10 = { -1 };
		Integer[] tc11 = { 0, 200, 250 };
		Integer[] tc12 = { 50, 0, 250 };
		Integer[] tc13 = { 50, 200, 0 };
		Integer[] tc14 = { -1 };
		return Stream.of(Arguments.of(0, 0, 0, tc01),
				Arguments.of(250, 0, 0, tc02),
				Arguments.of(0, 100, 0, tc03),
				Arguments.of(0, 0, 50, tc04),
				Arguments.of(500, 0, 0, tc05),
				Arguments.of(0, 200, 0, tc06),
				Arguments.of(0, 0, 100, tc07),
				Arguments.of(501, 0, 0, tc08),
				Arguments.of(0, 251, 0, tc09),
				Arguments.of(0, 0, 101, tc10),
				Arguments.of(250, 200, 0, tc11),
				Arguments.of(250, 0, 50, tc12),
				Arguments.of(0, 200, 50, tc13),
				Arguments.of(250, 200, 50, tc14));

	}

}
