// นายธนทัต ภู่แก้ว 663380211-0
package sqa;

public class CookingStub extends CookingConversionCalculator {
	@Override
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		double result = 0.0;

		TemperatureStub t = new TemperatureStub();
		MassStub m = new MassStub();
		LiquidStub l = new LiquidStub();
		switch (choice) {
			case "temperature":
				result = t.convert(value, fromUnit, toUnit);
				break;
			case "mass":
				result = m.convert(value, fromUnit, toUnit);
				break;
			case "liquid":
				result = l.convert(value, fromUnit, toUnit);
				break;
		}
		return result;
	}

	private class TemperatureStub {
		public double convert(double value, String fromUnit, String toUnit) {
			return 30.0;
		}
	}

	private class MassStub {
		public double convert(double value, String fromUnit, String toUnit) {
			return 5;
		}
	}

	private class LiquidStub {
		public double convert(double value, String fromUnit, String toUnit) {
			return 5;
		}
	}

}
