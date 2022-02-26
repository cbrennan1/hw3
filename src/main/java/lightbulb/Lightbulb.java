package main.java.lightbulb;

public class Lightbulb implements LightbulbInterface {

	// When turned on the light bulb will print to stdout "Lightbulb on". 
	// When turned off the light bulb will print to stdout "Lightbulb off."
	private final static String lightBulbOnString = "Lightbulb on";
    private final static String lightBulbOffString = "Lightbulb off";

    // The Light bulb responds to on() and off() messages
    @Override
    public void on() {
        System.out.println(lightBulbOnString); }
    @Override
    public void off() {
        System.out.println(lightBulbOffString); }
    // Get On/Off String
    @Override
    public String getOnString() {
        return lightBulbOnString; }
    @Override
    public String getOffString() {
        return lightBulbOffString; }
}
