import java.util.Scanner;


public class Palindrome {

	/** To check if a string is a palindrome and to stop when GSCRnsit is entered*/
	
	public static void main(String args[]){
     while(1<2){
	 Scanner in=new Scanner(System.in);
     System.out.println("Enter a string");
     String a=in.nextLine();
     if(a.equals("GSCRnsit"))
    	 System.exit(1);
     else{
     StringBuffer str=new StringBuffer(a);
     StringBuffer str2=new StringBuffer(str.reverse());
     String s2=new String(str2);
           if(a.equals(s2))    
           System.out.println("It is a palindrome");
       else
           System.out.println("It is not a palindrome");
     }
     }
	}
}
	
