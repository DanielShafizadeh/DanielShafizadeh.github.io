package encrypterProject;
import java.io.File;
import java.util.Scanner;

public class encrypter
{
	public static Scanner input=new Scanner(System.in);
	public static String fileName = input.nextLine();
	public static String txt=input.nextLine();
	
	/** 
	   * Method to return a string containing all of the text in fileName (including punctuation), 
	   * with words separated by a single space 
	   * @param fileName - the name of the file containing the text to return
	   */


public static String  encryptString(String fileName)
{
	return cypher.cypherString(cypher.removePunctuation(makeArray.textToString(fileName)));
}
public static String[]  encryptArray(String fileName)
{
	return cypher.cypherArray(cypher.removePunctuation(makeArray.textToString(fileName)));
}
}