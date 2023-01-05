package encrypterProject;
import java.util.Scanner;
public class TheMain {
	/*static Scanner input= new Scanner(System.in);
	
	static String dec=input.nextLine();
	static String type=input.nextLine();
	static String txt=input.nextLine();*/
	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		System.out.println("Enter your desired text file to become a string.");
		String txt;
		txt=input.nextLine();
		System.out.println("Type d for decrypt or e for encrypt.");
		 String dec;
		dec=input.nextLine();
		System.out.println("Type a for array or s for string.");
		String type=input.nextLine();
		if(dec=="d")
		{
		if(type=="a")
		{
		 decrypt.plaintextArray(txt);
		}
		else if(type=="s")
		{
			decrypt.plaintextString(txt);
		}
		}
		else if(dec=="e")
		{
			if(type=="a")
			{
				txt=makeArray.stringToArray(txt);
				encrypter.encryptArray(txt);
			}
			else if(type=="s")
			{
				
				System.out.println(encrypter.encryptString(txt));
			}
		}
cypher.cypherArray(txt); 
input.close();
	}

}
