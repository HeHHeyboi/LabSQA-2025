// นายธนทัต บุญยานันท์ 663380211-0
package SQA;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class NormalBoundaryTest {
	Ranking rank = new Ranking();
	static int count = 0;

	@BeforeEach
	void Count() {
		count++;
		System.out.println("Rank Test: " + count);
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/NormalBoundaryData.csv", numLinesToSkip = 1)
	void NormalBoundDaryRankTest(int purchaseTotal, int frequency, int pointCollected, String expectedRank) {
		var result = rank.CalculateMembershipRank(purchaseTotal, frequency, pointCollected);
		System.out.printf("Expect %s, Get %s\nParam: purchaseTotal = %d, frequency = %d, pointCollected = %d\n",
				expectedRank, result, purchaseTotal, frequency, pointCollected);

		assertEquals(expectedRank, result);
	}
}
