import java.util.Scanner;

public class CesarMethod {
	/*
	 * This program is will encrip
	 * */
	
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 int key;
		 char option;
		 String text;
		 
		// System.out.println("1. Dicoding test.");
		// System.out.println("2. Encoding test.");
		 //option = sc.nextInt();
		 
		 
		 
		 System.out.println("Write the text you need process: ");
		 text = sc.nextLine();
		 
		 System.out.println("Write the key to encrypt or decode your text: ");
		 key = sc.nextInt();
		 
		 System.out.println("Do you want to decode (D) or encrypt (E)?");
		 option = sc.next().charAt(0);
		 
		 System.out.println("you have wrote: " + text);
		 sc.close();
		 
		 if(option == 'E') 
		 {
		  System.out.println("your encripted text is: " + encodingtext(text,key));
		 }
	      
		if(option == 'D')
		{
		 System.out.println("your dicoiding text is: " + decodingtext(text, key));
	     }
	}	
	
    public static String encodingtext(String text, int key)
    {
    	StringBuilder encod = new StringBuilder();
    	
    	for(int i = 0; i< text.length();i++)
    	{
    	  encod.append((char)(text.charAt(i)+key%26));
    	}
    	
    	 return encod.toString();
    	
    }
    
    public static String decodingtext(String text, int key)
    {
    	StringBuilder dicod = new StringBuilder();
    	
    	for(int i = 0; i< text.length();i++)
    	{
    	  dicod.append((char)(text.charAt(i)-key%26));
    	}
    	
    	 return dicod.toString();
    }
    
}
