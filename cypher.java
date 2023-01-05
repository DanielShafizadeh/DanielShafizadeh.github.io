package encrypterProject;
import java.util.Random;
import java.util.Scanner;
public class cypher {
	public static String cypherString;
	public static Scanner input=new Scanner(System.in);
	public static String txt=input.nextLine();
	public static String[] cypherArray=new String[26];
	public static String removePunctuation( String word )
	  {
	    while(word.length() > 0 && !Character.isLetterOrDigit(word.charAt(0)))
	    {
	      word = word.substring(1);
	    }
	    while(word.length() > 0 && !Character.isLetterOrDigit(word.charAt(word.length()-1)))
	    {
	      word = word.substring(0, word.length()-1);
	    }
	    
	    return word;
	  }
		// TODO Auto-generated constructor stub
	/*Random r = new Random();
	char c = (char)(r.nextInt(26) + 'a');*/
	//No inputs should be special characters, numbers or whitespace
	//@param: txt.length<=26
	static String[] plaintextList={"a","b","c","d","e","f","g","h","i","j","k,","l","m","n","o","p","q","s","t","u","v","w,","x","y","z"};
	static String[] encryptionList= {"i","k","j","u","n","a","p","h","y","f","x","g","s","l","t","q","o","r","m","e","b","c","w","v","d"};
	public static String cypherString(String txt) {
		/*insert methods that remove special characters, numbers, and whitespace 
		 * at the start of the string and array method*/
		//Needs to insert the modified input into the string then use random letters
	for(int i=0;i<=26-txt.length();i++)
	{
		int a=0;
		
		 while (a < 26) {
			 
	            // if the a-th element is txt.charAt(i)
	            // then append the character at that index
	            if (plaintextList[a] == txt.substring(i,i+1)) {
	            	cypherString+=encryptionList[a];
	            }
		 }
	            for(String character:encryptionList)
	            {/*use math.random here with a range of input length-1 to 26, perhaps with
	            	substrings*/
	            	if (!cypherString.contains(character))
	            	{
	            		cypherString+=character;
	            	}
	            }
	}
	return cypherString;
	}
public static String[] cypherArray(String txt) {
	int c=0;
		for(int i=0;i<=26-txt.length();i++)
		{
			int a=0;
			 while (a < 26) {
		            // if the a-th element is txt.charAt(i)
		            // then append the character at that index
		            if (plaintextList[a] == txt.substring(i,i+1)) {
		            	cypherArray[i]+=encryptionList[a];
		            }
			 }
		            for(String character:encryptionList)
		            {
		            	
		            	if (cypherArray[c]!=character)
		            	{
		            		//use math.random here with a range of input length-1 to 26, using unique characters each time
		            		cypherArray[(int)(Math.random() * (25-txt.length()) + txt.length())]=character;
		            	}
		            	c++;
		            }
		}
	return cypherArray;
}
}