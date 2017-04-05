public class Strings5
{
	public static void main ( String[] args )
	{
		/* String Method : toLowerCase() and toUpperCase() <---------------------------*/

		/*
		 * toLowerCase() : Returns String with all lower case characters.
		 * toUpperCase() : Returns String with all upper case characters.
		 */

		String str1 = "Lamborghini";
		System.out.println ( str1.toLowerCase () );
		System.out.println ( str1.toUpperCase () );
		System.out.println ( str1 );

		/* String Method : trim() <-----------------------------------------------------*/

		/*
		 * trim() : Returns a String with whitespace (if any)
		 *          removed from Start and End of String.//
		 */

		String str2 = " Ferrari ";
		System.out.println ( str2 );
		System.out.println ( str2.trim () );

		/* String Method : charAt( index ) <---------------------------*/

		/*
		 * charAt(index) :  Returns a character residing at the index given as parameter of String.
		 *                  If the index value is not within 0 and length of String,
		 *                  StringIndexOutOfBoundsException will be thrown.
		 */

		String str3 = "Pagani";
		System.out.println ( str3.charAt ( 0 ) );
		System.out.println ( str3.charAt ( 4 ) );
		/*System.out.println ( str3.charAt ( 7 ) );*/

		/*
		 * Uncomment line 39, and a runtime exception StringIndexOutOfBoundsException will be thrown.
		 */

		/* String Method : length() <---------------------------*/

		/*
		 * length() :   Returns an Integer denoting the length of String.
		 */

		String str4 = "Volkswageen";
		System.out.println ( str4.length () );

		/* String Method : intern() <---------------------------*/

		String str5 = new String("BMW");
		String str6 = str5.intern ();
		System.out.println ( str5 );
		System.out.println ( str6 );

		/*
		 * A pool of strings, initially empty, is maintained privately by the class String.
		 * When the intern method is invoked,
		 * if the pool already contains a string equal to this String object as determined by the equals(Object) method,
		 * then the string from the pool is returned.
		 * Otherwise, this String object is added to the pool and a reference to this String object is returned.
		 */

		/* String Method : valueOf ( any_data_type ) <---------------------------*/

		/*
		 * valueOf( any_data_type ) :  Returns the String equivalent of any type of data passed as a parameter.
		 */

		double pi = 3.14159;
		String str7 = String.valueOf ( pi );
		System.out.println ( str7 );

		/* String Method : replace ( sub-String ) <---------------------------*/

		/*
		 * valueOf( any_data_type ) :  Returns the String equivalent of any type of data passed as a parameter.
		 */

		String str8 = "This is Bill. Bill does not Steal. Bill is Original. Be like Bill.";
		String str9 = str8.replace ( "Bill", "Jack" );
		System.out.println ( str8 );
		System.out.println ( str9 );
	}
}