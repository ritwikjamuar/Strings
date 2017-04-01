/**
 * String is the array of characters.
 * String represents characters in the contiguous fashion.
 * String class implements Serializable, Comparable and CharSequence interfaces.
 *
 * The CharSequence interface is used to represent sequence of characters.
 * It is implemented by String, StringBuffer and StringBuilder classes.
 * It means, we can create string in java by using these 3 classes.
 *
 * The java String is immutable i.e. it cannot be changed.
 * Whenever we change any string, a new instance is created.
 * For mutable string, you can use StringBuffer and StringBuilder classes./
 *
 * Generally, string is a sequence of characters.
 * But in java, string is an object that represents a sequence of characters.
 * The java.lang.String class is used to create string object.
 *
 * There are two ways by which we can create String:
 # String literal.
 # new keyword.
 *
 * When String object is created using String Literal,
 * then those objects are stored in a special memory area known as string constant pool.
 * This make Java more memory efficient, since no new objects are created if it exists already in string constant pool.
 *
 *
 */

public class Strings0
{
	public static void main ( String[] args )
	{
		String name = "Android";
		String title = "Android";

		/*
		 * When we create a String object using literals, the JVM checks the string constant pool first.
		 * If the string already exists in the pool, a reference to the pooled instance is returned.
		 * If string doesn't exist in the pool, a new string instance is created and placed in the pool.
		 * This makes Java more memory efficient.
		 *
		 * Here, name is instantiated with "Android" string.
		 * Since "Android" string does not exist in the String Constant Pool,
		 * thus new String instance will be created.
		 *
		 * Now, title is instantiated with "Android" string.
		 * "Android" string now exists in the String Constant Pool,
		 * so new instance of String will not be created,
		 * but "Android"'s reference will be returned to the title object.
		 */

		String shade = new String("Shade");

		/*
		 * When we create a String object using new Keyword,
		 * JVM will create a new string object in normal(non pool) heap memory,
		 * and the literal "Shade" will be placed in the string constant pool.
		 * The variable s will refer to the object in heap(non pool).
		 */
	}
}