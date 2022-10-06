package mavenjunit5demo.set1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class UnitConvertersTest1 {

	@Test
	void convertMeterToCentimeterTestSuccess() {
		assertEquals(100,UnitConverters.convertMeterToCentimeter(1));
	}
	@Test
	void convertMeterToCentimeterTestFail() {
		assertNotEquals(200,UnitConverters.convertMeterToCentimeter(1));
	}
	@Test
	@Disabled
	void convertMeterToCentimeterTestDisabled() {
		
	}
	@Test
	@DisplayName("my test name")
	void convertMeterToCentimeterTestDisplayName() {
		
	}
	
	@RepeatedTest(3)
void convertMeterToCentimeterRepeatedTest() {
		System.out.println("repeated test");
	}
}
