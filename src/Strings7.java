/**
 * Java StringBuilder class is used to created mutable (modifiable) string.
 *
 * The StringBuilder class in java is same as String class except it is mutable i.e. it can be changed.
 *
 * The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized.
 * It is available since JDK 1.5.
 *
 * StringBuilder has three variations of Constructors:
 *      # StringBuilder(): creates an empty string builder with the initial capacity of 16.
 *      # StringBuilder(String str): creates a string builder with the specified string.
 *      # StringBuilder(int capacity): creates an empty string builder with the specified capacity as length.
 *
 */

public class Strings7
{
	public static void main(String[] args)
	{
		StringBuilder strBuf = new StringBuilder ( "String" );
		System.out.println ( strBuf );

		/*
		 * StringBuilder Methods
		 */

		/* StringBuilder Method : append( String subString ) <----------------------------------------------------------*/

		/*
		 * append( String subString ) : Concatenates the given argument with String provided as parameter.
		 *                              The append() method is overloaded like
		 *                              append(char),
		 *                              append(boolean),
		 *                              append(int),
		 *                              append(float),
		 *                              append(double) etc.
		 */

		StringBuilder strBuf1 = new StringBuilder ();
		strBuf1.append ( "Telephone" );
		System.out.println ( strBuf1 );

		/* StringBuilder Method : insert( int offset, String str) <-----------------------------------------------------*/

		/*
		 * insert( int offset, String str) :    Used to insert the specified string with this string
		 *                                      at the specified position.
		 *                                      The insert() method is overloaded like
		 *                                      insert(int, char),
		 *                                      insert(int, boolean),
		 *                                      insert(int, int),
		 *                                      insert(int, float),
		 *                                      insert(int, double) etc.
		 */

		StringBuilder strBuf2 = new StringBuilder ( "HelloWorld" );
		strBuf2.insert ( 5, "Galaxy" );
		System.out.println ( strBuf2 );

		/* StringBuilder Method : replace( String subString ) <---------------------------------------------------------*/

		/*
		 * replace(String subString):   Replaces the given string from the specified beginIndex and endIndex.
		 */

		StringBuilder strBuf3 = new StringBuilder ( "HelloGalaxyWorld" );
		strBuf3.replace ( 5,11, "Solar" );
		System.out.println ( strBuf3 );

		/* StringBuilder Method : delete(int beginIndex, int endIndex) <------------------------------------------------*/

		/*
		 * delete(int beginIndex, int endIndex) :   Deletes the string from the specified beginIndex to endIndex.
		 */

		StringBuilder strBuf4 = new StringBuilder ( "HelloWorld" );
		strBuf4.delete ( 5, 9 );
		System.out.println ( strBuf4 );

		/* StringBuilder Method : reverse() <---------------------------------------------------------------------------*/

		/*
		 * reverse():   Reverses the current string.
		 */

		StringBuilder strBuf5 = new StringBuilder ( "Malayalam" );
		strBuf5.reverse ();
		System.out.println ( strBuf5 );

		/* StringBuilder Method : capacity() <--------------------------------------------------------------------------*/

		/*
		 * By capacity, it means that how much space in StringBuilder is available for character storage.
		 * In the case when there are characters added to the StringBuilder instance,
		 * if those characters exceed the amount of capacity,
		 * StringBuilder increases tha capacity by ( oldCapacity * 2 ) + 2.
		 *
		 *          if ( length of StringBuilder instance > capacity of StringBuilder instance )
		 *                  StringBuilder instance size = ( oldCapacity * 2 ) + 2/
		 *
		 * For example if your current capacity is 16, it will be (16*2)+2=34.
		 *
		 * capacity():  The capacity() method of StringBuilder class returns the current capacity of the instance.
		 *              The default capacity of the instance is 16.
		 */

		StringBuilder strBuf6 = new StringBuilder ();
		System.out.println ( strBuf6.capacity () );
		strBuf6.append ( "Hello" );
		System.out.println ( strBuf6 );
		System.out.println ( strBuf6.capacity () );
		strBuf6.append ( "WorldsOfNarnia" );
		System.out.println ( strBuf6 );
		System.out.println ( strBuf6.length () );
		System.out.println ( strBuf6.capacity () );

		/*
		 * In above code, we have created a StringBuilder instance with no initial String in line 97.
		 *
		 * In line 98, We checked the capacity of our StringBuilder instance, and it returned 16.
		 *
		 * In line 99, We appended our StringBuilder instance with String "Hello",
		 * and checked its capacity in line 101, which again returned 16.
		 *
		 * In line 102. we appended our StringBuilder instance with String "WorldsOfNarnia".
		 *
		 * Now we have added 14 more characters which makes 19 characters in total,
		 * as output shown in line 104.
		 *
		 * Since, 19 > 16, so our StringBuilder gets it's capacity increased to
		 *          ( 16 * 2 ) + 2 = 34 characters of capacity.
		 *
		 * And, thus line 105 shows the new capacity of our StringBuilder instance as 34.
		 */

		/* StringBuilder Method : ensureCapacity( int value ) <---------------------------------------------------------*/

		/*
		 * ensureCapacity( int value ) :    The ensureCapacity() method of StringBuilder class ensures that the
		 *                                  given capacity is the minimum to the current capacity.
		 *                                  If it is greater than the current capacity,
		 *                                  it increases the capacity by ( oldCapacity * 2 ) + 2.
		 */

		StringBuilder strBuf7 = new StringBuilder ();
		System.out.println ( strBuf7.capacity () );
		strBuf7.append ( "Hello" );
		System.out.println ( strBuf7 );
		System.out.println ( strBuf7.capacity () );
		strBuf7.append ( "WorldsOfNarnia" );
		System.out.println ( strBuf7 );
		strBuf7.ensureCapacity ( 15 );
		System.out.println ( strBuf7.capacity () );
		strBuf7.ensureCapacity ( 45 );
		System.out.println ( strBuf7.capacity () );

		/*
		 * In the above code, from line 138 to 144, we have created an instance of StringBuilder class,
		 * checked the initial capacity, appended some String, checked the new capacity.
		 *
		 * With ensureCapacity() method, we are making this instance to increase the capacity
		 * of holding the characters to the minimum of number provided as the parameter of ensureCapacity.
		 *
		 * Now, in line 145, capacity of out StringBuilder before this statement is 34,
		 * and passing 15 as parameter to ensureCapacity() method means that allocation is not required.
		 *
		 * But, in line 147, passing 45 as parameter to ensureCapacity() method in our StringBuilder with capacity 34
		 * means that allocation is required to ensure that a minimum of 45 characters can be inserted
		 * in our StringBuilder instance.
		 *
		 * So, allocation happens in our StringBuilder instance as:
		 *           ( 34 * 2 ) + 2 = 70
		 *
		 * Thus, new capacity is 70 characters which can be seen as the output of line 148.
		 */
	}
}