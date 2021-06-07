package stepDefinitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import utils.SeleniumDriver;

public class BeforeActions  {

	@Before
    public static void setUp() throws InterruptedException {
        SeleniumDriver.setUpDriver();

    }

    @After
    public static void tearDown(){
	    SeleniumDriver.tearDown();
    }

}
