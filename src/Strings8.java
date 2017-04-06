/**
 * This program is to demonstrate the performance benchmark between String and StringBuffer class.
 *
 * Differences between String and StringBuffer class:
 *      1.  String : String class is immutable.
 *
 *          StringBuffer: StringBuffer class is mutable.
 *
 *      2.  String : String is slow and consumes more memory when you concat
 *                   too many strings because every time it creates new instance.
 *
 *          StringBuffer : StringBuffer is fast and consumes less memory when you concat strings.
 *
 *      3. String : String class overrides the equals() method of Object class.
 *                  So you can compare the contents of two strings by equals() method.
 *
 *         StringBuffer : StringBuffer class doesn't override the equals() method of Object class.
 */

class ConcatenationPerformance
{
	long startTime;
	long endTime;

	String stringConcatenation ()
	{
		String temp = "Saboteur";
		for ( int i = 0; i < 10000; ++i )
			temp = temp.concat ( "Dangerous" );
		return temp;
	}

	StringBuffer stringBufferConcatenation ()
	{
		StringBuffer temp = new StringBuffer ( "Saboteur" );
		for ( int i = 0; i < 10000; ++i )
			temp.append ( "Dangerous" );
		return temp;
	}
}

public class Strings8
{
	public static void main(String[] args)
	{
		ConcatenationPerformance concatenation = new ConcatenationPerformance ();

		concatenation.startTime = System.currentTimeMillis ();
		concatenation.stringConcatenation ();
		concatenation.endTime = System.currentTimeMillis ();

		System.out.println(
				"Time taken by Concatenating with String: "
				+ ( concatenation.endTime - concatenation.startTime )
				+ "ms"
		);

		concatenation.startTime = System.currentTimeMillis ();
		concatenation.stringBufferConcatenation ();
		concatenation.endTime = System.currentTimeMillis ();

		System.out.println(
				"Time taken by Concatenating with String Buffer: "
				+ ( concatenation.endTime - concatenation.startTime )
				+ "ms"
		);
	}
}