package mavenjunit5demo.set1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitConvertersTest3Logger {
 static FileHandler handler;
 static Logger log=Logger.getLogger("Unit Converters Logger Details");
 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		handler= new FileHandler("testlogger.log", true);
		log.addHandler(handler);
		log.info("Before all anotation method got executed");
		
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		log.info("After all anotation method got executed");
	}

	@BeforeEach
	void setUp() throws Exception {
		log.info("Before Each anotation method got executed");
	}

	@AfterEach
	void tearDown() throws Exception {
		log.info("After Each anotation method got executed");
	}

	@Test
	void test() {
		log.info("Test anotation method got executed");
	}

}
