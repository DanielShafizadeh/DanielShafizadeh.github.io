package encrypterProject;
import java.util.Scanner;
public class decrypt
{
	static String[] plaintextList={"a","b","c","d","e","f","g","h","i","j","k,","l","m","n","o","p","q","s","t","u","v","w,","x","y","z"};
	static String[] encryptionList= {"i","k","j","u","n","a","p","h","y","f","x","g","s","l","t","q","o","r","m","e","b","c","w","v","d"};
	public static String plaintextString;
	public static Scanner input=new Scanner(System.in);
	public static String[] plaintextArray=new String[26];
	public static String plaintextString(String txt)
	{
		makeArray.textToString(txt);
		  cypher.removePunctuation(txt);


	for(int i=0;i<=26-txt.length();i++)
{
	int a=0;
	 while (a < 26) {
		 
            // if the a-th element is txt.charAt(i)
            // then append the character at that index
		 	
            if (encryptionList[a] == txt.substring(i,i+1)) {
            	plaintextString+=plaintextList[a];
            }
	 }
            for(String character:plaintextList)
            {/*use math.random here with a range of input length-1 to 26, perhaps with
            	substrings*/
            	if (!plaintextString.contains(character))
            	{
            		plaintextString+=character;
            	}
            }
            a++;
}
return plaintextString;
}
public static String[] plaintextArray(String txt) {
int c=0;
cypher.removePunctuation(txt);
	for(int i=0;i<=26-txt.length();i++)
	{int a=0;
		 while (a < 26) {
	            // if the a-th element is txt.charAt(i)
	            // then append the character at that index
	            if (encryptionList[a] == txt.substring(i,i+1)) {
	            	plaintextArray[i]+=encryptionList[a];
	            }
		 }
	            for(String character:encryptionList)
	            {
	            	
	            	if (plaintextArray[c]!=character)
	            	{
	            		//use math.random here with a range of input length-1 to 26, using unique characters each time
	            		plaintextArray[(int)(Math.random() * (25-txt.length()) + txt.length())]=character;
	            	}
	            	c++;
	            }
	}

return plaintextArray;
}
}