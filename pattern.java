


public class pattern {

	/** to print an inverted triangle*/
	
	public static void main(String agrs[]){
		int c = 2*8;
		for (int i = 7; i>=0; i--)
		{
		    for (int j = i; j < 8; j++)
		    {
		        System.out.print(" ");
		    }
		    for (int k = 1; k <= c; k++)
		    {
		        if (k % 2 == 0)
		        {
		            System.out.print(" ");
		        }
		        else
		        {
		            System.out.print("*");
		        }
		    }

		    System.out.println(" ");
		    c -= 2;
		} } }
