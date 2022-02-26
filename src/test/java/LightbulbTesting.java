package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.lightbulb.*;

public class LightbulbTesting {
    // On/Off Expected Output
    private final static String Lightbulb_On_String_Expected_Output;
    private final static String Lightbulb_Off_String_Expected_Output;

    static {
    	Lightbulb_On_String_Expected_Output = "Lightbulb on";
    	Lightbulb_Off_String_Expected_Output  = "Lightbulb off"; }
    // Tests
    @Test //ON
    void Lightbulb_on_output_matches_expected_output() {
        Lightbulb lightBulb = new Lightbulb();
        assertEquals(Lightbulb_On_String_Expected_Output, lightBulb.getOnString()); }

    @Test //OFF
    void Lightbulb_off_output_matches_expected_output() {
        Lightbulb lightBulb = new Lightbulb();
        assertEquals(Lightbulb_Off_String_Expected_Output, lightBulb.getOffString()); }
}