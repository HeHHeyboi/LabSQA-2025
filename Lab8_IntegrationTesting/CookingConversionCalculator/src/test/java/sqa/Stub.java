// นายธนทัต ภู่แก้ว 663380211-0
package sqa;

public class Stub {
	public static class MassCovertStub extends MassConverter {
		@Override
		public double getConversionFactor(String fromUnit, String toUnit) {
			return 10;
		}
	}

	public static class LiquidCovertStub extends LiquidVolumeConverter {
		@Override
		public double getConversionFactor(String fromUnit, String toUnit) {
			return 10;
		}
	}
}
