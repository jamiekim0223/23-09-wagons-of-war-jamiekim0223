import static java.lang.System.*;

public class WagonRunner
{
	public static void main( String[] args )
	{
		Wagon w = new Wagon( 9000, 3000 );	//single constructor that takes in miles       
													//driven and when to change the oxen
													//assumes wagon has never had an oxen change
													//sets last oxen change mileage to 0
		
		
		
		out.println( w.timeForOxenChange( ) );	//checks if it is time to change oxen
																	//returns true as 9000 is >= 3000
																	//resets last oxen change mileage to 0
		
		
		
		w.addMiles( 2000 );					//add 2000 miles to miles driven
		
		
		
		out.println( w.timeForOxenChange( ) );	//checks if it is time to change oxen
																	//wagon has driven 2000 miles since
																	//last oxen change – returns false
		
		
		
		w.addMiles( 2000 );					//add 2000 miles to miles driven
		
		
		
		out.println( w.timeForOxenChange( ) );	//checks if it is time to change oxen
																	//wagon has now driven 4000 miles since
																	//last oxen change – return true 
																	//4000 is >= 3000 so time to change oxen
					
	}
}
