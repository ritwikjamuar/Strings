/**
 * This program is to demonstrate the use of Java SubStrings.
 *
 * A part of string is called substring.
 * In other words, substring is a subset of another string.
 * In case of substring startIndex is inclusive and endIndex is exclusive./
 *
 * To get a SubString from a String, substring() method is used.
 *
 * substring() method has two parameters:
 *          # public String substring ( int startIndex )
 *          # public String substring ( int startIndex, int endIndex )
 */

public class Strings4
{
	public static void main ( String[] args )
	{
		String str = "SachinTendulkar";

		String surName = str.substring ( 6 );

		/*
		 * In this case, the characters are taken from String Array index 6 to the last characters.
		 */

		String name = str.substring ( 0, 16 );

		/*
		 * In this case, the characters are taken from String Array index 0 to the index of 5th (6-1) characters.
		 */

		System.out.println ( "Name : " + name );
		System.out.println ( "SurName : " + surName );
	}
}