package sqa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ClumpWordCoverageTest {
	CountWordClumps cwc = new CountWordClumps();
	
	@ParameterizedTest
	@MethodSource("DefaultParam")
	void CountClumpsTest(int[] inputArray,int expectedResult) {
		int result = CountWordClumps.countClumps(inputArray);
		assertEquals(expectedResult,result);
	}
	
	private static Stream<Arguments> DefaultParam(){
		int[] tc01 = {};
		int[] tc02 = {1,1,1,2,2};
		int[] tc03 = null;
		int[] tc04 = {1,2,3,4};

		return Stream.of(
				Arguments.of(tc01,0),
				Arguments.of(tc02,2),
				Arguments.of(tc03,0),
				Arguments.of(tc04,0));
	}
}
