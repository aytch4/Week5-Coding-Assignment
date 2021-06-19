



//9, 10, 11.

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger astLogger = new AsterickLogger();
		
		astLogger.log("Hello");
		astLogger.error("OhNo");
		
		Logger spcLogger = new SpacedLogger();
		
		spcLogger.log("Hello");
		spcLogger.error("OhNo");
	}

}
