package ro.ase.csie.cts.lab5.dp.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		System.out.println("The app started");
		

		DBConnection con1 = DBConnection.getDBConnection();
		DBConnection con2 = DBConnection.getDBConnection();
		DBConnection con3 = DBConnection.getDBConnection();

		if(con1 == con2 && con2 == con3) {
			System.out.println("They are referencing the same object");
		}
		
		
	}
	
}