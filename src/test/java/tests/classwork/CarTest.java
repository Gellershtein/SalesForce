package tests.classwork;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Log4j2
public class CarTest {


    @Test
    public void carTest() {
        Car bmw = CarFactory.get();
        Car mercedes = CarFactory.get();
        log.fatal("FATAL");
        log.error("ERROR");
        log.warn("WARNING");
        log.info("INFO");
        log.debug("DEBUG");
        log.trace("TRACE");

        assertEquals(bmw, mercedes);
    }
}
