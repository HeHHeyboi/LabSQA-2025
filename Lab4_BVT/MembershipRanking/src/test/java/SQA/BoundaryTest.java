package SQA;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BoundaryTest {
	Ranking rank = new Ranking();

	@ParameterizedTest
	@CsvFileSource(resources = "/NormalBoundaryData.csv", numLinesToSkip = 1)
	void RandTest(int purchaseTotal, int frequency, int pointCollected, String expectedRank) {
		var result = rank.CalculateMembershipRank(purchaseTotal, frequency, pointCollected);
		System.out.printf("Expect %s, Get %s\nParam: purchaseTotal = %d, frequency = %d, pointCollected = %d\n",
				expectedRank, result, purchaseTotal, frequency, pointCollected);

		assertEquals(expectedRank, result);
	}
}
