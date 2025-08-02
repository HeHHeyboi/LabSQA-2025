// นายธนทัต ภู่แก้ว 663380211-0
package sqa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TVPlanBillTest {
	TVPlan plan;
	static int LEDTTestCount = 0;
	static int EEDTTestCount = 0;

	@ParameterizedTest
	@CsvFileSource(resources = "/LEDT_Data.csv", numLinesToSkip = 1)
	public void LEDTBillTest(String selectPackage, boolean offline_download, boolean live_service, boolean discout,
			double expectedResult) {
		LEDTTestCount++;
		TVPlan.TVPackage p = null;
		switch (selectPackage) {
			case "Standard":
				p = TVPlan.TVPackage.STANDARD;
				break;
			case "Premium":
				p = TVPlan.TVPackage.PREMIUM;
				break;
			case "Family":
				p = TVPlan.TVPackage.FAMILY;
				break;
		}

		plan = new TVPlan(offline_download, live_service, discout);
		double result = plan.pricePerMonth(p);
		assertEquals(expectedResult, result,
				String.format("\nTest Case:%d\nExpected bill: %f\nResult bill: %f\n", LEDTTestCount, expectedResult,
						result));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/EEDT_Data.csv", numLinesToSkip = 1)
	@DisplayName("Hello")
	public void EEDTBillTest(String selectPackage, boolean offline_download, boolean live_service, boolean discout,
			double expectedResult) {
		EEDTTestCount++;
		TVPlan.TVPackage p = null;
		switch (selectPackage) {
			case "Standard":
				p = TVPlan.TVPackage.STANDARD;
				break;
			case "Premium":
				p = TVPlan.TVPackage.PREMIUM;
				break;
			case "Family":
				p = TVPlan.TVPackage.FAMILY;
				break;
		}

		plan = new TVPlan(offline_download, live_service, discout);
		double result = plan.pricePerMonth(p);
		assertEquals(expectedResult, result,
				String.format("\nTest Case:%d\nExpected bill: %f\nResult bill: %f\n", EEDTTestCount, expectedResult,
						result));
	}
}
