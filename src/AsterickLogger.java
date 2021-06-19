

//3a.
public class AsterickLogger implements Logger{

	//4.
	@Override
	public void log(String str) {
		System.out.println("***" + str + "***\n");
	}

	//5.
	@Override
	public void error(String err) {
		
		System.out.println("**********" + err.replaceAll(".",  "*") + "***\n");
		System.out.println("***ERROR: " + err +"***\n");
		System.out.println("**********" + err.replaceAll(".",  "*") + "***\n");
		}
		

	
	

}
