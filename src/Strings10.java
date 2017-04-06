/**
 * This program is to demonstrate the performance benchmark between String and StringBuffer class.
 *
 * Difference between StringBuffer and StringBuilder classes:
 *      1.  StringBuffer :  StringBuffer is synchronized i.e. thread safe.
 *                          It means two threads can't call the methods of StringBuffer simultaneously.
 *
 *          StringBuilder : StringBuilder is non-synchronized i.e. not thread safe.
 *                          It means two threads can call the methods of StringBuilder simultaneously.
 *
 *      2.  StringBuffer :  StringBuffer is less efficient than StringBuilder.
 *
 *          StringBuilder : StringBuilder is more efficient than StringBuffer.
 */
class AppendPerformance
{
	long startTime;
	long endTime;

	StringBuffer stringBufferAppend()
	{
		StringBuffer temp = new StringBuffer ( "Holo" );
		for ( int i = 0; i < 10000; ++i )
			temp.append ( "Lens" );
		return temp;
	}

	StringBuilder stringBuilderAppend()
	{
		StringBuilder temp = new StringBuilder ( "Holo" );
		for ( int i = 0; i < 10000; ++i )
			temp.append ( "Lens" );
		return temp;
	}
}

public class Strings10
{
	public static void main ( String[] args )
	{
		AppendPerformance performance = new AppendPerformance ();

		performance.startTime = System.currentTimeMillis ();
		performance.stringBufferAppend ();
		performance.endTime = System.currentTimeMillis ();

		System.out.println(
				"Time taken by Concatenating with String: "
				+ ( performance.endTime - performance.startTime )
				+ "ms"
		);

		performance.startTime = System.currentTimeMillis ();
		performance.stringBuilderAppend ();
		performance.endTime = System.currentTimeMillis ();

		System.out.println(
				"Time taken by Concatenating with String: "
				+ ( performance.endTime - performance.startTime )
				+ "ms"
		);
	}
}