package sqa;

public class CookingDriver {
	static void TemperatureConverterTest(TemperatureConverter t) {
		System.out.println("--- Test TemperatureConverter ---");
		double tempValue = 32;
		double expectedResult = 0;
		String fromUnit = "fahrenheit";
		String toUnit = "celsius";

		double result = t.convert(tempValue, fromUnit, toUnit);
		System.out.println("Input: value %f, from '%s' to '%s'\nExpected: %f\nGet: %f\n".formatted(tempValue, fromUnit,
				toUnit, expectedResult, result));
	}

	static void getMassConversionFactorTest(MassConverter m) {
		System.out.println("--- Test MassConverter Factor ---");
		String fromUnit = "cup";
		String toUnit = "gram";
		double expectedFactor = 125;
		double result = m.getConversionFactor(fromUnit, toUnit);

		System.out.println("Input: from '%s' to '%s'\nExpected Factor: %f\nGet: %f\n".formatted(fromUnit,
				toUnit, expectedFactor, result));
	}

	static void MassConverterTest(MassConverter m) {
		System.out.println("--- Test MassConverter Result ---");
		double value = 1;
		String fromUnit = "tablespoon";
		String toUnit = "gram";
		double expectedResult = 8;
		double result = m.convert(value, fromUnit, toUnit);

		System.out.println("Input: value %f from '%s' to '%s'\nExpected Result: %f\nGet: %f\n".formatted(value,
				fromUnit, toUnit, expectedResult, result));
	}

	static void getLiquidCoversionFactorTest(LiquidVolumeConverter l) {
		System.out.println("--- Test LiquidVolumeConvert Factor ---");
		String fromUnit = "cup";
		String toUnit = "ml";
		double expectedFactor = 250;
		double result = l.getConversionFactor(fromUnit, toUnit);

		System.out.println("Input: from '%s' to '%s'\nExpected Factor: %f\nGet: %f\n".formatted(fromUnit,
				toUnit, expectedFactor, result));
	}

	static void LiquidCoverterTest(LiquidVolumeConverter l) {
		System.out.println("--- Test LiquidVolumeCoverter Result ---");
		double value = 1;
		String fromUnit = "cup";
		String toUnit = "oz";
		double expectedResult = 8;
		double result = l.convert(value, fromUnit, toUnit);

		System.out.println("Input: value %f from '%s' to '%s'\nExpected Result: %f\nGet: %f\n".formatted(value,
				fromUnit, toUnit, expectedResult, result));

	}

	public static void main(String[] args) {
		System.out.println("-- Bottom to Top Integration Test--");
		CookingConversionCalculator calculator = new CookingConversionCalculator();
		TemperatureConverter t = new TemperatureConverter();
		MassConverter m = new MassConverter();
		LiquidVolumeConverter l = new LiquidVolumeConverter();

		double[] inputValues = { 0, 1, 1 };
		String[] choices = { "temperature", "mass", "liquid" };
		String[] fromUnits = { "celsius", "teaspoon", "tablespoon" };
		String[] toUnits = { "fahrenheit", "gram", "ml" };
		double[] expectedResults = { 32, 3, 15 };

		TemperatureConverterTest(t);
		getMassConversionFactorTest(m);
		MassConverterTest(m);
		getLiquidCoversionFactorTest(l);
		LiquidCoverterTest(l);

		System.out.println("-- CookingConversionCalculator Result --");
		for (int i = 0; i < inputValues.length; i++) {
			double value = inputValues[i];
			String choice = choices[i];
			String fromUnit = fromUnits[i];
			String toUnit = toUnits[i];
			double expectedResult = expectedResults[i];

			double result = calculator.convert(value, choice, fromUnit, toUnit);
			System.out.println("Input: value %f, from '%s' to '%s'\nExpected: %f\nGet: %f\n".formatted(value,
					fromUnit, toUnit, expectedResult, result));
		}
	}
}
