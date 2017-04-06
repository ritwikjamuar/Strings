/**
 * Java StringBuffer class is used to created mutable (modifiable) string.
 * The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
 *
 * Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously.
 * So it is safe and will result in an order.
 *
 * StringBuffer has three variations of Constructors:
 *      # StringBuffer(): creates an empty string buffer with the initial capacity of 16.
 *      # StringBuffer(String str): creates a string buffer with the specified string.
 *      # StringBuffer(int capacity): creates an empty string buffer with the specified capacity as length.
 *
 */

public class Strings6
{
	public static void main(String[] args)
	{
		StringBuffer strBuf = new StringBuffer ( "String" );
		System.out.println ( strBuf );

		/*
		 * StringBuffer Methods
		 */

		/* StringBuffer Method : append( String subString ) <-----------------------------------------------------------*/

		/*
		 * append( String subString ) : Concatenates the given argument with String provided as parameter.
		 *                              The append() method is overloaded like
		 *                              append(char),
		 *                              append(boolean),
		 *                              append(int),
		 *                              append(float),
		 *                              append(double) etc.
		 */

		StringBuffer strBuf1 = new StringBuffer ();
		strBuf1.append ( "Telephone" );
		System.out.println ( strBuf1 );

		/* StringBuffer Method : insert( int offset, String str) <------------------------------------------------------*/

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

		StringBuffer strBuf2 = new StringBuffer ( "HelloWorld" );
		strBuf2.insert ( 5, "Galaxy" );
		System.out.println ( strBuf2 );

		/* StringBuffer Method : replace( String subString ) <----------------------------------------------------------*/

		/*
		 * replace(String subString):   Replaces the given string from the specified beginIndex and endIndex./
		 */
		StringBuffer strBuf3 = new StringBuffer ( "HelloGalaxyWorld" );
		strBuf3.replace ( 5,11, "Solar" );
		System.out.println ( strBuf3 );

		/* StringBuffer Method : delete(int beginIndex, int endIndex) <-------------------------------------------------*/

		/*
		 * delete(int beginIndex, int endIndex) :   Deletes the string from the specified beginIndex to endIndex.
		 */

		StringBuffer strBuf4 = new StringBuffer ( "HelloWorld" );
		strBuf4.delete ( 5, 9 );
		System.out.println ( strBuf4 );

		/* StringBuffer Method : reverse() <----------------------------------------------------------------------------*/

		/*
		 * reverse():   Reverses the current string.
		 */

		StringBuffer strBuf5 = new StringBuffer ( "Malayalam" );
		strBuf5.reverse ();
		System.out.println ( strBuf5 );

		/* StringBuffer Method : capacity() <---------------------------------------------------------------------------*/

		/*
		 * By capacity, it means that how much space in StringBuffer is available for character storage.
		 * In the case when there are characters added to the StringBuffer instance,
		 * if those characters exceed the amount of capacity,
		 * StringBuffer increases tha capacity by ( oldCapacity * 2 ) + 2.
		 *
		 *          if ( length of StringBuffer instance > capacity of StringBuffer instance )
		 *                  StringBuffer instance size = ( oldCapacity * 2 ) + 2/
		 *
		 * For example if your current capacity is 16, it will be (16*2)+2=34.
		 *
		 * capacity():  The capacity() method of StringBuffer class returns the current capacity of the buffer.
		 *              The default capacity of the buffer is 16.
		 */

		StringBuffer strBuf6 = new StringBuffer ();
		System.out.println ( strBuf6.capacity () );
		strBuf6.append ( "Hello" );
		System.out.println ( strBuf6 );
		System.out.println ( strBuf6.capacity () );
		strBuf6.append ( "WorldsOfNarnia" );
		System.out.println ( strBuf6 );
		System.out.println ( strBuf6.length () );
		System.out.println ( strBuf6.capacity () );

		/*
		 * In above code, we have created a StringBuffer instance with no initial String in line 97.
		 *
		 * In line 98, We checked the capacity of our StringBuffer instance, and it returned 16.
		 *
		 * In line 99, We appended our StringBuffer instance with String "Hello",
		 * and checked its capacity in line 101, which again returned 16.
		 *
		 * In line 102. we appended our StringBuffer instance with String "WorldsOfNarnia".
		 *
		 * Now we have added 14 more characters which makes 19 characters in total,
		 * as output shown in line 104.
		 *
		 * Since, 19 > 16, so our StringBuffer gets it's capacity increased to
		 * (16*2)+2 = 34 characters of capacity.
		 *
		 * And, thus line 105 shows the new capacity of our StringBuffer instance as 34.
		 */

		/* StringBuffer Method : ensureCapacity( int value ) <----------------------------------------------------------*/

		/*
		 * ensureCapacity( int value ) :    The ensureCapacity() method of StringBuffer class ensures that the
		 *                                  given capacity is the minimum to the current capacity.
		 *                                  If it is greater than the current capacity,
		 *                                  it increases the capacity by ( oldCapacity * 2 ) + 2.
		 */

		StringBuffer strBuf7 = new StringBuffer ();
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
		 * In the above code, from line 138 to 144, we have created an instance of StringBuffer class,
		 * checked the initial capacity, appended some String, checked the new capacity.
		 *
		 * With ensureCapacity() method, we are making this instance to increase the capacity
		 * of holding the characters to the minimum of number provided as the parameter of ensureCapacity.
		 *
		 * Now, in line 145, capacity of out StringBuffer before this statement is 34,
		 * and passing 15 as parameter to ensureCapacity() method means that allocation is not required.
		 *
		 * But, in line 147, passing 45 as parameter to ensureCapacity() method in our StringBuffer with capacity 34
		 * means that allocation is required to ensure that a minimum of 45 characters can be inserted
		 * in our StringBuffer instance.
		 *
		 * So, allocation happens in our StringBuffer instance as:
		 *           ( 34 * 2 ) + 2 = 70
		 *
		 * Thus, new capacity is 70 characters which can be seen as the output of line 148.
		 */
	}
}