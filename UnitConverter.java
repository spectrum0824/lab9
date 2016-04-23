/*
 * @author Tanapon Meesat
 * for converting value by input from GUI
 */
public class UnitConverter {
	public double convert(double amount , Unit fromUnit , Unit toUnit){
		return (amount*fromUnit.getValue())/toUnit.getValue();
	}
	public Unit[] getUnits(){
		return Length.values();
	}
}