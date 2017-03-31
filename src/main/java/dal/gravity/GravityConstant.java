package dal.gravity;

public class GravityConstant implements GravityModel {

	private double gravitationalField;
	
	public GravityConstant (double g) {
		gravitationalField = g;
	}
	
	public double getGravitationalField ( ) {
		return gravitationalField;
	}
	
}
