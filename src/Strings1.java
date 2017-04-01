/**
 * This program is to demonstrate how and why Strings are Immutable.
 * Immutable simply means unmodifiable or unchangeable.
 * Once string object is created its data or state can't be changed but a new string object is created.
 *
 * The reason that Java Strings are immutable is because Java uses the concept of String Literals.
 */

public class Strings1
{
	public static void main ( String[] args )
	{
		String text = "Computer";
		text.concat ( "Science" );

		System.out.println ( text );

		/*
		 * Printing of object text will result in "Computer", not "ComputerScience".
		 * This is because, text is referring to "Computer",
		 * even after the 'concat' method call.
		 * Also, calling 'concat' method will create a new entry "ComputerScience"
		 * to the String Constant Pool.
		 * Thus, printing text will always result in "Computer".
		 */

		String characters = "Artificial";
		characters = characters.concat ( "Intelligence" );

		System.out.println ( characters );

		/*
		 * Printing of object characters will result in "ArtificialIntelligence", not "Artificial".
		 * This is because, the reference point of characters has been changed
		 * from "Artificial" to "ArtificialIntelligence" in line 26.
		 */

		/*
		 * Suppose there are 5 reference variables, all refers to one object "Artificial".
		 * If one reference variable changes the value of the object,
		 * it will be affected to all the reference variables.
		 * That is why string objects are immutable in java.
		 */
	}
}