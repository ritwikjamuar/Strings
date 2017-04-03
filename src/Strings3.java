/**
 * This program is to demonstrate the Concatenation of Strings.
 *
 * There are two ways to concatenate the Strings:
 *      # Using + operator.
 *      # Using concat() method.
 */

public class Strings3
{
	public static void main ( String[] args )
	{
		/* Concatenation using + operator <---------------------------*/

		/*
		 * Strings can be concatenated using + operator,
		 * where JVM converts the resulting expression to
		 * instance of StringBuilder class.
		 */
		String str = "Alpha" + "Romeo";
		System.out.println ( str );

		/*
		 * For the above code, when we use the + operator,
		 * JVM converts that code to following:
		 * String str = ( new StringBuilder() ).append("Alpha").append(" Romeo").toString();
		 */

		/*
		 * Concatenation using + operator can also results in concatenation of primitive values.
		 * But once a string literal is encountered in the expression,
		 * all the + will be treated as string concatenation operator.
		 */
		String str2 = 20+40+"Buggati"+60+80;
		System.out.println ( str2 );

		/*
		 * In str2 expression, 20 and 40 are primitive values,
		 * and no String Literal has been encountered yet,
		 * so they will add up to 60.
		 *
		 * Now a String Literal "Buggati" has been encountered,
		 * so 60 and Buggati will concatenate.
		 *
		 * After Buggati, there are two primitive values,
		 * but they will not be added, instead they will be concatenated like Strings.
		  *
		  * So resulting String is 60Buggati6080.
		 */

		/* Concatenation using concat() method <---------------------------*/

		/*
		 * concat() method concatenates the specified string to the end of current string.
		 */

		String str3 = "Volks";
		String str4 = "wagen";
		str3 = str3.concat ( str4 );
		System.out.println ( str3 );
	}
}