package mavenjunit5demo.set1;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitConvertersTest4Assumptions {

	@Test
	void assumptionTest() {
		boolean serverStatus=false;
		assumeTrue(serverStatus);
	}
	/*
	@Test
	void assertionTest() {
		boolean serverStatus=false;	
		assertTrue(serverStatus);
	}
	*/
}
