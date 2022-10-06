package mavenjunit5demo.set1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class UnitConvertersTest5DynamicTest {

	@TestFactory
	Collection<DynamicTest> dynamicTestWithCollection() {
		return Arrays.asList(
			DynamicTest.dynamicTest("Meter to Centimeter Convertion",
					()->assertEquals(100, UnitConverters.convertMeterToCentimeter(1))),
			DynamicTest.dynamicTest("Meter to Feet Convertion",
					()->assertEquals(3.3, UnitConverters.convertMeterToFeet(1))),
			DynamicTest.dynamicTest("Meter to Kilometer Convertion", 
					()->assertEquals(1.0, UnitConverters.convertMeterToKiloMeter(1000.00)))
			);
			
		
	}

}
