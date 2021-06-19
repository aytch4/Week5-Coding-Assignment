

//3b.
public class SpacedLogger implements Logger{

	//6,7.
	@Override
	public void log(String str) {
		System.out.println(str.replace("", " ").trim() + "\n");
	}

	
	//8.
	@Override
	public void error(String err) {
		System.out.println("ERROR: " + err.replace("", " ").trim() + "\n");
		
	}

}
