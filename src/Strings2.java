/**
 * This program is to demonstrate the Comparison of String on the basis of Content and Reference./
 *
 * There are 3 ways to compare the String:
 *      # equals() method
 *      # == operator
 *      # compareTo() method
 */

public class Strings2
{
	public static void main ( String[] args )
	{
		/* Comparison using equals() method <---------------------------*/

		/*
		 * There are two variations of equals() method:
		 *      # equals() : Compares String to the Specified Object.
		 *      # equalsIgnoreCase() : Compares String to the Object while ignoring case.
		 */
		String one = "Lamborghini";
		String two = "Lamborghini";

		System.out.println ( "Is one and two equal : " + one.equals ( two ) );

		String three = "Aston";
		String four = "Martin";

		System.out.println ( "Is three and four equal : " + three.equals ( four ) );

		String five = "Buggati";
		String six = "bUGGATI";

		System.out.println ( "Is five and six equal : " + five.equalsIgnoreCase ( six ) );

		/* Comparison using == operator <---------------------------*/

		/*
		 * Using == compares the String using reference given by access from String Constant Pool.
		 */
		String alpha = "Alpha";
		String alpha2 = "rgrf";
		String alpha3 = new String("Alpha");

		System.out.println ( "Is alpha and alpha2 equal : " + ( alpha == alpha2 ) );
		System.out.println ( "Is alpha and alpha3 equal : " + ( alpha == alpha3 ) );

		/*
		 * Here, alpha and alpha2 is created using String Literal.
		 * And, alpha3 is created using new Keyword.
		 *
		 * Since alpha and alpha2 has same reference, so their comparison results in true boolean value.
		 * But, alpha and alpha3 has different reference, as alpha resides in String Constant Pool,
		 * while alpha3 resides in Heap Memory. So, their reference is not same.
		 */
	}
}