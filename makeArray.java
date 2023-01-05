package encrypterProject;

import java.io.File;
import java.util.Scanner;

public class makeArray {
	public static Scanner input=new Scanner(System.in);
	// change this method to work with cypher class, creating array of key
	public  makeArray(String txt)
	{
		String[] cypherArray= new String[26];
		for(int i=0;i<=txt.length()-1;i++)
		{
			cypherArray[i]=txt.substring(i, i+1);
		}
	}
	public static String stringToArray (String input)
	{
	String[] names = new String[input.length()];

		for (int i = 0; i < input.length(); i++)
		{
			names[ i ] = input.substring(i, i+1);
		}
		/* return the array*/
		for (String values : names)
		{
			System.out.println(values); 
		}
		return input;
		}
	
	public static String textToString(String fileName) {
	    String temp = "";
	 
	    try {
	        Scanner input = new Scanner(new File(fileName));
	        while(input.hasNext()) {
	            temp += input;
	        }
	        input.close();
	    }
	    catch(Exception e){
	         System.out.println("Error reading or parsing text.txt\n" + e);
	    }
	    while(input.hasNext()){
	        temp = temp + input.next() + " ";
	      }
	    temp = cypher.removePunctuation(temp);
	      input.close();
	    return temp;
	}
	public String arrayToString(String[] txt)
	{
		String arString=txt.toString();
		if(arString.indexOf(",")>=0)
		{
			arString=arString.substring(0, arString.indexOf(","))+arString.substring(arString.indexOf(",")+1);
		}
		return arString;
	}
	}