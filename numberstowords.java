
import java.util.Scanner;
/**Program to convert numbers less than 1000 to words*/
public class NumbersToWords {
   
    public static final String[] digits = 
    {
    	"",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        
    };
    
    //array containing teens
    public static final String[] teens = 
    {
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };
    
    //array containing tens numbers
    public static final String[] tens = 
    {
        "ten",
        "twenty",
        "thirty",
        "forty",
        "fifty",
        "sixty",
        "seventy",
        "eighty",
        "ninety",
    };
    
    //string for hundreds numbers
    public static final String hundred = "hundred";  
    
    
    public static int tmpDigit,  //temp number to store digits
                      tmpTeen,  //temp to store teens numbers
                      tmpTen,  //temp number to store tens
                      number,  //number to be converted to words
                      result;  //result number to decide whether a num is teen or not
    public static boolean teen = false; 
                                                

    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        //getting user input
        System.out.print("Please enter a number: ");
        number = in.nextInt(); //number to be converted
        
        while(number <= 0)
        {
            System.out.println("Number should be greater than zero!");
            System.out.print("Please enter a number:");
            number = in.nextInt();
        }
        //converting single digits number
        if(number > 0 && number < 10)
        {
            result = number % 10;
            System.out.println(digits[result]);
        }
        //converting teen numbers
        if(number > 10 && number < 20)
        {
            result = number % 10;
            System.out.println(teens[result-1]);
        }
        //converting from 20 to 100 numbers
        if(number > 19 && number < 100)
        {
            result = number / 10; //finding tens
            System.out.print(tens[result-1]);
            
            number %= 10; //finding single digits
            System.out.println(digits[number]);
        }
        //converting from 101 to 999
        if(number > 100 && number < 1000)
        {
            result = number / 100; //getting hundreds
            //getting tens, and finding tens, and teens numbers
            tmpTen = number % 100;
            if(tmpTen > 1 && tmpTen < 20)//if teen 
            {
                tmpTeen = tmpTen % 10;
                teen = true; 
            }
            else //if not a teen split number
                tmpTen /= 10;
            //finding digits
            tmpDigit = number % 10;
            
            if(!teen)//if the final result doesn't include teen numbers print the following
                System.out.println(digits[result]+" "+hundred+" "+tens[tmpTen-1]+" "+digits[tmpDigit]);
            else
                System.out.println(digits[result]+" "+hundred+" "+teens[tmpTeen-1]);           
        }
           
              
    }
}
