// นายธนทัต ภู่แก้ว 63380211-0
package sqa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class TestingStub {
	CookingConversionCalculator cCalculator = new CookingConversionCalculator();
	CookingStub cStub = new CookingStub();

	@ParameterizedTest
	@CsvSource(value = { "temperature,30.0", "mass,5.0", "liquid,5.0" })
	public void TestCookingStub(String choice, double expected) {
		double value = 0;
		String fromUnit = "";
		String toUnit = "";
		double result = cStub.convert(value, choice, fromUnit, toUnit);
		assertEquals(expected, result,
				"\nInput: %f, %s, %s\nExpected: %f\nGet: %f\n".formatted(value, fromUnit, toUnit, expected, result));
	}

	private static Stream<Arguments> TemperatureParam() {
		return Stream.of(Arguments.of(32, "fahrenheit", "celsius", 0), Arguments.of(0, "celsius", "fahrenheit", 32));
	}

	@ParameterizedTest
	@MethodSource("TemperatureParam")
	public void TestTemperatureConverter(double value, String fromUnit, String toUnit, double expected) {
		String choice = "temperature";
		double result = cCalculator.convert(value, choice, fromUnit, toUnit);
		assertEquals(expected, result,
				"\nInput: value %f, choice '%s', from '%s' to '%s'\nExpected: %f\nGet: %f\n".formatted(value, choice,
						fromUnit, toUnit, expected, result));
	}

	@ParameterizedTest
	@CsvSource({ "1,10" })
	public void TestMassCovertStub(double value, double expected) {
		Stub.MassCovertStub mStub = new Stub.MassCovertStub();
		double result = mStub.convert(value, "", "");
		assertEquals(expected, result,
				"\nInput: %f\nExpected: %f\nGet: %f\n".formatted(value, expected, result));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/TestMassCoverterData.csv", numLinesToSkip = 1)
	public void TestMassCoverter(String fromUnit, String toUnit, double expected) {
		double value = 1.0;
		String choice = "mass";
		double result = cCalculator.convert(value, choice, fromUnit, toUnit);
		assertEquals(expected, result,
				"\nInput: value %f, choice '%s', from '%s' to '%s'\nExpected: %f\nGet: %f\n".formatted(value, choice,
						fromUnit, toUnit, expected, result));
	}

	@ParameterizedTest
	@CsvSource({ "1,10" })
	public void TestLiquidConvertStub(double value, double expected) {
		Stub.LiquidCovertStub lStub = new Stub.LiquidCovertStub();
		double result = lStub.convert(value, "", "");
		assertEquals(expected, result,
				"\nInput: %f\nExpected: %f\nGet: %f\n".formatted(value, expected, result));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/TestLiquidCoverterData.csv", numLinesToSkip = 1)
	public void TestLiquidCoverter(String fromUnit, String toUnit, double expected) {
		double value = 1.0;
		String choice = "liquid";
		double result = cCalculator.convert(value, choice, fromUnit, toUnit);
		assertEquals(expected, result,
				"\nInput: value %f, choice '%s', from '%s' to '%s'\nExpected: %f\nGet: %f\n".formatted(value, choice,
						fromUnit, toUnit, expected, result));
	}
}
