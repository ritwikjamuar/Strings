/**
 * This code is to demonstrate the Hash Code Test between String and StringBuffer.
 */

public class Strings9
{
	public static void main(String[] args)
	{
		String string = "Ethical";
		System.out.println ( string );
		System.out.println ( string.hashCode () );
		string += "Hacking";
		System.out.println ( string );
		System.out.println ( string.hashCode () );

		/*
		 * In the above code, From line 9 to line 11, we have created new Instance of String with "Ethical as
		 * its String value, and we're printing this String value as well as it's hash code.
		 *
		 * In line 12, we are appending our string with new Sub String, so that will cause this string to
		 * create new Instance of String with previous and new values appended.
		 * The very reason why a new instance of String is created when appended is that String class is immutable.
		 *
		 * Thus, in line 14, we get different Hash Code.
		 */

		StringBuffer stringBuffer = new StringBuffer ( "Splinter" );
		System.out.println ( "\n"+stringBuffer );
		System.out.println ( stringBuffer.hashCode () );
		stringBuffer.append ( "Cell" );
		System.out.println ( stringBuffer );
		System.out.println ( stringBuffer.hashCode () );

		/*
		 * For the above code, when we print out the hash code, we get the same value, as in line 28 and 31.
		 * This is because StringBuffer is mutable, so no new instance is created when we append with some String.
		 */
	}
}