package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.lightbulb.Lightbulb;

public class Lightbulb_Testing {
    // String fixtures
    private final static String Light_bulb_on_string_expected_output;
    private final static String Light_bulb_off_string_expected_output;

    static {
    	Light_bulb_on_string_expected_output = "Lightbulb on";
    	Light_bulb_off_string_expected_output  = "Lightbulb off";
    }

    @Test
    void lightBulbOnOutputMatchesExpectedOutPut() {
        Lightbulb lightBulb = new Lightbulb();
        assertEquals(Light_bulb_on_string_expected_output, lightBulb.getOnString());
    }

    @Test
    void lightBulbOffOutMatchesExpectedOutput() {
        Lightbulb lightBulb = new Lightbulb();
        assertEquals(Light_bulb_off_string_expected_output, lightBulb.getOffString());
    }
}